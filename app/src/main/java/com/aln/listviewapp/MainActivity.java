package com.aln.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String [] arr={"Brunei Darusalam","Cambodia","Indonesia","Laos","Malaysia",
            "Myanmar","Philippines","Singapor","Thailand","Vietnam"};
    ListView lst;
    ArrayAdapter adpt =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst =findViewById(R.id.lstitm);
       // adpt =new ArrayAdapter(this,R.layout.layouylist,R.id.tv2,arr);
        myAdapter myadpt =new myAdapter(MainActivity.this,arr,arr,arr);
        lst.setAdapter(myadpt);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str =arr[position].toString();
                Toast.makeText(getApplication(),str,Toast.LENGTH_LONG).show();
            }
        });
    }
}
