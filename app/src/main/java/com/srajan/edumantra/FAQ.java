package com.srajan.edumantra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class FAQ extends AppCompatActivity {

    TextView textView,textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        textView=(TextView)findViewById(R.id.txtfaq1);
        textView1=(TextView)findViewById(R.id.txtfaq2);
        textView2=(TextView)findViewById(R.id.txtfaq3);
        textView3=(TextView)findViewById(R.id.txtfaq4);
        textView4=(TextView)findViewById(R.id.txtfaq5);
        textView5=(TextView)findViewById(R.id.txtfaq6);

        textView.setText("1. What is CareerMitra ?");
        textView1.setText("2. How to use it ?");
        textView2.setText("3. What are the benefits for user ?");
        textView3.setText("4. How to switch from one field to another ?");
        textView4.setText("5. How to choose field and colleges ?");
        textView5.setText("6. How to download CareerMitra Application ?");



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();

        if(item.getItemId()== R.id.actionHome)
        {
            Intent intent=new Intent(FAQ.this,HomeScreen.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            FAQ.this.finish();
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

}
