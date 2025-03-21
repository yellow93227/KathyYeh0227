package com.chatgpt.app.ex18;

import okhttp3.*;
import javax.swing.*;
import org.json.JSONArray;
import org.json.JSONObject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatGPT02 extends JFrame {
	//宣告questionTextArea問題多行文字欄位
    private JTextArea questionTextArea;	
    //宣告answerTextArea回答多行文字欄位
    private JTextArea answerTextArea;	
    //建構式
    public ChatGPT02() {
        setTitle("ChatGPT聊天機器人");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 建立問題多行文字欄
        JLabel questionLabel = new JLabel("問題：");
        questionTextArea = new JTextArea(5, 30);
        questionTextArea.setLineWrap(true);
        JScrollPane questionScrollPane = new JScrollPane(questionTextArea);

        // 建立回答多行文字欄
        JLabel answerLabel = new JLabel("回答：");
        answerTextArea = new JTextArea(5, 30);
        answerTextArea.setLineWrap(true);
        answerTextArea.setEditable(false);
        JScrollPane answerScrollPane = new JScrollPane(answerTextArea);

        // 建立確定按鈕
        JButton confirmButton = new JButton("確定");
        // 當按鈕被按下時，將問題內容傳送給ChatGPT API
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)  {       
                OkHttpClient client = new OkHttpClient();
                String prompt = questionTextArea.getText(); //取得問題
                //ChatGPT API金鑰
                String apiKey = "ChatGPT API金鑰";
                //ChatGPT API服務端點(URL)
                String API_URL = "https://api.openai.com/v1/engines/text-davinci-003/completions";
                //指定ChatGPT API請求參數
                String jsonStr = "{" +
                        "    \"prompt\": \"" + prompt + "\"," +
                        "    \"temperature\": 0.5," +
                        "    \"max_tokens\": 600," +
                        "    \"top_p\": 1,\n" +
                        "    \"frequency_penalty\": 0," +
                        "    \"presence_penalty\": 0" +
                        "}";
                //指定傳送請求為JSON資料
                MediaType mediaType = MediaType.parse("application/json");
                RequestBody body = RequestBody.create(mediaType, jsonStr);
                //使用POST傳送方式
                Request request = new Request.Builder()
                        .url(API_URL)
                        .post(body)
                        .addHeader("Authorization", "Bearer " + apiKey)
                        .addHeader("Content-Type", "application/json")
                        .build();
                
                try {
                	//取得回應，並將ChatGPT回應內容顯示在answerTextArea回答多行文字欄中
                    Response response = client.newCall(request).execute();
                    String responseBody = response.body().string();  
                    JSONObject jsonObject = new JSONObject(responseBody); 
                    JSONArray choicesArray = jsonObject.getJSONArray("choices");
                    JSONObject firstChoice = choicesArray.getJSONObject(0);
                    String ans = firstChoice.getString("text");
                    answerTextArea.setText(ans);
                }catch(Exception ex) {
                	answerTextArea.setText("錯誤：" + ex.getMessage());
                }
            }
        });

        // 將所有欄位加入到視窗中
        JPanel panel = new JPanel();
        panel.add(questionLabel);
        panel.add(questionScrollPane);
        panel.add(answerLabel);
        panel.add(answerScrollPane);
        panel.add(confirmButton);
        add(panel);
        setBounds(300, 300, 400, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
    	//建立視窗程式
        ChatGPT02 example = new ChatGPT02();
    }
}
