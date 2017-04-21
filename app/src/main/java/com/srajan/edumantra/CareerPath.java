package com.srajan.edumantra;

import android.content.Intent;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.srajan.edumantra.Fragments.Fragment_article;

import static android.R.attr.pivotX;
import static android.R.attr.pivotY;

public class CareerPath extends AppCompatActivity {

    TextView sci,art,com,oth,compit,design,defence;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_path);

        sci=(TextView)findViewById(R.id.txtsci);
        art=(TextView)findViewById(R.id.txtarts);
        com=(TextView)findViewById(R.id.txtcomm);
        design=(TextView)findViewById(R.id.txtdesign);
        compit=(TextView)findViewById(R.id.txtcomp);
        oth=(TextView)findViewById(R.id.txtother);
        defence=(TextView)findViewById(R.id.txtdefence);

        Animation animZoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_career);
        sci.startAnimation(animZoomin);
        Animation animZoomin1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_career);
        art.startAnimation(animZoomin1);
        Animation animZoomin2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_career);
        com.startAnimation(animZoomin2);
        Animation animZoomin3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_career);
        design.startAnimation(animZoomin3);
        Animation animZoomin4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_career);
        compit.startAnimation(animZoomin4);
        Animation animZoomin5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_career);
        oth.startAnimation(animZoomin5);
        Animation animZoomin6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_career);
        defence.startAnimation(animZoomin6);

//        sci=(ImageView)findViewById(R.id.imgscience);
//        art=(ImageView)findViewById(R.id.imageView3);
//        com=(ImageView)findViewById(R.id.imgcom);
//        oth=(ImageView)findViewById(R.id.imageView2);
//        compit=(ImageView)findViewById(R.id.imgcompetative);
//        design=(ImageView)findViewById(R.id.imageView);

        sci.setOnClickListener(this::opensci);
        art.setOnClickListener(this::openarts);
        com.setOnClickListener(this::opencom);
        oth.setOnClickListener(this::openoth);
        compit.setOnClickListener(this::opencompit);
       design.setOnClickListener(this::opendesign);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imageView=(ImageView)findViewById(R.id.imageView3);
//        Matrix matrix = new Matrix();
//        imageView.setScaleType(ImageView.ScaleType.MATRIX);   //required
//        matrix.postRotate((float) 360, pivotX, pivotY);
//        imageView.setImageMatrix(matrix);

    }

    private void opendesign(View view) {

        Intent intent=new Intent(CareerPath.this,Designing.class);
        startActivity(intent);


    }

    private void opencompit(View view) {

        Intent intent=new Intent(CareerPath.this,Competative.class);
        startActivity(intent);

    }

    private void openoth(View view) {

        Intent intent=new Intent(CareerPath.this,Other.class);
        startActivity(intent);

    }

    private void opencom(View view) {

        Intent intent=new Intent(CareerPath.this,AfterCommerce.class);
        startActivity(intent);

    }

    private void openarts(View view) {
        Intent intent=new Intent(CareerPath.this,AfterArts.class);
        startActivity(intent);

    }

    private void opensci(View view) {

        Intent intent=new Intent(CareerPath.this,AfterScience.class);
        startActivity(intent);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        if(item.getItemId()== R.id.actionHome)
        {
            Intent intent=new Intent(CareerPath.this,NavigationHome.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            CareerPath.this.finish();
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
