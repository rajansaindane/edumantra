package com.srajan.edumantra;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Designing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designing2);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        Integer[] imageid =
                {

                        R.drawable.archi,
                        R.drawable.fashiondesign,
                        R.drawable.graphicdesign,
                        R.drawable.cinematographer,
                        R.drawable.interior,
                        R.drawable.finearts,
                        R.drawable.film

                };


        CustomGrid2 adapter = new CustomGrid2(Designing.this, imageid);

        gridView.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        if(item.getItemId()== R.id.actionHome)
        {
            Intent intent=new Intent(Designing.this,HomeScreen.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
          Designing.this.finish();
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

class CustomGrid2 extends BaseAdapter
{
    private Context mContext;

    public CustomGrid2(Context mContext, Integer[] imageid) {
        this.mContext = mContext;
        Imageid = imageid;
    }


    private final Integer[] Imageid;


    @Override
    public int getCount() {
        return Imageid.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        View grid;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            grid = new View(mContext);
            grid = inflater.inflate(R.layout.gridsingle, viewGroup, false);


        } else {
            grid = (View) convertView;
        }
        // TextView textView = (TextView) grid.findViewById(R.id.grid_text);
        ImageView imageView = (ImageView) grid.findViewById(R.id.grid_image);
        //textView.setText(HeadLines[position]);
        imageView.setImageResource(Imageid[position]);
        return grid;
    }
}
