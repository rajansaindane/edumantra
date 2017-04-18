package com.srajan.edumantra;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.srajan.edumantra.Fragments.Fragment_article;

import java.util.ArrayList;

import static com.srajan.edumantra.BuildConfig.APPLICATION_ID;

public class HomeScreen extends AppCompatActivity {

    private static final String TAG = HomeScreen.class.getCanonicalName();
    private static final String CLIENT_ID = "1212";
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

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


//        ViewPager viewPager;
//
//        Slider slider;
//
//            viewPager = (ViewPager) findViewById(R.id.viewpager);
//            slider = new Slider(this);
//            viewPager.setAdapter(slider);



//        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
//        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
//
//        drawerLayout.addDrawerListener(actionBarDrawerToggle);
//        actionBarDrawerToggle.syncState();
//        NavigationView navigationView = (NavigationView) findViewById(R.id.navi);
//        navigationView.setNavigationItemSelectedListener(this);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imageView=(ImageView)findViewById(R.id.imgpath);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animZoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageView.startAnimation(animZoomin);

                new Handler().postDelayed(new Runnable() {

                    @Override
                            public void run(){
                    Intent intent = new Intent(HomeScreen.this, CareerPath.class);

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
                        Intent intent = new Intent(HomeScreen.this, Confused.class);

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
                        Intent intent = new Intent(HomeScreen.this, FAQ.class);

                        startActivity(intent);
                    }
                },700);
            }
        });
//        ImageView imagevideo=(ImageView)findViewById(R.id.imgvideo);
//        imagevideo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(HomeScreen.this,HomeScreen.class);
//                startActivity(intent);
//
//            }
//        });

//        drawerLayout.bringToFront();
//        drawerLayout.requestLayout();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

//        if(actionBarDrawerToggle.onOptionsItemSelected(item)) {
//           return true;
//        }

        if(item.getItemId()==R.id.action_Artical)
        {
            return true;
        }
        if (item.getItemId()==R.id.actionart)
        {

            Intent intent=new Intent(HomeScreen.this,Articales.class);
            startActivity(intent);

        }

        if (item.getItemId()==R.id.actionabt)
        {
            Toast.makeText(this,"hiii",Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId()==R.id.actionlg)
        {

            Intent intent=new Intent(HomeScreen.this,LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            HomeScreen.this.finish();



        }

        return super.onOptionsItemSelected(item);
        }

//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected( MenuItem item) {
//        int id=item.getItemId();
//        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
//        if (id==R.id.action_Artical)
//        {
//
//            Log.i(TAG,"error"+onNavigationItemSelected(item));
////            Intent i=new Intent(this,AfterScience.class);
////            startActivity(i);
//           fm.beginTransaction().replace(R.id.art,new Fragment_article()).commit();
//        }
//        else if (id==R.id.action_about)
//        {
//
//        }
//
//        else if (id==R.id.action_logout)
//        {
//
//        }
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mmain,menu);
        return true;
    }


}
