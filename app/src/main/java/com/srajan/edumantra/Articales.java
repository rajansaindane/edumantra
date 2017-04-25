package com.srajan.edumantra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Articales extends AppCompatActivity {

    TextView txt,txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articales);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txt=(TextView)findViewById(R.id.textView);
        txt1=(TextView)findViewById(R.id.textView1);
        txt2=(TextView)findViewById(R.id.textView2);
        txt3=(TextView)findViewById(R.id.textView3);

        txt.setOnClickListener(this::OpenWebArticle);
        txt1.setOnClickListener(this::openGraphicDesign);
        txt2.setOnClickListener(this::openGameCareer);
        txt3.setOnClickListener(this::openAnimation);
    }

    private void openAnimation(View view)
    {
        Intent intent=new Intent(Articales.this,Pdf.class);
        intent.putExtra("srajan",203);
        startActivity(intent);
    }

    private void openGameCareer(View view)
    {
        Intent intent=new Intent(Articales.this,Pdf.class);
        intent.putExtra("srajan",202);
        startActivity(intent);
    }

    private void openGraphicDesign(View view) {

        Intent intent=new Intent(Articales.this,Pdf.class);
        intent.putExtra("srajan",201);
        startActivity(intent);

    }

    private void OpenWebArticle(View view) {

        Intent intent=new Intent(Articales.this,Pdf.class);
        intent.putExtra("srajan",200);
        startActivity(intent);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();

        if(item.getItemId()== R.id.actionHome)
        {
            Intent intent=new Intent(Articales.this,NavigationHome.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            Articales.this.finish();
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
}
