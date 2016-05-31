package com.clwater.lib_schedule;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.renderscript.Type;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by yszsyf on 16/5/22.
 */
public class schedule  extends LinearLayout implements View.OnClickListener {

    private TextView return_this_week , title_this_week , title_choose_week;
    private TextView[] lib_edge;
    private LinearLayout lib_edge_lin;
    private int screen_width , screen_height , scree_height_dp;
    private Context context;
    private Activity activity;
    private LinearLayout[] lin_week  , lib_week;
    private TextView[][] main_week;

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
        scree_height_dp = screen_height /12;

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

        lin_week = new LinearLayout[8];
        ins_lib_linweek();
        set_linweek();


        lib_week = new LinearLayout[8];
        ins_lib_week();
        set_lib_week();

        main_week = new TextView[8][7];
        ins_main_week();
        set_main_week();

    }

    private void ins_lib_week() {
        lib_week[1] = (LinearLayout)findViewById(R.id.lib_week1);
        lib_week[2] = (LinearLayout)findViewById(R.id.lib_week2);
        lib_week[3] = (LinearLayout)findViewById(R.id.lib_week3);
    }

    private void set_lib_week() {
        for (int i = 1 ; i < 4 ; i ++){
            lib_week[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, screen_height / 16 ));
        }
    }

    private void set_main_week() {
        for (int i = 1 ; i < 2 ; i++ ){
            for (int j = 1 ; j < 7 ; j++){
              main_week[i][j].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, scree_height_dp * 2 ));
            }
        }
    }

    private void ins_main_week() {
        main_week[1][1] = (TextView) findViewById(R.id.week1_1);
        main_week[1][2] = (TextView) findViewById(R.id.week1_2);
        main_week[1][3] = (TextView) findViewById(R.id.week1_3);
        main_week[1][4] = (TextView) findViewById(R.id.week1_4);
        main_week[1][5] = (TextView) findViewById(R.id.week1_5);
        main_week[1][6] = (TextView) findViewById(R.id.week1_6);

    }

    private void set_linweek() {
        for (int i = 1 ; i < 4 ; i ++){
            lin_week[i].setLayoutParams(new LinearLayout.LayoutParams(screen_width / 4, LinearLayout.LayoutParams.WRAP_CONTENT ));
        }

    }

    private void ins_lib_linweek() {
        lin_week[1] = (LinearLayout) findViewById(R.id.week1);
        lin_week[2] = (LinearLayout) findViewById(R.id.week2);
        lin_week[3] = (LinearLayout) findViewById(R.id.week3);
    }

    private void set_lib_edge() {
        lib_edge[0].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, screen_height / 16 ));

        for (int i = 1 ; i <= 12 ; i++){
            lib_edge[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, scree_height_dp  ));
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
