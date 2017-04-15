package com.srajan.edumantra;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.srajan.edumantra.MainCourses.AfterTwelveList;
import com.srajan.edumantra.MainCourses.Common;

public class AfterScience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_science);

        showDialog();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView afterten = (ImageView) findViewById(R.id.imgaftertensci);
        ImageView aftertwelve = (ImageView) findViewById(R.id.imgaftertwale);

        afterten.setOnClickListener(this::openScienceAfterTen);
        aftertwelve.setOnClickListener(this::openScienceAfterTwelve);
//        afterten.setOnClickListener(view -> {
//            Intent intent=new Intent(AfterScience.this,ScienceAfterTen.class);
//           // intent.putExtra("srajan",1);
//            startActivity(intent);
//        });
//
    }

    private void openScienceAfterTwelve(View view) {
        Intent intent = new Intent(AfterScience.this, AfterTwelveList.class);
        startActivity(intent);
    }

    private void openScienceAfterTen(View view) {
        Intent intent = new Intent(AfterScience.this, Common.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        if (item.getItemId() == R.id.actionHome) {
            Intent intent = new Intent(AfterScience.this, HomeScreen.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            AfterScience.this.finish();
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    private void showDialog() {

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

        ImageView srajanimg = new ImageView(this);
        srajanimg.setImageResource(R.drawable.index);
        builder.addContentView(srajanimg, new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));


        builder.show();

        srajanimg.setOnClickListener(this::openAdvertise);
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Uri uri= Uri.parse("http://www.srajan.in");
//                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
//                startActivity(intent);
//            }
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
