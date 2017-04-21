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

        if (i == 1) {
            get();
        }
        if (i == 2) {
            get1();
        }
        if (i == 3) {
            get2();
        }
        if (i == 4) {
            get3();
        }
        if (i == 5) {
            get4();
        }
    }

    private void get() {


        String url = "http://192.168.0.18:8787/mahacareer/coursesafterten/58f0817cd3e2433a0c522b4d";


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
                    startActivity(intent);
                }
            }
        });


    }

    private void get1() {


        String url = "http://192.168.0.18:8787/mahacareer/coursesafterten/58f0819dd3e2433a0c522b4e";


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


    private void get2() {


        String url = "http://192.168.0.18:8787/mahacareer/coursesafterten/58f081b9d3e2433a0c522b4f";


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


    private void get3() {


        String url = "http://192.168.0.18:8787/mahacareer/coursesafterten/58f081d4d3e2433a0c522b50";


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

    private void get4() {


        String url = "http://192.168.0.18:8787/mahacareer/coursesafterten/58f081fbd3e2433a0c522b51";


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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        if(item.getItemId()== R.id.actionHome)
        {
            Intent intent=new Intent(CoursesAfterElevenList.this,NavigationHome.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            CoursesAfterElevenList.this.finish();
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