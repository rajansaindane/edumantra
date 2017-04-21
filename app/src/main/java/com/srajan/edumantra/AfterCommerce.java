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
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.srajan.edumantra.Commerce.CourseAfterTwelveCommerece;
import com.srajan.edumantra.Commerce.CoursesAfterTenCommerece;
import com.srajan.edumantra.MainCourses.AfterTwelveList;

public class AfterCommerce extends AppCompatActivity {

    ImageView afterTen,afterTwelve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_commerce);
        showImage();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        afterTen=(ImageView)findViewById(R.id.imgaftertensci);
        afterTen.setOnClickListener(this::openTen);
        afterTwelve=(ImageView)findViewById(R.id.imagecommerecetwelve);
        afterTwelve.setOnClickListener(this::openTwelve);
    }

    private void openTwelve(View view) {

        Intent intent=new Intent(AfterCommerce.this,CourseAfterTwelveCommerece.class);
        startActivity(intent);

    }

    private void openTen(View view) {

        Intent intent=new Intent(AfterCommerce.this, CoursesAfterTenCommerece.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        if(item.getItemId()== R.id.actionHome)
        {
            Intent intent=new Intent(AfterCommerce.this,NavigationHome.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            AfterCommerce.this.finish();
        }

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public void showImage() {
        Dialog builder = new Dialog(this);
        builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
        builder.getWindow().setBackgroundDrawable(
                new ColorDrawable(android.graphics.Color.TRANSPARENT));
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {

            }
        });

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.index);
        builder.addContentView(imageView, new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        builder.show();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("http://www.srajan.in");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        final Handler handler  = new Handler();
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

//    private void showDialog()
//    {
//        ImageView img=new ImageView(this);
//        img.setImageResource(R.drawable.images);
//        AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.DialogTheme);
//        builder.setView(img);
//        builder.setCancelable(false);
//
//
//
////        builder.setPositiveButton("skip >>", new DialogInterface.OnClickListener()
////        {
////            public void onClick(DialogInterface dialog, int id)
////            {
////                dialog.dismiss();
////            }
////        });
//        AlertDialog alert = builder.create();
//        alert.show();
//        final Handler handler  = new Handler();
//        final Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                if (alert.isShowing()) {
//                    alert.dismiss();
//                }
//            }
//        };
//
//        alert.setOnDismissListener(new DialogInterface.OnDismissListener() {
//            @Override
//            public void onDismiss(DialogInterface dialog) {
//                handler.removeCallbacks(runnable);
//            }
//        });
//
//        handler.postDelayed(runnable, 3000);
//    }
}
