package com.srajan.edumantra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.srajan.edumantra.Domain.MainCourses;
import com.srajan.edumantra.Domain.ScienceAftTen;
import com.srajan.edumantra.Domain.Streams;
import com.srajan.edumantra.RequestQueue.WebService;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScienceAfterTen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_after_ten);

        get();
    }

    public void get() {

        Intent subintent=getIntent();
        int i =subintent.getIntExtra("srajan",0);

        if (i==1) {

            String url = "http://192.168.0.17:7878/srajancareer/scienceafterten/getlist/";


            WebService.q(this).add(new JsonObjectRequest(url,
                    this::Onsuccess, this::OnError) {

                @Override
                public Map<String, String> getHeaders() throws AuthFailureError {
                    Map<String, String> headers = new HashMap<>();
                    headers.put("Content-Type", "application/json");
                    headers.put("Accept", "application/json");
                    return headers;
                }
            });
        }
    }

    private void OnError(VolleyError volleyError) {
        Log.i("@srajan","volley error"+volleyError);
    }

    private void Onsuccess(JSONObject jsonObject) {

        Log.i("@srajan","scienceafterten"+jsonObject);

        Gson gson = new Gson();
      ScienceAftTen scienceAftTen = gson.fromJson(String.valueOf(jsonObject), ScienceAftTen.class);
//        updatejoke(scienceAftTen.getScienceafterten());
        Streams streams =gson.fromJson(String.valueOf(jsonObject),Streams.class);

//        updatejoke(streams.getStreamName());
    }



//    private void updatejoke(String streamName) {
//
//
////    private void updatejoke(ArrayList<String> ScienceaftTen) {
////        ArrayList<String> afterten = new ArrayList<>();
////
////        afterten.addAll(ScienceaftTen);
////        Log.i("@codekul", String.valueOf(afterten));
//        ArrayList<String>afterten
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, afterten);
//        ListView list = ((ListView) findViewById(R.id.listview));
//        list.setAdapter(adapter);
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//            }
//        });
//    }


}
