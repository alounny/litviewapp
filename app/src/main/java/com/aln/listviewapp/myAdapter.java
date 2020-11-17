package com.aln.listviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class myAdapter extends ArrayAdapter<String> {
    String [] str1;
    String [] str2;
    String [] str3;
    Context context;

    public myAdapter(@NonNull Context context, String [] arr1, String [] arr2, String [] arr3) {
       super(context,R.layout.layouylist);
        this.context =context;
        this.str1 =arr1;
        this.str2 =arr2;
        this.str3=arr3;
    }

    @Override
    public int getCount() {
        return str1.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View v, @NonNull ViewGroup parent) {
        ControlTextView ctv =new ControlTextView();
        if(v==null){
            LayoutInflater inflat = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v =inflat.inflate(R.layout.layouylist,parent,false);
            ctv.tv1 =v.findViewById(R.id.tv1);
            ctv.tv2 =v.findViewById(R.id.tv2);
            ctv.tv3 =v.findViewById(R.id.tv3);
            v.setTag(ctv);

        }else{
            ctv =(ControlTextView)v.getTag();
        }
        ctv.tv1.setText(str1[position]);
        ctv.tv2.setText(str2[position]);
        ctv.tv3.setText(str3[position]);


        return v;
    }
    static class ControlTextView{
        TextView tv1;
        TextView tv2;
        TextView tv3;

    }
}
