package com.example.along.gettingthingsdoneapp;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Long on 5/6/2017.
 */

public  class  AndTools {

    public static LinearLayout getVertLayout(Context context)
    {
        LinearLayout layout =  new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);
        return layout;
    }

    public static  LinearLayout getHorLayout(Context context)
    {
        LinearLayout layout =  new LinearLayout(context);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        return layout;
    }


    public static TextView getTextV(Context context, String a)
    {
        TextView tv = new TextView(context);
        tv.setText(a);
        return tv;
    }


}
