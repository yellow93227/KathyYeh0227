package com.chatgpt.app.ex18;

import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;

public class ChatGPT01 {	
    public static void main(String[] args) throws Exception {

    	Scanner scn = new Scanner(System.in);
    	System.out.print("請輸入問題：");
        String prompt = scn.next();
        // 指定OpenAI API Key
        String apiKey = "ChatGPT API金鑰";
        // 建立 JSON 字串，同時設定輸入的參數與值，
        String jsonStr = "{" +
                "    \"prompt\": \"" + prompt + "\"," +
                "    \"temperature\": 0.5," +
                "    \"max_tokens\": 600," +
                "    \"top_p\": 1,\n" +
                "    \"frequency_penalty\": 0," +
                "    \"presence_penalty\": 0" +
                "}";
        // 設定 OpenAI API URL
        String API_URL = "https://api.openai.com/v1/engines/text-davinci-003/completions";
        // 設定傳送資料為JSON格式
        MediaType mediaType = MediaType.parse("application/json");    
        // 建立 RequestBody 物件，並將 JSON 字串傳入
        RequestBody body = RequestBody.create(mediaType, jsonStr);
        // 建立 Request 物件，並設定 URL、HTTP 方法、Headers 與傳送的資料
        Request request = new Request.Builder()
                .url(API_URL)
                .post(body)
                .addHeader("Authorization", "Bearer " + apiKey)
                .addHeader("Content-Type", "application/json")
                .build();
        // 建立 OkHttpClient 物件，並使用 Request 物件傳送請求
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        // 取得回應的 JSON 字串
        String responseBody = response.body().string();
        //System.out.println(responseBody);
        // 解析回應的 JSON 字串
        JSONObject jsonObject = new JSONObject(responseBody);
        // 取得回應中的 choices JSON 陣列
        JSONArray choicesArray = jsonObject.getJSONArray("choices");
        // 取得第一個選項的 text 屬性，即為 ChatGPT 回答的內容
        // 將回答內容指定給ans
        JSONObject firstChoice = choicesArray.getJSONObject(0);
        String ans = firstChoice.getString("text");
        // 印出 ChatGPT 回答的內容
        System.out.println(ans);
    }
}
