package com.example.login_application;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void play(View v) {
        WebView webview = (WebView) findViewById(R.id.webView);
        webview.loadUrl("https://www.youtube.com/");
    }
    public void spotify(View v) {
        WebView webview = (WebView) findViewById(R.id.webView);
        webview.loadUrl("https://www.spotify.com/");
    }
    public void whatsapp(View v) {
        WebView webview = (WebView) findViewById(R.id.webView);
        webview.loadUrl("https://www.whatsapp.com/");
    }
   
}
