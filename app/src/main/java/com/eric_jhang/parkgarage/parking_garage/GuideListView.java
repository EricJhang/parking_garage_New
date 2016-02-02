package com.eric_jhang.parkgarage.parking_garage;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuideListView extends AppCompatActivity {
    private ListView item_list;
    private TextView show_app_name;


// 刪除原來的宣告
//private ArrayList<String> data = new ArrayList<>();
//private ArrayAdapter<String> adapter;

    // ListView使用的自定Adapter物件
    private ItemAdapter itemAdapter;
    // 儲存所有記事本的List物件
    private List<Item> items;

    // 選單項目物件
    private MenuItem add_item, search_item, revert_item, share_item, delete_item;

    // 已選擇項目數量
    private int selectedCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_list_view);
        processViews();
       // processControllers();

        // 刪除原來的程式碼
        //data.add("關於Android Tutorial的事情");
        //data.add("一隻非常可愛的小狗狗!");
        //data.add("一首非常好聽的音樂！");

        //int layoutId = android.R.layout.simple_list_item_1;
        //adapter = new ArrayAdapter<String>(this, layoutId, data);
        //item_list.setAdapter(adapter);

        // 加入範例資料
        items = new ArrayList<Item>();

        items.add(new Item(1, new Date().getTime(),  "關於Android Tutorial的事情.", "Hello content", "", 0, 0, 0));
        items.add(new Item(2, new Date().getTime(),  "一隻非常可愛的小狗狗!", "她的名字叫「大熱狗」，又叫\n作「奶嘴」，是一隻非常可愛\n的小狗。", "", 0, 0, 0));
        items.add(new Item(3, new Date().getTime(),  "一首非常好聽的音樂！", "Hello content", "", 0, 0, 0));

        // 建立自定Adapter物件
        itemAdapter = new ItemAdapter(this,R.layout.singleitem, items);
        item_list.setAdapter(itemAdapter);

    }

    private void processViews() {
        item_list = (ListView)findViewById(R.id.item_list);
        show_app_name = (TextView) findViewById(R.id.show_app_name);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_guide_list_view, menu);
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
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK) {
            // 讀取記事物件
            Item item = (Item) data.getExtras().getSerializable(
                    "com.eric_jhang.parkgarage.parking_garage.Item");

        }
    }

}
