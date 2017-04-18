package com.srajan.edumantra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Articales extends AppCompatActivity {

    TextView txt,txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articales);

        txt=(TextView)findViewById(R.id.textView);
        txt1=(TextView)findViewById(R.id.textView1);
        txt2=(TextView)findViewById(R.id.textView2);
        txt3=(TextView)findViewById(R.id.textView3);

        txt.setOnClickListener(this::OpenWebArticle);
    }

    private void OpenWebArticle(View view) {

        Intent intent=new Intent(Articales.this,Pdf.class);
        startActivity(intent);
    }
}
