package com.clwater.lib_schedule;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.renderscript.Type;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by yszsyf on 16/5/22.
 */
public class schedule  extends LinearLayout implements View.OnClickListener {

    private TextView return_this_week , title_this_week , title_choose_week;
    private TextView[] lib_edge;
    private LinearLayout lib_edge_lin;
    private int screen_width , screen_height;
    private Context context;
    private Activity activity;

    public schedule(Context context) {
        super(context);

    }

    public schedule(Context context ,AttributeSet attrs){
        super(context , attrs);
        LayoutInflater.from(context).inflate(R.layout.schedule, this, true);
        this.context = context;
        this.activity = (Activity) this.context;

        get_screen();
        create();




    }

    private void get_screen() {
        WindowManager windowManager = activity.getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        screen_width  = display.getWidth();
        screen_height  = display.getHeight();

    }

    //组件对应xml
    private void create() {
        return_this_week = (TextView)findViewById(R.id.lib_return_now_week);
        return_this_week.setOnClickListener(this);

        title_this_week = (TextView)findViewById(R.id.lib_title_this_week);

        title_choose_week = (TextView)findViewById(R.id.lib_title_choose_week);
        title_choose_week.setOnClickListener(this);

        lib_edge_lin = (LinearLayout) findViewById(R.id.lib_edge);

        lib_edge = new TextView[13];
        ins_lib_edge();

        set_lib_edge();

    }

    private void set_lib_edge() {
        for (int i = 1 ; i <= 12 ; i++){
            lib_edge[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, screen_height / 12 ));
        }
    }

    private void ins_lib_edge() {
        lib_edge[0] = (TextView)findViewById(R.id.lib_edge_0);
        lib_edge[1] = (TextView)findViewById(R.id.lib_edge_1);
        lib_edge[2] = (TextView)findViewById(R.id.lib_edge_2);
        lib_edge[3] = (TextView)findViewById(R.id.lib_edge_3);
        lib_edge[4] = (TextView)findViewById(R.id.lib_edge_4);
        lib_edge[5] = (TextView)findViewById(R.id.lib_edge_5);
        lib_edge[6] = (TextView)findViewById(R.id.lib_edge_6);
        lib_edge[7] = (TextView)findViewById(R.id.lib_edge_7);
        lib_edge[8] = (TextView)findViewById(R.id.lib_edge_8);
        lib_edge[9] = (TextView)findViewById(R.id.lib_edge_9);
        lib_edge[10] = (TextView)findViewById(R.id.lib_edge_10);
        lib_edge[11] = (TextView)findViewById(R.id.lib_edge_11);
        lib_edge[12] = (TextView)findViewById(R.id.lib_edge_12);


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
