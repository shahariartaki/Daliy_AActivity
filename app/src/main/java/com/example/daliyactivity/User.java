package com.example.daliyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.HashMap;

public class User extends AppCompatActivity {
    HashMap<Integer, ArrayList<String>> AllData;
    ArrayList<String> singleData;
    int i=0;
    Button save,Show;
    TextInputEditText work,time;
    CheckBox dolater,doright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        save=findViewById(R.id.save);
        Show=findViewById(R.id.show);
        work=findViewById(R.id.work);
        time=findViewById(R.id.time);
        doright=findViewById(R.id.do_right);
        dolater=findViewById(R.id.do_latter);
        AllData = new HashMap<Integer, ArrayList<String>>();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                singleData =new ArrayList<>();
                singleData.add(work.getText().toString());
                singleData.add(time.getText().toString());
                singleData.add(doright.getText().toString());
                singleData.add(dolater.getText().toString());
                AllData.put(i,singleData);
                Log.e("AllData",AllData.toString());
                i++;

                Toast.makeText(getApplicationContext(),"Successfully Saved Your Data",Toast.LENGTH_SHORT).show();

            }
        });

        Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this,List.class);
                intent.putExtra("AllData",AllData);
                startActivity(intent);
            }
        });
    }
}
