package com.srajan.edumantra.Descriptions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.srajan.edumantra.Adapter.CustomListAdapterCTS;
import com.srajan.edumantra.Domain.CoursesAfterTen;
import com.srajan.edumantra.R;
import com.srajan.edumantra.RequestQueue.WebService;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        get();

    }


    private void get() {


        String url = "http://192.168.0.18:8787/mahacareer/maincourses/getDescription?classType=After Ten&courseName=MCVC";


        WebService.q(this).add(new StringRequest(url,
                this::onSuccess, this::onError));

    }

    private void onSuccess(String s) {
        Log.i("@srajan","json"+s);
    }


    private void onError(VolleyError error) {
        Log.i("@srajan","json"+error);
    }
}
