package com.example.listviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AyushAdapter extends ArrayAdapter<String>{

    private String[] arr;
    private Context context;
    public AyushAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.context=context;
        this.arr=arr;
    }

    @Nullable
    @Override
    public String getItem(int position){
        return arr[position];
    }
    @Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.my_ayush_layout,parent,false);
        TextView t= convertView.findViewById(R.id.textView);
        // Before returning the viw, add click list
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You clicked on :"+position, Toast.LENGTH_SHORT).show();
            }
        });
        t.setText(getItem(position));
        return convertView;
    }
}
