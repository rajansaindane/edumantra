package com.srajan.edumantra.CoursesAfterTwelve;

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
import com.srajan.edumantra.Adapter.CustomListAdapterPcm;
import com.srajan.edumantra.Adapter.CustomListAdapterPcmb;
import com.srajan.edumantra.Adapter.CustomerListAdapterPcb;
import com.srajan.edumantra.AfterArts;
import com.srajan.edumantra.Descriptions.DescriptionActivity;
import com.srajan.edumantra.Domain.CoursesAfterTwelve;
import com.srajan.edumantra.HomeScreen;
import com.srajan.edumantra.MainCourses.AfterTwelveList;
import com.srajan.edumantra.NavigationHome;
import com.srajan.edumantra.R;
import com.srajan.edumantra.RequestQueue.WebService;

import java.util.ArrayList;
import java.util.List;

public class CoursesInPcb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_in_pcb);
       // get();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent subintent=getIntent();
        int i=subintent.getIntExtra("srajan",0);
        if(i==1)
        {
            get1();
        }
        if (i==2)
        {
            get();
        }
        if(i==3)
        {
            get2();
        }
        if(i==4)
        {
            get3();
        }

    }



    private void get3() {


        String url = "http://192.168.43.227:8787/mahacareer/coursesaftertwelve/58f1c6edf1233c4f93e61995";


        WebService.q(this).add(new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.i("@srajan", "json" + s);
                        Gson gson = new Gson();
                        CoursesAfterTwelve coursesAfterTwelve = gson.fromJson(s, CoursesAfterTwelve.class);
                        Log.i("@srajan", String.valueOf(coursesAfterTwelve));
                        updatejoke3(coursesAfterTwelve);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i("@srajan", "Error" + error);
            }
        }));

    }


    private void updatejoke3(CoursesAfterTwelve dEd) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        //  for (String coursesAfterTen : elevenTwelve.getElevenTwelve()) {
        jokes.addAll(dEd.getdEd());


        Log.i("@srajan", "arr" + jokes);
        CustomListAdapterPcmb adapter = new CustomListAdapterPcmb(this, jokes);
///        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);
        ListView list = ((ListView) findViewById(R.id.listpcb));
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",141);
                    startActivity(intent);
                }
            }
        });
    }

    private void get2() {

        String url = "http://192.168.43.227:8787/mahacareer/coursesaftertwelve/58f1c6c3f1233c4f93e61994";


        WebService.q(this).add(new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.i("@srajan", "json" + s);
                        Gson gson = new Gson();
                        CoursesAfterTwelve coursesAfterTwelve = gson.fromJson(s, CoursesAfterTwelve.class);
                        Log.i("@srajan", String.valueOf(coursesAfterTwelve));
                        updatejoke2(coursesAfterTwelve);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i("@srajan", "Error" + error);
            }
        }));

    }


    private void updatejoke2(CoursesAfterTwelve pcmb) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        //  for (String coursesAfterTen : elevenTwelve.getElevenTwelve()) {
        jokes.addAll(pcmb.getPcmb());


        Log.i("@srajan", "arr" + jokes);
        CustomListAdapterPcmb adapter = new CustomListAdapterPcmb(this, jokes);
////        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);
        ListView list = ((ListView) findViewById(R.id.listpcb));
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",136);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",137);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",138);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",139);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",140);
                    startActivity(intent);
                }
            }
        });


    }

    private void get() {


        String url = "http://192.168.43.227:8787/mahacareer/coursesaftertwelve/58f1c696f1233c4f93e61993";


        WebService.q(this).add(new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.i("@srajan", "json" + s);
                        Gson gson = new Gson();
                        CoursesAfterTwelve coursesAfterTwelve = gson.fromJson(s, CoursesAfterTwelve.class);
                        Log.i("@srajan", String.valueOf(coursesAfterTwelve));
                        updatejoke(coursesAfterTwelve);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i("@srajan", "Error" + error);
            }
        }));

    }


    private void updatejoke(CoursesAfterTwelve pcb) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        //  for (String coursesAfterTen : elevenTwelve.getElevenTwelve()) {
        jokes.addAll(pcb.getPcb());


        Log.i("@srajan", "arr" + jokes);
        CustomerListAdapterPcb adapter = new CustomerListAdapterPcb(this, jokes);
////        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);
        ListView list = ((ListView) findViewById(R.id.listpcb));
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",124);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",125);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",126);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",127);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",128);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",129);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",130);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",131);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",132);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",133);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",134);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",135);
                    startActivity(intent);
                }
            }
        });


    }

    private void get1() {


        String url = "http://192.168.43.227:8787/mahacareer/coursesaftertwelve/58f1c669f1233c4f93e61992";


        WebService.q(this).add(new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.i("@srajan", "json" + s);
                        Gson gson = new Gson();
                        CoursesAfterTwelve coursesAfterTwelve = gson.fromJson(s, CoursesAfterTwelve.class);
                        Log.i("@srajan", String.valueOf(coursesAfterTwelve));
                        updatejoke1(coursesAfterTwelve);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i("@srajan", "Error" + error);
            }
        }));

    }


    private void updatejoke1(CoursesAfterTwelve pcm) {

        List<String> jokes = new ArrayList<>();
//        ArrayList<String> jokes = new ArrayList<>();

        //  for (String coursesAfterTen : elevenTwelve.getElevenTwelve()) {
        jokes.addAll(pcm.getPcm());


        Log.i("@srajan", "arr" + jokes);
        CustomListAdapterPcm adapter = new CustomListAdapterPcm(this, jokes);
////        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, jokes);
        ListView list = ((ListView) findViewById(R.id.listpcb));
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",115);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",116);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",117);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",118);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",119);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",120);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",121);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",122);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(CoursesInPcb.this, DescriptionActivity.class);
                    intent.putExtra("srajan",123);
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
            Intent intent=new Intent(CoursesInPcb.this,NavigationHome.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            CoursesInPcb.this.finish();
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
