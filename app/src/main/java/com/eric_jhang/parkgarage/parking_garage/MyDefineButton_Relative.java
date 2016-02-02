package com.eric_jhang.parkgarage.parking_garage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Eric_Jhang on 2015/12/21.
 */
public class MyDefineButton_Relative extends RelativeLayout{
    private ImageView imgView;
    private TextView textView;

    public MyDefineButton_Relative(Context context) {
        super(context,null);
    }

    public MyDefineButton_Relative(Context context,AttributeSet attributeSet) {
        super(context, attributeSet);

        LayoutInflater.from(context).inflate(R.layout.activity_img_text_bt, this, true);

        this.imgView = (ImageView)findViewById(R.id.imgview);
        this.textView = (TextView)findViewById(R.id.textview);
        this.textView.setTypeface(null, Typeface.BOLD);
        float spTextSize = 18;
        float textSize = spTextSize * getResources().getDisplayMetrics().scaledDensity;
        this.textView.setTextSize(textSize);
        this.textView.setTextColor(this.getResources().getColor(R.color.black));
        this.setClickable(true);
        this.setFocusable(true);
    }

    public void setImgResource(int resourceID) {
        this.imgView.setImageResource(resourceID);
    }

    public void setText(String text) {
        this.textView.setText(text);
    }

    public void setTextColor(int color) {
        this.textView.setTextColor(color);
    }

    public void setTextSize(float size) {
        this.textView.setTextSize(size);
    }


}
