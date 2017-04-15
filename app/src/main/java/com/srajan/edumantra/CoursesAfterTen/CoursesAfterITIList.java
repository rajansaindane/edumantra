package com.srajan.edumantra.CoursesAfterTen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.srajan.edumantra.Adapter.CustomListAdapterCITI;
import com.srajan.edumantra.Adapter.CustomListAdapterCTS;
import com.srajan.edumantra.Domain.CoursesAfterTen;
import com.srajan.edumantra.R;
import com.srajan.edumantra.RequestQueue.WebService;

import java.util.ArrayList;
import java.util.List;

public class CoursesAfterITIList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_after_itilist);

        get();

    }

    private void get() {


        String url = "http://192.168.43.227:7878/mahacareer/coursesafterten/58f0819dd3e2433a0c522b4e";


        WebService.q(this).add(new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.i("@srajan", "json" + s);
                        Gson gson = new Gson();
                        CoursesAfterTen coursesAfterTen = gson.fromJson(s, CoursesAfterTen.class);
                        Log.i("@srajan", String.valueOf(coursesAfterTen));
                        updatejoke(coursesAfterTen);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i("@srajan", "Error" + error);
            }
        }));

    }


    private void updatejoke(CoursesAfterTen iti) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        //  for (String coursesAfterTen : elevenTwelve.getElevenTwelve()) {
        jokes.addAll(iti.getIti());


        Log.i("@srajan", "arr" + jokes);
        CustomListAdapterCITI adapter = new CustomListAdapterCITI(this, jokes);
////        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);
        ListView list = ((ListView) findViewById(R.id.listCAI));
        list.setAdapter(adapter);

//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 0) {
//                    Intent intent = new Intent(CoursesAfterElevenList.this, HomeScreen.class);
//                    startActivity(intent);
//                }
//            }
//        });


    }


}
