package com.srajan.edumantra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.srajan.edumantra.Domain.AfterTen;
import com.srajan.edumantra.Domain.MainCourses;
import com.srajan.edumantra.Domain.ScienceAftTen;
import com.srajan.edumantra.Domain.Streams;
import com.srajan.edumantra.RequestQueue.WebService;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScienceAfterTen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_after_ten);

        get();
    }

    public void get() {



            String url = "http://192.168.2.5:7878/mahacareer/afterten/";


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


    private void OnError(VolleyError volleyError) {
        Log.i("@srajan", "volley error" + volleyError);
    }

    private void Onsuccess(JSONObject jsonObject) {

        Log.i("@srajan", "scienceafterten" + jsonObject);

//        Gson gson=new Gson();
//        AfterTen afterTen=gson.fromJson(String.valueOf(jsonObject),AfterTen.class);

//        ArrayList<String> list = new ArrayList<String>();
//        for(int i = 0; i < jsonObject.length(); i++) {
//            String arrayString = null;
//            try {
//                arrayString = jsonObject.getString(String.valueOf(i));
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            Log.d("notices", arrayString);
//            list .add(arrayString);
//
//
//        }
//
//
//        ArrayAdapter arrayList=new ArrayAdapter(this,android.R.layout.simple_list_item_1, (List) afterTen);
//        ListView listView=(ListView)findViewById(R.id.listview);
//        listView.setAdapter(arrayList);

    }


}
