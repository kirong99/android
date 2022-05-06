package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class picActivity extends AppCompatActivity {

    Integer[] id = {R.drawable.mypic1,R.drawable.mypic2,R.drawable.mypic3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);

        GridView gv = (GridView) findViewById(R.id.gv);
        MyGridViewAdapter adapter = new MyGridViewAdapter(this);
        gv.setAdapter(adapter);

    }

    public class MyGridViewAdapter extends BaseAdapter {
        Context context;
        public MyGridViewAdapter(Context con){
            context = con;
        }

        @Override
        public int getCount() {
            return id.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imgview = new ImageView(context);
            imgview.setLayoutParams(new ViewGroup.LayoutParams(300, 300));
            imgview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imgview.setPadding(5, 5, 5, 5);
            imgview.setImageResource(id[i]);
            return imgview;
        }
    }
}
