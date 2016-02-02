package com.eric_jhang.parkgarage.parking_garage;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {


    MyDefineButton_Relative btnInfo1,btnguid1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnInfo1 = (MyDefineButton_Relative)findViewById(R.id.bt1);
        btnInfo1.setText("地圖導航");
        btnInfo1.setImgResource(R.drawable.guide_map1);
        btnInfo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Guid_Activity.class);
                startActivity(intent);


            }
        });
        btnguid1=(MyDefineButton_Relative)findViewById(R.id.btnguid1);
        btnguid1.setText("停車場資訊");
        btnguid1.setImgResource(R.drawable.parking);
        btnguid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, GuideListView.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public static String getMyName() {
        Class<?> myClass;
        String result="";
        try {
            myClass = Class.forName("Guid_Activity");
            Method getName = myClass.getDeclaredMethod("getName");
            result=getName.invoke(null).toString();
            return getName.invoke(null).toString();
        }
        catch (Exception e)
        {

        }
        return result;
    }



}
