package com.example.simpleadapterex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Map<String,String>> mylist;
    SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lv = (ListView) findViewById(R.id.listView);
        mylist = new ArrayList<>();
        HashMap<String, String> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        HashMap<String, String> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        HashMap<String, String> m3 = new HashMap<>();
        m3.put("city", "台南");
        m3.put("code", "06");
        mylist.add(m1);
        mylist.add(m2);
        mylist.add(m3);

        simpleAdapter = new SimpleAdapter(this, mylist, android.R.layout.simple_list_item_2,
                new String[] {"city", "code"}, new int[] {android.R.id.text1, android.R.id.text2});
        lv.setAdapter(simpleAdapter);

    }
}
