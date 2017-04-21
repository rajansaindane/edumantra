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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        int[] images = {

                R.drawable.think,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.counselling,
                R.drawable.confused,
                R.drawable.faqq


        };

        ImageView imageVie = (ImageView) findViewById(R.id.imgh);
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


        ImageView imageView = (ImageView) findViewById(R.id.imgpath);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animZoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageView.startAnimation(animZoomin);

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Intent intent = new Intent(HomeScreen.this, CareerPath.class);

                        startActivity(intent);
                    }
                }, 700);


            }
        });

        ImageView imageView1 = (ImageView) findViewById(R.id.imgconfused);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animZoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageView1.startAnimation(animZoomin);
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Intent intent = new Intent(HomeScreen.this, Confused.class);

                        startActivity(intent);
                    }
                }, 700);
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.imgfaq);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animZoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageView2.startAnimation(animZoomin);
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Intent intent = new Intent(HomeScreen.this, FAQ.class);

                        startActivity(intent);
                    }
                }, 700);
            }
        });
        ImageView imageVideo = (ImageView) findViewById(R.id.imgvideo);
        imageVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animZoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageVideo.startAnimation(animZoomin);

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Intent intent = new Intent(HomeScreen.this, NavigationHome.class);

                        startActivity(intent);
                    }
                }, 700);


            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (item.getItemId() == R.id.action_Artical) {
            return true;
        }
        if (item.getItemId() == R.id.actionart) {

            Intent intent = new Intent(HomeScreen.this, Articales.class);
            startActivity(intent);

        }

        if (item.getItemId() == R.id.actionabt) {
            Toast.makeText(this, "hiii", Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId() == R.id.actionlg) {

            Intent intent = new Intent(HomeScreen.this, LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            HomeScreen.this.finish();


        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mmain, menu);
        return true;
    }


}
