package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adpterview extends BaseAdapter {

    Context ab;
    String abcd[];
    int a[];

    public adpterview(Context con,String arr[],int ar[]){
        ab = con;
        abcd = arr;
        a = ar;
    }
    @Override
    public int getCount() {
        return abcd.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(ab);
        view = layoutInflater.inflate(R.layout.listview,null);

        TextView text = view.findViewById(R.id.list);
        ImageView image = view.findViewById(R.id.imge);

        text.setText(abcd[i]);
        image.setImageResource(a[i]);

        return view;
    }
}
