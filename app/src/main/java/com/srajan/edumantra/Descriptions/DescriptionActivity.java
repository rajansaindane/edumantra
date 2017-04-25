package com.srajan.edumantra.Descriptions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.srajan.edumantra.CoursesAfterTen.CoursesAfterElevenList;
import com.srajan.edumantra.Domain.Description;
import com.srajan.edumantra.Domain.DescriptionInfo;
import com.srajan.edumantra.NavigationHome;
import com.srajan.edumantra.R;
import com.srajan.edumantra.RequestQueue.WebService;

import java.util.ArrayList;
import java.util.List;

public class DescriptionActivity extends AppCompatActivity {

    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        gson = new Gson();

        Intent subintent = getIntent();
        int i = subintent.getIntExtra("srajan", 0);

        if (i == 1) {
            get();

        }
        if (i == 2) {
            get1();

        }

        //ITI Start

        if (i == 3) {
            get2();
        }
        if (i == 4) {
            get3();

        }
        if (i == 5) {
            get4();

        }
        if (i == 6) {
            get5();
        }
        if (i == 7) {
            get6();

        }
        if (i == 8) {
            get7();

        }
        if (i == 9) {
            get8();
        }
        if (i == 10) {
            get9();

        }
        if (i == 11) {
            get10();

        }
        if (i == 12) {
            get11();
        }
        if (i == 13) {
            get12();

        }
        if (i == 14) {
            get13();

        }
        if (i == 15) {
            get14();
        }
        if (i == 16) {
            get15();

        }
        if (i == 17) {
            get16();

        }
        if (i == 18) {
            get17();
        }
        if (i == 19) {
            get18();

        }
        if (i == 20) {
            get19();

        }
        if (i == 21) {
            get20();
        }
        if (i == 22) {
            get21();

        }
        if (i == 23) {
            get22();

        }
        if (i == 24) {
            get23();
        }
        if (i == 25) {
            get24();

        }
        if (i == 26) {
            get25();

        }
        if (i == 27) {
            get26();
        }
        if (i == 28) {
            get27();

        }
        if (i == 29) {
            get28();

        }
        if (i == 30) {
            get29();
        }
        if (i == 31) {
            get30();

        }
        if (i == 32) {
            get31();

        }
        if (i == 33) {
            get32();
        }
        if (i == 34) {
            get33();

        }
        if (i == 35) {
            get34();

        }
        if (i == 36) {
            get35();
        }
        if (i == 37) {
            get36();

        }
        if (i == 38) {
            get37();

        }
        if (i == 39) {
            get38();
        }
        if (i == 40) {
            get39();

        }
        if (i == 41) {
            get40();

        }
        if (i == 42) {
            get41();
        }
        if (i == 43) {
            get42();

        }
        if (i == 44) {
            get43();

        }
        if (i == 45) {
            get44();
        }
        if (i == 46) {
            get45();

        }
        if (i == 47) {
            get46();

        }
        if (i == 48) {
            get47();
        }
        if (i == 49) {
            get48();
        }
        if (i == 50) {
            get49();

        }
        if (i == 51) {
            get50();
        }
        if (i == 52) {
            get51();
        }

        //Diploma start

        if (i == 53) {
            get52();
        }
        if (i == 54) {
            get53();

        }
        if (i == 55) {
            get54();

        }
        if (i == 56) {
            get55();
        }
        if (i == 57) {
            get56();

        }
        if (i == 58) {
            get57();

        }
        if (i == 59) {
            get58();
        }
        if (i == 60) {
            get59();

        }
        if (i == 61) {
            get60();

        }
        if (i == 62) {
            get61();
        }
        if (i == 63) {
            get62();

        }
        if (i == 64) {
            get63();

        }
        if (i == 65) {
            get64();
        }
        if (i == 66) {
            get65();

        }
        if (i == 67) {
            get66();

        }
        if (i == 68) {
            get67();
        }
        if (i == 69) {
            get68();

        }
        if (i == 70) {
            get69();

        }
        if (i == 71) {
            get70();
        }
        if (i == 72) {
            get71();

        }
        if (i == 73) {
            get72();

        }
        if (i == 74) {
            get73();
        }
        if (i == 75) {
            get74();

        }
        if (i == 76) {
            get75();

        }
        if (i == 77) {
            get76();
        }
        if (i == 78) {
            get77();

        }
        if (i == 79) {
            get78();

        }
        if (i == 80) {
            get79();
        }


        //designing

        if (i == 91) {
            get91();
        }
        if (i == 92) {
            get92();
        }
        if (i == 93) {
            get93();
        }
        if (i == 94) {
            get94();
        }
        if (i == 95) {
            get95();
        }
        if (i == 96) {
            get96();
        }
        if (i == 97) {
            get97();
        }
        if (i == 98) {
            get98();
        }
        if (i == 99) {
            get99();
        }

        //Animation

        if (i == 100) {
            get100();
        }
        if (i == 101) {
            get101();
        }
        if (i == 102) {
            get102();
        }
        if (i == 103) {
            get103();
        }
        if (i == 104) {
            get104();
        }
        if (i == 105) {
            get105();
        }
        if (i == 106) {
            get106();
        }
        if (i == 107) {
            get107();
        }
        if (i == 108) {
            get108();
        }
        if (i == 109) {
            get109();
        }
        if (i == 110) {
            get110();
        }
        if (i == 111) {
            get111();
        }
        if (i == 112) {
            get112();
        }
        if (i == 113) {
            get113();
        }
        if (i == 114) {
            get114();
        }
 //pcm
        if (i == 115) {
            get115();
        }
        if (i == 116) {
            get116();
        }
        if (i == 117) {
            get117();
        }
        if (i == 118) {
            get118();
        }
        if (i == 119) {
            get119();
        }
        if (i == 120) {
            get120();
        }
        if (i == 121) {
            get121();
        }
        if (i == 122) {
            get122();
        }
        if (i == 123) {
            get123();
        }
   //pcb
        if (i == 124) {
            get124();
        }
        if (i == 125) {
            get125();
        }
        if (i == 126) {
            get126();
        }
        if (i == 127) {
            get127();
        }
        if (i == 128) {
            get128();
        }
        if (i == 129) {
            get129();
        }
        if (i == 130) {
            get130();
        }
        if (i == 131) {
            get131();
        }
        if (i == 132) {
            get132();
        }
        if (i == 133) {
            get133();
        }
        if (i == 134) {
            get134();
        }
        if (i == 135) {
            get135();
        }
  //pcmb
        if (i == 136) {
            get136();
        }
        if (i == 137) {
            get137();
        }
        if (i == 138) {
            get138();
        }
        if (i == 139) {
            get139();
        }
        if (i == 140) {
            get140();
        }
   //dEd
        if (i == 141) {
            get141();
        }
   //After Arts
        if (i == 142) {
            get142();
        }
        if (i == 143) {
            get143();
        }
        if (i == 144) {
            get144();
        }
        if (i == 145) {
            get145();
        }
        if (i == 146) {
            get146();
        }
        if (i == 147) {
            get147();
        }
        if (i == 148) {
            get148();
        }
        if (i == 149) {
            get149();
        }
        if (i == 150) {
            get150();
        }
        if (i == 151) {
            get151();
        }
        //After ten commerece
        if (i == 152) {
            get152();
        }
        if (i == 153) {
            get153();
        }
        if (i == 154) {
            get154();
        }
        if (i == 155) {
            get155();
        }
        if (i == 156) {
            get156();
        }
        //After twelve commerece
        if (i == 157) {
            get157();
        }
        if (i == 158) {
            get158();
        }
        if (i == 159) {
            get159();
        }
        if (i == 160) {
            get160();
        }
        if (i == 161) {
            get161();
        }
        if (i == 162) {
            get162();
        }
        if (i == 163) {
            get163();
        }
        if (i == 164) {
            get164();
        }
    }

    private void get() {


        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=MCVC",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get1() {


        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Plane%20Science",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show1(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show1(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    //ITI start here

    private void get2() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Electrician",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show2(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show2(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }


    private void get3() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Fitter",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show3(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show3(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }


    private void get4() {


        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Carpenter",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show4(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show4(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get5() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Foundry%20Man",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show5(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show5(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get6() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Book%20Binder",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show6(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show6(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get7() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Plumber",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show7(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show7(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get8() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Pattern%20Maker",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show8(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show8(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get9() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Mason%20Building%20Constructor",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show9(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show9(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get10() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Advanced%20Welding",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show10(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show10(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get11() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Wireman",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show11(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show11(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get12() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Sheet%20Metal%20Worker",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show12(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show12(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get13() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Tool%20and%20Die%20Maker",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show13(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show13(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get14() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Moulder",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show14(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show14(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get15() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Welder%20Gas%20and%20Electric",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show15(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show15(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get16() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Turner",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show16(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show16(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get17() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Advanced%20Tool%20and%20Die%20Making",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show17(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show17(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get18() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Painter%20General",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show18(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show18(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get19() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Machinist",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show19(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show19(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get20() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Draughtsman%20Mechanical",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show20(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show20(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get21() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Mechanic%20Machine%20Tools%20Maintenance",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show21(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show21(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get22() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Mechanic%20Computer%20Hardware",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show22(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show22(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get23() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Mechanic%20Refrigeration%20and%20Air%20Conditioner",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show23(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show23(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get24() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Mechanic%20Watch%20and%20Clock",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show24(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show24(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get25() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Mechanic%20Motor%20Vehicle",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show25(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show25(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get26() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Machine%20Tool%20Maintenance",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show26(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show26(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get27() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Mechanic%20Radio%20and%20Television",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show27(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show27(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get28() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Mechanic%20Diesel",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show28(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show28(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get29() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Instrument%20Mechanic",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show29(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show29(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get30() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Instrument%20Mechanic%20Chemical%20Plant",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show30(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show30(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get31() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Architectural%20Draughtsman%20ship",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show31(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show31(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get32() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Metrology%20and%20Engineering%20Inspection",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show32(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show32(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get33() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Electrical%20Maintenance",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show33(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show33(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get34() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Electroplater",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show34(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show34(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get35() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Computer%20Operator%20and%20Programming%20Assistant",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show35(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show35(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get36() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Advanced%20Electronics",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show36(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show36(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get37() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Electronic%20Mechanic",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show37(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show37(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get38() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Network%20Technician",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show38(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show38(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get39() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Pre%20Preparatory%20School%20Management%20Assistant",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show39(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show39(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get40() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Principles%20of%20Teaching",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show40(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show40(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get41() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Secretarial%20Practice",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show41(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show41(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get42() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Baker%20and%20Confectioner",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show42(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show42(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get43() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Cutting%20and%20Sewing",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show43(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show43(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get44() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Hair%20and%20Skin%20care",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show44(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show44(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get45() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Stenography%20English",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show45(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show45(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get46() {
        WebService.q(this).add(new StringRequest("http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=CAD%20CAM",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show46(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show46(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get47() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Desk%20Top%20Publishing%20Operator",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show47(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show47(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get48() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Interior%20Decoration%20and%20Designing",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show48(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show48(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get49() {
        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Heat%20Engine%20Automobile",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show49(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show49(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get50() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Driver%20Cum%20Mechanic%20Light%20Motor%20Vehicle",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show50(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show50(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get51() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Surveyor",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show51(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show51(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }


//Diploma start here

    private void get52() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Fine%20Arts",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show52(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show52(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get53() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Civil%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show53(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show53(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get54() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Electrical%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show54(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show54(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get55() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Computer%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show55(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show55(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get56() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Aeronautical%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show56(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show56(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get57() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Chemical%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show57(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show57(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get58() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Software%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show58(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show58(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get59() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Mining%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show59(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show59(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get60() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Petroleum%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show60(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show60(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get61() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Mechatronics",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show61(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show61(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get62() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Textile%20Technology",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show62(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show62(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get63() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Automobile%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show63(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show63(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get64() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Biomedical%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show64(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show64(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get65() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Elect.%20and%20Communication",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show65(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show65(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get66() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Environmental%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show66(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show66(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get67() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Fashion%20Technology",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show67(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show67(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get68() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Fire%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show68(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show68(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get69() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Architecture%20Engineering",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show69(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show69(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get70() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Ceramic%20Technology",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show70(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show70(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get71() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Rubber%20Technology",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show71(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show71(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get72() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Modern%20Office%20Practice",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show72(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show72(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get73() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Plastic%20Technology",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show73(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show73(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get74() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Business%20Administration",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show74(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show74(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get75() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Hotel%20Management%20and%20Catering%20Technology",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show75(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show75(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get76() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Agriculture",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show76(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show76(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get77() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Cyber%20Security",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show77(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show77(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get78() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Beauty%20Culture",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show78(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show78(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get79() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%203D%20Animation",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show79(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show79(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    //Designing start here

    private void get91() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Communication%20Design",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show91(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show91(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get92() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Costume%20Design",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show92(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show92(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get93() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Engineering%20Design",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show93(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show93(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get94() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Exhibition%20Design",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show94(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show94(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get95() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Industrial%20Design",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show95(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show95(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get96() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=%20Lighting%20design",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show96(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show96(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get97() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Product%20Design",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show97(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show97(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get98() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Service%20Design",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show98(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show98(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get99() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Fashion%20Design",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show99(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show99(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    //Animation start here

    private void get100() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Film%20Design%20in%20animation",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show100(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show100(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get101() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=AAIP%20in%20Animation",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show101(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show101(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get102() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=ANIMATION%20INTERNATIONAL%20PROGRAM%20%20in%20VFX",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show102(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show102(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get103() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=VFX%20PRO",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show103(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show103(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get104() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=B.SC%20in%20animation",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show104(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show104(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get105() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Bachelor%20of%20Fine%20Arts%20in%20Animation,%20Graphics%20and%20Web%20Design",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show105(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show105(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get106() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=BA%20in%20Animation%20and%20CG%20Arts",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show106(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show106(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get107() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=BA%20in%20Animation%20%26%20VFX",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show107(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show107(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get108() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=B.A%20(Digital%20Filmmaking%20%26%20Animation",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show108(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show108(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get109() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=B.Sc.Animation%20and%20VFX",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show109(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show109(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get110() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=B.Sc%20Animation%20and%20Gaming",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show110(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show110(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get111() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%203D%20Animation",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show111(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show111(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get112() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Graphic",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show112(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show112(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get113() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20Cartoon%20Animation",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show113(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show113(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get114() {

        WebService.q(this).add(new StringRequest(
                "http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Diploma%20in%20VFX",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show114(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show114(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    //pcm
    private void get115() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.E",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show115(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show115(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get116() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.TECH",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show116(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show116(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get117() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Arch",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show117(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show117(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get118() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Sc%20IT",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show118(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show118(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get119() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.C.A",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show119(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show119(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get120() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=N.D.A",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show120(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show120(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get121() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=Indian%20Defence",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show121(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show121(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get122() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.H.M.C.T%20%20%20Hotel%20Management",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show122(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show122(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get123() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=Film%20And%20Television%20Diploma",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show123(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show123(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    //pcb
    private void get124() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.H.M.S",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show124(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show124(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get125() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.V.SC",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show125(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show125(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get126() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=M.B.B.S",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show126(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show126(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get127() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Sc%20Nursing",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show127(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show127(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get128() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=Diploma%20in%20nursing%20Administration",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show128(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show128(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get129() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.M.L.T",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show129(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show129(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get130() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.D.S",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show130(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show130(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get131() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Sc%20Home%20Science",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show131(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show131(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get132() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Sc%20Microbiology",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show132(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show132(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get133() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Sc%20Chemitry",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show133(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show133(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get134() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Sc%20Zoology",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show134(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show134(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get135() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Sc%20Botany",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show135(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show135(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    //pcmb
    private void get136() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Sc",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show136(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show136(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get137() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Pharm",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show137(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show137(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get138() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Tech%20Agriculture",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show138(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show138(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get139() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.sc%20%20Agriculture",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show139(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show139(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get140() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.sc%20%20Biotechnologies",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show140(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show140(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    //dEd
    private void get141() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=D.Ed",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show141(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show141(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    //After 12th Arts

    private void get142() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.A",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show142(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show142(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get143() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=D.Ed",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show143(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show143(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get144() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.S.W",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show144(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show144(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get145() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=LLB(Foundation)",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show145(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show145(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get146() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=Fashion%20Designing%20Diploma",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show146(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show146(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get147() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=Interior%20Designing%20Diploma",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show147(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show147(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get148() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.B.A",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show148(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show148(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get149() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=Foreign%20Language%20Diploma",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show149(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show149(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get150() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=Call%20Center",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show150(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show150(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get151() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Arch.(12th%20math%20and%20english)",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show151(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show151(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    //commerece after 10

    private void get152() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Arch.(12th%20math%20and%20english)",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show152(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show152(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }

    private void get153() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Railway%20ticket%20collector/Clerk",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show153(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show153(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get154() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=LIC%20Agent",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show154(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show154(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get155() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=C.A%20Prepairation/Foundation",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show155(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show155(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get156() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Ten&courseName=Other%20Accounting%20Courses%20Like(Tally,MS-EXCEL)",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show156(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show156(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    //After twelve commerce
    private void get157() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Com",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show157(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show157(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get158() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.B.A",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show158(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show158(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get159() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.C.A(12th%20with%20math,english)",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show159(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show159(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get160() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=B.Arch(12th%20with%20math,english)",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show160(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show160(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get161() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=C.A(Foundation)",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show161(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show161(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get162() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=C.S(Foundation)",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show162(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show162(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get163() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=D.Ed",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show163(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show163(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }
    private void get164() {

        WebService.q(this).add(new StringRequest(
                " http://192.168.43.227:8787/mahacareer/maincourses/getDescription?classType=After%20Twelve&courseName=Call%20Center(Call%20Center%20Executive)",
                response -> {
                    Description description = gson.fromJson(response, Description.class);

                    // Log.i("@srajan", "-------------->"+des);
                    Log.i("@srajan", "json" + response);
                    show164(description);

                }, error -> Log.e("@srajan", "volley error " + error)));
    }


    private void show164(Description description) {

        ArrayList<String> detail = new ArrayList<>();
        for (DescriptionInfo info : description.getDescriptions()) {
            detail.add("CourseName : " + info.getCourseName());
            detail.add("\n\n" + "Dutation : " + info.getDuration());
            detail.add("\n\n" + "Description : " + info.getDescription());
            detail.add("\n\n" + "JobTitle : " + info.getJobTitle());
        }

        ((TextView) findViewById(R.id.txtdescription)).setText(detail.toString());

//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,detail);
//        ((ListView)findViewById(R.id.listdescription)).setAdapter(adapter);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        if (item.getItemId() == R.id.actionHome) {
            Intent intent = new Intent(DescriptionActivity.this, NavigationHome.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            DescriptionActivity.this.finish();
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
