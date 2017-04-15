package com.srajan.edumantra.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.srajan.edumantra.CoursesAfterTen.CoursesAfterITIList;
import com.srajan.edumantra.R;

import java.util.List;

/**
 * Created by rajan on 15/4/17.
 */

public class CustomListAdapterDiploma extends BaseAdapter {

    private Context coursesAfterDiplomaList;
    private List<String> jokes;
    private LayoutInflater inflator;

    public CustomListAdapterDiploma(Context coursesAfterDiplomaList, List<String> jokes) {
        this.coursesAfterDiplomaList = coursesAfterDiplomaList;
        this.jokes = jokes;
    }

    @Override
    public int getCount() {
        return jokes.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflator = (LayoutInflater) coursesAfterDiplomaList.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = null;
        if (convertView == null)
            view = inflator.inflate(R.layout.custom_list, parent, false);
        else view = convertView;


        ((TextView) view.findViewById(R.id.txtcustomlist))
                .setText(jokes.get(position));

        return view;

    }

}
