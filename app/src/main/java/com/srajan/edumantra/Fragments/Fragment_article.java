package com.srajan.edumantra.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srajan.edumantra.R;

/**
 * Created by rajan on 5/4/17.
 */

public class Fragment_article extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootview=inflater.inflate(R.layout.article,container,false);

        return rootview;
    }


}
