package com.eric_jhang.parkgarage.parking_garage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Eric_Jhang on 2015/12/21.
 */
public class MyDefineButton extends Button {
    private int resourceId = 0;
    private Bitmap bitmap;

    public MyDefineButton(Context context) {
        super(context,null);
    }

    public MyDefineButton(Context context,AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setClickable(true);
        resourceId = R.drawable.guide_map1;
        bitmap = BitmapFactory.decodeResource(getResources(), resourceId);
    }

    public void setIcon(int resourceId)
    {
        this.bitmap = BitmapFactory.decodeResource(getResources(), resourceId);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub

        // 圖片居中顯示
        int x = (this.getMeasuredWidth() - bitmap.getWidth())/2;
        int y = 0;
        canvas.drawBitmap(bitmap, x, y, null);
        // 座標需要轉換，因為預設情況下文字居中顯示
        // 讓文字在底部顯示
        canvas.translate(0,(this.getMeasuredHeight()/2) - (int) this.getTextSize());
        super.onDraw(canvas);
    }
}
