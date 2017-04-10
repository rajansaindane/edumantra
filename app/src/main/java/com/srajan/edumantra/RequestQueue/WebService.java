package com.srajan.edumantra.RequestQueue;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by rajan on 24/3/17.
 */

public class WebService {

    private static RequestQueue queue;

    public static RequestQueue q(Context context){

        if (queue == null) queue= Volley.newRequestQueue(context);
        return queue;
    }
}
