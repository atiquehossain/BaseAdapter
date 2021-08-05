package com.example.baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    String []bikename={"Kawasiki","BMW","TVS"};
    int [] bikepicture={R.drawable.kaw,R.drawable.bmw,R.drawable.tvs};
    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyCustomBaseAdapter myCustomBaseAdapter
                =new MyCustomBaseAdapter(this,bikename,bikepicture);

        gridView=findViewById(R.id.gridview);
        gridView.setAdapter(myCustomBaseAdapter);



    }
}