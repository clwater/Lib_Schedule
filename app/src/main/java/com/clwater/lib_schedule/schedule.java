package com.clwater.lib_schedule;

import android.content.Context;
import android.content.res.TypedArray;
import android.renderscript.Type;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by yszsyf on 16/5/22.
 */
public class schedule  extends LinearLayout implements View.OnClickListener {

    private TextView return_this_week , title_this_week , title_choose_week;

    public schedule(Context context) {
        super(context);
    }

    public schedule(Context context ,AttributeSet attrs){
        super(context , attrs);
        LayoutInflater.from(context).inflate(R.layout.schedule, this, true);
        
        create();




    }

    //组件对应xml
    private void create() {
        return_this_week = (TextView)findViewById(R.id.lib_return_now_week);
        return_this_week.setOnClickListener(this);

        title_this_week = (TextView)findViewById(R.id.lib_title_this_week);

        title_choose_week = (TextView)findViewById(R.id.lib_title_choose_week);
        title_choose_week.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lib_return_now_week:
                break;
            case R.id.lib_title_choose_week:
                break;


        }

    }
}
