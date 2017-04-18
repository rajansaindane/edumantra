package com.srajan.edumantra;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.srajan.edumantra.Arts.CoursesAfterTenArts;

public class AfterArts extends AppCompatActivity {

    ImageView imageAfterTen,imageAfterTwelve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_arts);

        showImage();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageAfterTen=(ImageView)findViewById(R.id.imgaftertensci);
        imageAfterTen.setOnClickListener(this::openAfterTen);
    }

    private void openAfterTen(View view) {

        Intent intent=new Intent(AfterArts.this, CoursesAfterTenArts.class);
        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        if (item.getItemId() == R.id.action_settings) {
            Intent intent = new Intent(AfterArts.this, HomeScreen.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            AfterArts.this.finish();
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void showImage() {
        // String imageUri="https://www.google.co.in/imgres?imgurl=https%3A%2F%2Flh3.googleusercontent.com%2F0wEJdZZy5oQmlkuv1Dnrw8mTJ2ltjlCY_jt0PSC0tiC8PucgcB4HLHgtRsg6itRRpH4B%3Dw300&imgrefurl=https%3A%2F%2Fplay.google.com%2Fstore%2Fapps%2Fdetails%3Fid%3Dcom.srajan.rajan.srajan&docid=bsoi5JXRQ4abeM&tbnid=tyLM0ytEydGYZM%3A&vet=10ahUKEwjR0NyL2ILTAhVHUZQKHXs6BoIQMwgjKAcwBw..i&w=300&h=300&itg=1&bih=673&biw=1301&q=srajan%20college%20of%20design&ved=0ahUKEwjR0NyL2ILTAhVHUZQKHXs6BoIQMwgjKAcwBw&iact=mrc&uact=8";
        Dialog builder = new Dialog(this);
        builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
        builder.getWindow().setBackgroundDrawable(
                new ColorDrawable(android.graphics.Color.TRANSPARENT));
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                //nothing;
            }
        });

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.index);
        builder.addContentView(imageView, new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));


        builder.show();
        imageView.setOnClickListener(this::openAdvertise);
//        imageView.setOnClickListener(view -> {
//           Uri uri= Uri.parse("http://www.srajan.in");
//            Intent intent=new Intent(Intent.ACTION_VIEW,uri);
//            startActivity(intent);
//        });

        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (builder.isShowing()) {
                    builder.dismiss();
                }
            }
        };

        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                handler.removeCallbacks(runnable);
            }
        });

        handler.postDelayed(runnable, 5000);
    }

    private void openAdvertise(View view) {
        Uri uri = Uri.parse("http://www.srajan.in");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
