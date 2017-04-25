package com.srajan.edumantra.CoursesAfterTen;

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
import com.srajan.edumantra.Adapter.CustomListAdapterCITI;
import com.srajan.edumantra.Adapter.CustomListAdapterCTS;
import com.srajan.edumantra.Adapter.CustomListAdapterDesign;
import com.srajan.edumantra.Adapter.CustomListAdapterDiploma;
import com.srajan.edumantra.Adapter.CustomlistAdapter;
import com.srajan.edumantra.Descriptions.DescriptionActivity;
import com.srajan.edumantra.Domain.AfterTen;
import com.srajan.edumantra.Domain.AfterTenInfo;
import com.srajan.edumantra.Domain.CoursesAfterTen;
import com.srajan.edumantra.HomeScreen;
import com.srajan.edumantra.MainCourses.AfterTwelveList;
import com.srajan.edumantra.MainCourses.Common;
import com.srajan.edumantra.NavigationHome;
import com.srajan.edumantra.R;
import com.srajan.edumantra.RequestQueue.WebService;

import java.util.ArrayList;
import java.util.List;

public class CoursesAfterElevenList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_after_ten_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent subintent = getIntent();
        int i = subintent.getIntExtra("srajan", 0);
//11&12
        if (i == 1) {
            get();
        }
//iti
        if (i == 2) {
            get1();
        }
//diploma
        if (i == 3) {
            get2();
        }
//designing
        if (i == 4) {
            get3();
        }
//animation
        if (i == 5) {
            get4();
        }
    }
//11&12
    private void get() {


        String url = "http://192.168.43.227:8787/mahacareer/coursesafterten/58f0817cd3e2433a0c522b4d";


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


    private void updatejoke(CoursesAfterTen elevenTwelve) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        //  for (String coursesAfterTen : elevenTwelve.getElevenTwelve()) {
        jokes.addAll(elevenTwelve.getElevenTwelve());


        Log.i("@srajan", "arr" + jokes);
        CustomListAdapterCTS adapter = new CustomListAdapterCTS(this, jokes);
////        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);
        ListView list = ((ListView) findViewById(R.id.listCAT));
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 1);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 2);
                    startActivity(intent);
                }
            }
        });


    }
//iti
    private void get1() {


        String url = "http://192.168.43.227:8787/mahacareer/coursesafterten/58f0819dd3e2433a0c522b4e";


        WebService.q(this).add(new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.i("@srajan", "json" + s);
                        Gson gson = new Gson();
                        CoursesAfterTen coursesAfterTen = gson.fromJson(s, CoursesAfterTen.class);
                        Log.i("@srajan", String.valueOf(coursesAfterTen));
                        updatejoke1(coursesAfterTen);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i("@srajan", "Error" + error);
            }
        }));

    }


    private void updatejoke1(CoursesAfterTen iti) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        //  for (String coursesAfterTen : elevenTwelve.getElevenTwelve()) {
        jokes.addAll(iti.getIti());


        Log.i("@srajan", "arr" + jokes);
        CustomListAdapterCITI adapter = new CustomListAdapterCITI(this, jokes);
////        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);
        ListView list = ((ListView) findViewById(R.id.listCAT));
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 3);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 4);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 5);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 6);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 7);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 8);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 9);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 10);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 11);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 12);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 13);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 14);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 15);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 16);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 17);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 18);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 19);
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 20);
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 21);
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 22);
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 23);
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 24);
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 25);
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 26);
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 27);
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 28);
                    startActivity(intent);
                }
                if (position == 26) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 29);
                    startActivity(intent);
                }
                if (position == 27) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 30);
                    startActivity(intent);
                }
                if (position == 28) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 31);
                    startActivity(intent);
                }
                if (position == 29) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 32);
                    startActivity(intent);
                }
                if (position == 30) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 33);
                    startActivity(intent);
                }
                if (position == 31) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 34);
                    startActivity(intent);
                }
                if (position == 32) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 35);
                    startActivity(intent);
                }
                if (position == 33) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 36);
                    startActivity(intent);
                }
                if (position == 35) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 37);
                    startActivity(intent);
                }
                if (position == 36) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 38);
                    startActivity(intent);
                }
                if (position == 37) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 39);
                    startActivity(intent);
                }
                if (position == 38) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 40);
                    startActivity(intent);
                }
                if (position == 39) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 41);
                    startActivity(intent);
                }
                if (position == 40) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 42);
                    startActivity(intent);
                }
                if (position == 41) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 43);
                    startActivity(intent);
                }
                if (position == 42) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 44);
                    startActivity(intent);
                }
                if (position == 43) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 45);
                    startActivity(intent);
                }
                if (position == 44) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 46);
                    startActivity(intent);
                }
                if (position == 45) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 47);
                    startActivity(intent);
                }
                if (position == 46) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 48);
                    startActivity(intent);
                }
                if (position == 47) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 49);
                    startActivity(intent);
                }
                if (position == 48) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 50);
                    startActivity(intent);
                }
                if (position == 49) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 51);
                    startActivity(intent);
                }
                if (position == 50) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 52);
                    startActivity(intent);
                }
            }
        });
    }
//diploma
    private void get2() {


        String url = "http://192.168.43.227:8787/mahacareer/coursesafterten/58f081b9d3e2433a0c522b4f";


        WebService.q(this).add(new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.i("@srajan", "json" + s);
                        Gson gson = new Gson();
                        CoursesAfterTen coursesAfterTen = gson.fromJson(s, CoursesAfterTen.class);
                        Log.i("@srajan", String.valueOf(coursesAfterTen));
                        updatejoke2(coursesAfterTen);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i("@srajan", "Error" + error);
            }
        }));

    }


    private void updatejoke2(CoursesAfterTen diploma) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        //  for (String coursesAfterTen : elevenTwelve.getElevenTwelve()) {
        jokes.addAll(diploma.getDiploma());


        Log.i("@srajan", "arr" + jokes);
        CustomListAdapterDiploma adapter = new CustomListAdapterDiploma(this, jokes);
////        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);
        ListView list = ((ListView) findViewById(R.id.listCAT));
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 53);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 54);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 55);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 56);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 57);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 58);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 59);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 60);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 61);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 62);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 63);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 64);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 65);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 66);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 67);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 68);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 69);
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 70);
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 71);
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 72);
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 73);
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 74);
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 75);
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 76);
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 77);
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 78);
                    startActivity(intent);
                }
                if (position == 26) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 79);
                    startActivity(intent);
                }
                if (position == 27) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 80);
                    startActivity(intent);
                }


            }
        });


    }
    //designing
    private void get3() {


        String url = "http://192.168.43.227:8787/mahacareer/coursesafterten/58f081d4d3e2433a0c522b50";


        WebService.q(this).add(new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.i("@srajan", "json" + s);
                        Gson gson = new Gson();
                        CoursesAfterTen coursesAfterTen = gson.fromJson(s, CoursesAfterTen.class);
                        Log.i("@srajan", String.valueOf(coursesAfterTen));
                        updatejoke3(coursesAfterTen);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i("@srajan", "Error" + error);
            }
        }));

    }


    private void updatejoke3(CoursesAfterTen designing) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        //  for (String coursesAfterTen : elevenTwelve.getElevenTwelve()) {
        jokes.addAll(designing.getDesigning());


        Log.i("@srajan", "arr" + jokes);
        CustomListAdapterDesign adapter = new CustomListAdapterDesign(this, jokes);
////        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);
        ListView list = ((ListView) findViewById(R.id.listCAT));
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 91);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 92);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 93);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 94);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 95);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 96);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 97);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 98);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 99);
                    startActivity(intent);
                }

            }
        });


    }
//Animation
    private void get4() {


        String url = "http://192.168.43.227:8787/mahacareer/coursesafterten/58f081fbd3e2433a0c522b51";


        WebService.q(this).add(new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.i("@srajan", "json" + s);
                        Gson gson = new Gson();
                        CoursesAfterTen coursesAfterTen = gson.fromJson(s, CoursesAfterTen.class);
                        Log.i("@srajan", String.valueOf(coursesAfterTen));
                        updatejoke4(coursesAfterTen);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i("@srajan", "Error" + error);
            }
        }));

    }


    private void updatejoke4(CoursesAfterTen animation) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        //  for (String coursesAfterTen : elevenTwelve.getElevenTwelve()) {
        jokes.addAll(animation.getAnimation());


        Log.i("@srajan", "arr" + jokes);
        CustomListAdapterDesign adapter = new CustomListAdapterDesign(this, jokes);
////        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);
        ListView list = ((ListView) findViewById(R.id.listCAT));
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 100);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 101);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 102);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 103);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 104);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 105);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 106);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 107);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 108);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 109);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 110);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 111);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 112);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 113);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(CoursesAfterElevenList.this, DescriptionActivity.class);
                    intent.putExtra("srajan", 114);
                    startActivity(intent);
                }
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        if (item.getItemId() == R.id.actionHome) {
            Intent intent = new Intent(CoursesAfterElevenList.this, NavigationHome.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            CoursesAfterElevenList.this.finish();
        }

        if (item.getItemId() == R.id.action_Artical) {
//            android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
//            fm.beginTransaction().replace(R.id.art,new Fragment_article()).commit();
            Toast.makeText(this, "hiii", Toast.LENGTH_SHORT).show();

        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}