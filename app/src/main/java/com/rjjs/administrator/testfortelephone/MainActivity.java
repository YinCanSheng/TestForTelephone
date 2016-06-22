package com.rjjs.administrator.testfortelephone;

import android.app.ListActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.util.Map;

public class MainActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences phonenumSP = getSharedPreferences("in_phone_num", Context.MODE_PRIVATE);
        Map map = phonenumSP.getAll();
        Object[] array = map.keySet().toArray();
        Log.v("tag", map.toString() + map.size());
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array);

        setListAdapter(adapter);
    }
}
