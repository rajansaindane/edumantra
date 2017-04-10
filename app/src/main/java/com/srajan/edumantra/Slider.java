package com.srajan.edumantra;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by rajan on 10/4/17.
 */

public class Slider extends PagerAdapter {

    private Context context;

    public Slider(Context context) {
        this.context = context;

    }
    int[] images={

            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,


    };

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View item_view;

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        item_view = inflater.inflate(R.layout.swap, container, false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.imgswiper);
        imageView.setImageResource(images[position]);
        container.addView(item_view);


        return item_view;

    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout) object);
    }

}
