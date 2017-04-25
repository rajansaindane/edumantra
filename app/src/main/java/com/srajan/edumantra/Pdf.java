package com.srajan.edumantra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdf extends AppCompatActivity {

    // PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        Intent subintent = getIntent();
        int i = subintent.getIntExtra("srajan", 0);

        if (i == 200) {
            getWeb();
        }
        if (i == 201) {
            getGraphic();
        }
        if (i == 202) {
            getGaming();
        }
        if (i == 203) {
            getAnimation();
        }
//        pdfView=(PDFView)findViewById(R.id.webpdf);
//        pdfView.fromAsset("websemina.pdf").load();
    }

    private void getAnimation() {
        WebView webView = (WebView) findViewById(R.id.webarticle);
        webView.loadUrl("file:///android_asset/Animation.html");
        webView.setBackgroundResource(R.drawable.background);
        webView.setBackgroundColor(0x00000000);
    }

    private void getGaming() {
        WebView webView = (WebView) findViewById(R.id.webarticle);
        webView.loadUrl("file:///android_asset/Gaming.html");
        webView.setBackgroundResource(R.drawable.background);
        webView.setBackgroundColor(0x00000000);
    }

    private void getGraphic() {
        WebView webView = (WebView) findViewById(R.id.webarticle);
        webView.loadUrl("file:///android_asset/graphicDesignArticle.html");
        webView.setBackgroundResource(R.drawable.background);
        webView.setBackgroundColor(0x00000000);
    }

    private void getWeb() {
        WebView webView = (WebView) findViewById(R.id.webarticle);
        webView.loadUrl("file:///android_asset/webArticle.html");
        webView.setBackgroundResource(R.drawable.background);
        webView.setBackgroundColor(0x00000000);
    }
}
