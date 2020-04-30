package com.liuxe.gaokaoass.http;

import com.orhanobut.logger.Logger;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

public class LoggingInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        //这个chain里面包含了request和response，所以你要什么都可以从这里拿
        Request request = chain.request();
        long t1 = System.nanoTime();//请求发起的时间
        String method = request.method();
        JSONObject jsonObject = new JSONObject();
        if ("POST" == method || "PUT" == method) {
            if (request.body() instanceof FormBody) {
                FormBody body = (FormBody)(request.body());
                if (body != null) {
                    for (int i=0;i<body.size();i++) {

                        try {
                            jsonObject.put(body.name(i), body.encodedValue(i));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }
                Logger.e( String.format("发送请求 %s on %s  %nRequestParams:%s%nMethod:%s",
                        request.url(), chain.connection(), jsonObject.toString(), request.method()));
            } else {
                Buffer buffer = new Buffer();
                RequestBody requestBody = request.body();
                if (requestBody != null) {
                    request.body().writeTo(buffer);
                    String body = buffer.readUtf8();
                    Logger.e( String.format("发送请求 %s on %s  %nRequestParams:%s%nMethod:%s",
                            request.url(), chain.connection(), body, request.method()));
                }
            }
        } else {
            Logger.e( String.format("发送请求 %s on %s%nMethod:%s",
                    request.url(), chain.connection(), request.method()));
        }
        Response response = chain.proceed(request);
        long t2 = System.nanoTime();//收到响应的时间
        ResponseBody responseBody = response.peekBody((1024 * 1024));
        Logger.e(String.format("Retrofit接收响应: %s %n返回json:%s %n耗时：%.1fms",
//                        response.request().url(),
                        "",
                        responseBody.string(),
                        (t2 - t1) / 1e6
                ));
        return response;
    }
}
