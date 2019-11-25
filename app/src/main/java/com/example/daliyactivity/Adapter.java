package com.example.daliyactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends ArrayAdapter {


    public Adapter(@NonNull Context context, ArrayList<value> data) {
        super(context, 0, data);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_design,parent,false);
        }

        value value = (value)getItem(position);
        TextView work = convertView.findViewById(R.id.work_view);
        TextView time = convertView.findViewById(R.id.time_view);
        TextView do_view = convertView.findViewById(R.id.do_view);

        work.setText(value.Work);
        time.setText(value.Time);
        do_view.setText(value.Do_view);

        return convertView;
    }
}

class value{
    String Work,Time,Do_view;
    public value(String work, String time, String do_view) {
        Work=work;
        Time=time;
        Do_view=do_view;
    }
}
