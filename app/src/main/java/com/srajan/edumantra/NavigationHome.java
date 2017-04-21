package com.srajan.edumantra;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class NavigationHome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_home);


        int[] images={

                R.drawable.think,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.counselling,
                R.drawable.confused,
                R.drawable.faqq



        };

        ImageView imageVie=(ImageView)findViewById(R.id.imgh);
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int i = 0;

            public void run() {
                imageVie.setImageResource(images[i]);
                i++;
                if (i > images.length - 1) {
                    i = 0;
                }
                handler.postDelayed(this, 3000);
            }
        };
        handler.postDelayed(runnable, 3000);

        ImageView imageView=(ImageView)findViewById(R.id.imgpath);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animZoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageView.startAnimation(animZoomin);

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run(){
                        Intent intent = new Intent(NavigationHome.this, CareerPath.class);

                        startActivity(intent);
                    }
                },700);


            }
        });

        ImageView imageView1=(ImageView)findViewById(R.id.imgconfused);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animZoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageView1.startAnimation(animZoomin);
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run(){
                        Intent intent = new Intent(NavigationHome.this, Confused.class);

                        startActivity(intent);
                    }
                },700);
            }
        });

        ImageView imageView2=(ImageView)findViewById(R.id.imgfaq);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animZoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageView2.startAnimation(animZoomin);
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run(){
                        Intent intent = new Intent(NavigationHome.this, FAQ.class);

                        startActivity(intent);
                    }
                },700);
            }
        });
        ImageView imageVideo=(ImageView)findViewById(R.id.imgvideo);
        imageVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animZoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageVideo.startAnimation(animZoomin);

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run(){
                        Intent intent = new Intent(NavigationHome.this, NavigationHome.class);

                        startActivity(intent);
                    }
                },700);


            }
        });




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

            Intent intent=new Intent(NavigationHome.this,Articales.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Toast.makeText(this,"hiii",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_slideshow) {

            Intent intent=new Intent(NavigationHome.this,LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            NavigationHome.this.finish();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
