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

public class Other extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        Integer[] imageid =
                {

                        R.drawable.aroma,
                        R.drawable.choreo,
                        R.drawable.emm,
                        R.drawable.airh,
                        R.drawable.deff,
                        R.drawable.tnt,
                        R.drawable.mnc,
                        R.drawable.pg,
                        R.drawable.nda,
                        R.drawable.clientserviceexecutive,
                        R.drawable.tarotreader,
                        R.drawable.shef,
                        R.drawable.riekipracti,
                        R.drawable.radiojockey,
                        R.drawable.publicreltion,
                        R.drawable.mediaplanner,
                        R.drawable.makeupartist,
                        R.drawable.journalist,
                        R.drawable.iafairman,
                        R.drawable.filmeiting,
                        R.drawable.cosmetologist,
                        R.drawable.copywriter,
                        R.drawable.cinematographer,
                        R.drawable.callcentre,
                        R.drawable.beautycare,
                        R.drawable.actor,




                };


        CustomGrid1 adapter = new CustomGrid1(Other.this, imageid);

        gridView.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        if(item.getItemId()== R.id.actionHome)
        {
            Intent intent=new Intent(Other.this,NavigationHome.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            Other.this.finish();
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

 class CustomGrid1 extends BaseAdapter
{
    private Context mContext;

    public CustomGrid1(Context mContext, Integer[] imageid) {
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
            grid = inflater.inflate(R.layout.singlegridother, viewGroup, false);


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
