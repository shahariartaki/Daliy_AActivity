package com.example.daliyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class List extends AppCompatActivity {
    HashMap<Integer, ArrayList<String>> AllData;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView=findViewById(R.id.listview);
        AllData= (HashMap<Integer,ArrayList<String>>)getIntent().getSerializableExtra("AllData");
        //Intent intent =getIntent();
        ArrayList<value> SingleData= new ArrayList<>();
        for (int i=0;i<AllData.size();i++){
            ArrayList<String> temp=AllData.get(i);
            String Name=temp.get(0);
            String Age=temp.get(1);
            String Nationlity=temp.get(2);
            SingleData.add(new value(Name,Age,Nationlity));
        }
        Adapter addapter = new Adapter(List.this,SingleData);
        listView.setAdapter(addapter);
    }
}
