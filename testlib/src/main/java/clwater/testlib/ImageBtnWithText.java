package clwater.testlib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by yszsyf on 16/5/21.
 */
public class ImageBtnWithText extends LinearLayout {

    public ImageBtnWithText(Context context) {
        this(context, null);
    }

    public ImageBtnWithText(Context context, AttributeSet attrs) {
        super(context, attrs);
        //在构造函数中将Xml中定义的布局解析出来。
        LayoutInflater.from(context).inflate(R.layout.imagebtn_with_text, this, true);
    }

    
}
