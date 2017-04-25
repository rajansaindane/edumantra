package com.srajan.edumantra.Commerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.srajan.edumantra.Adapter.CustomListAdapterTS;
import com.srajan.edumantra.Descriptions.DescriptionActivity;
import com.srajan.edumantra.Domain.AfterTwelve;
import com.srajan.edumantra.Domain.AfterTwelveInfo;
import com.srajan.edumantra.R;
import com.srajan.edumantra.RequestQueue.WebService;

import java.util.ArrayList;
import java.util.List;

public class CourseAfterTwelveCommerece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_after_twelve_commerece);
        getCommerce();
    }

    private void getCommerce() {

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


    private void updatejoke(AfterTwelveInfo afterTwelveCommerece) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        for (AfterTwelve after : afterTwelveCommerece.getAftertwelve()) {
            jokes.addAll(after.getAfterTwelveCommerce());
        }

        Log.i("@srajan", String.valueOf(jokes));

        CustomListAdapterTS adapter = new CustomListAdapterTS(this, jokes);

        //  ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);

        ListView list = ((ListView) findViewById(R.id.listTwelveCommerece));
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Intent intent=new Intent(CourseAfterTwelveCommerece.this, DescriptionActivity.class);
                    intent.putExtra("srajan",157);
                    startActivity(intent);
                }
                if (position==1)
                {
                    Intent intent=new Intent(CourseAfterTwelveCommerece.this, DescriptionActivity.class);
                    intent.putExtra("srajan",158);
                    startActivity(intent);
                }
                if (position==2)
                {
                    Intent intent=new Intent(CourseAfterTwelveCommerece.this, DescriptionActivity.class);
                    intent.putExtra("srajan",159);
                    startActivity(intent);
                }
                if (position==3)
                {
                    Intent intent=new Intent(CourseAfterTwelveCommerece.this, DescriptionActivity.class);
                    intent.putExtra("srajan",160);
                    startActivity(intent);
                }
                if (position==4)
                {
                    Intent intent=new Intent(CourseAfterTwelveCommerece.this, DescriptionActivity.class);
                    intent.putExtra("srajan",161);
                    startActivity(intent);
                }
                if (position==5)
                {
                    Intent intent=new Intent(CourseAfterTwelveCommerece.this, DescriptionActivity.class);
                    intent.putExtra("srajan",162);
                    startActivity(intent);
                }
                if (position==6)
                {
                    Intent intent=new Intent(CourseAfterTwelveCommerece.this, DescriptionActivity.class);
                    intent.putExtra("srajan",163);
                    startActivity(intent);
                }
                if (position==7)
                {
                    Intent intent=new Intent(CourseAfterTwelveCommerece.this, DescriptionActivity.class);
                    intent.putExtra("srajan",164);
                    startActivity(intent);
                }
            }
        });

    }

}
