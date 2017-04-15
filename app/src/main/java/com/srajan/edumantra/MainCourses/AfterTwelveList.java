package com.srajan.edumantra.MainCourses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.srajan.edumantra.Adapter.CustomListAdapterTS;
import com.srajan.edumantra.Adapter.CustomlistAdapter;
import com.srajan.edumantra.Domain.AfterTen;
import com.srajan.edumantra.Domain.AfterTenInfo;
import com.srajan.edumantra.Domain.AfterTwelve;
import com.srajan.edumantra.Domain.AfterTwelveInfo;
import com.srajan.edumantra.R;
import com.srajan.edumantra.RequestQueue.WebService;

import java.util.ArrayList;
import java.util.List;

public class AfterTwelveList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_twelve_list);

        get();
    }
    private void get() {



        String url = "http://192.168.43.227:7878/mahacareer/aftertwelve/getListAfterTwelve";


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


    private void updatejoke(AfterTwelveInfo mainCourseName) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        for (AfterTwelve after : mainCourseName.getAftertwelve()) {
            jokes.addAll(after.getMainCourseName());
        }

        Log.i("@srajan", String.valueOf(jokes));

        CustomListAdapterTS adapter = new CustomListAdapterTS(this,jokes);

      //  ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);

        ListView list = ((ListView) findViewById(R.id.twelvelist));
        list.setAdapter(adapter);




    }

}
