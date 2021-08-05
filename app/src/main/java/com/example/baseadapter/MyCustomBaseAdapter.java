package com.example.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCustomBaseAdapter extends BaseAdapter {
    View view;
    ImageView imageView;
    TextView textView;
    Context context;
    String []bike;
    int [] bikeimg;

    public MyCustomBaseAdapter(Context context, String[] bike, int[] bikeimg) {
        this.context = context;
        this.bike = bike;
        this.bikeimg = bikeimg;
    }
    @Override
    public int getCount() {
        return bike.length;
    }
    @Override
    public Object getItem(int i) {
        return bikeimg.length;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view=layoutInflater.inflate(R.layout.layouttwo,null);

        imageView=(ImageView)view.findViewById(R.id.imageview);
        textView=(TextView) view.findViewById(R.id.textview);


        imageView.setImageResource((bikeimg[i]));
        textView.setText(bike[i]);


        return view;


    }
}
