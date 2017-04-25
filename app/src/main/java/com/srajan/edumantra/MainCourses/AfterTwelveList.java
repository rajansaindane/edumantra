package com.srajan.edumantra.MainCourses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.srajan.edumantra.Adapter.CustomListAdapterTS;
import com.srajan.edumantra.CareerPath;
import com.srajan.edumantra.CoursesAfterTwelve.CoursesInPcb;
import com.srajan.edumantra.Domain.AfterTwelve;
import com.srajan.edumantra.Domain.AfterTwelveInfo;
import com.srajan.edumantra.HomeScreen;
import com.srajan.edumantra.NavigationHome;
import com.srajan.edumantra.R;
import com.srajan.edumantra.RequestQueue.WebService;

import java.util.ArrayList;
import java.util.List;

public class AfterTwelveList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_twelve_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        get();

    }







    private void get() {



        String url = "http://192.168.43.227:8787/mahacareer/aftertwelve/getListAfterTwelve";


        WebService.q(this).add(new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.i("@srajan", "json" + s);
                        Gson gson = new Gson();
                        AfterTwelveInfo afterTwelveInfo = gson.fromJson(s, AfterTwelveInfo.class);
                        Log.i("@srajan", String.valueOf(afterTwelveInfo));
                        updatejoke(afterTwelveInfo);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i("@srajan", "Error" + error);
            }
        }));

    }


    private void updatejoke(AfterTwelveInfo afterTwelveScience) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        for (AfterTwelve after : afterTwelveScience.getAftertwelve()) {
            jokes.addAll(after.getAfterTwelveScience());
        }

        Log.i("@srajan", String.valueOf(jokes));

        CustomListAdapterTS adapter = new CustomListAdapterTS(this,jokes);

      //  ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);

        ListView list = ((ListView) findViewById(R.id.twelvelist));
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Intent intent=new Intent(AfterTwelveList.this, CoursesInPcb.class);
                    intent.putExtra("srajan",1);
                    startActivity(intent);
                }
                if (position==1)
                {
                    Intent intent=new Intent(AfterTwelveList.this, CoursesInPcb.class);
                    intent.putExtra("srajan",2);
                    startActivity(intent);
                }
                if (position==2)
                {
                    Intent intent=new Intent(AfterTwelveList.this, CoursesInPcb.class);
                    intent.putExtra("srajan",3);
                    startActivity(intent);
                }
                if (position==3)
                {
                    Intent intent=new Intent(AfterTwelveList.this, CoursesInPcb.class);
                    intent.putExtra("srajan",4);
                    startActivity(intent);
                }
            }
        });



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        if(item.getItemId()== R.id.actionHome)
        {
            Intent intent=new Intent(AfterTwelveList.this,NavigationHome.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            AfterTwelveList.this.finish();
        }

        if(item.getItemId()==R.id.action_Artical)
        {
//            android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
//            fm.beginTransaction().replace(R.id.art,new Fragment_article()).commit();
            Toast.makeText(this,"hiii",Toast.LENGTH_SHORT).show();

        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

}
