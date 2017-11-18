package com.example.ina97.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ina97 on 2017-11-17.
 */

public class d_list_adapter extends BaseAdapter {
    Context context;
    ListView listView;
    ArrayList <diary> d;

    public d_list_adapter(Context c, ListView l, ArrayList <diary>d ){
        this.context=c;
        this.listView=l;
        this.d=d;
    }

    @Override
    public int getCount() {
        return d.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.diary_content,null);
        TextView date = (TextView)convertView.findViewById(R.id.d_date);
        TextView title = (TextView)convertView.findViewById(R.id.d_title);
        TextView con = (TextView)convertView.findViewById(R.id.d_con);

        date.setText(d.get(position).getDate());
        title.setText(d.get(position).getTitle());
        con.setText(d.get(position).getCon());
        return convertView;
    }

    public void write(diary diary){
        d.add(diary);
    }

    public void delete_d(){
        listView.setAdapter(new d_list_adapter(context,listView,d));
        listView.setSelection(d.size()-1);
    }


}
