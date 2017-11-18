package com.example.ina97.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ina97 on 2017-11-13.
 */

public class diary_read extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary_read);

        ImageView b1 = (ImageView) findViewById(R.id.tab_diary);
        ImageView b2 = (ImageView) findViewById(R.id.tab_pic);
        ImageView b3 = (ImageView) findViewById(R.id.tab_letter);
        ImageView b4 = (ImageView) findViewById(R.id.tab_setting);

        ImageView img_w = (ImageView) findViewById(R.id.bu_write);
        ImageView img_d = (ImageView) findViewById(R.id.bu_delete);
        ImageView img_n = (ImageView) findViewById(R.id.bu_next);

        TextView date = (TextView) findViewById(R.id.d_date);
        TextView title = (TextView) findViewById(R.id.d_title);
        TextView con = (TextView) findViewById(R.id.d_con);
        con.setText(read_diary());

        /*
        Intent intent = new Intent(this.getIntent());
        ListView listView = (ListView)findViewById(R.id.lv);
        ArrayList<diary> d= new ArrayList<>();
        d_list_adapter da = new d_list_adapter(getApplicationContext(),listView,d);

        da.write(new diary(get_string("date"), get_string("title"), get_string("con")) );

        date.setText(getIntent().getStringExtra("date"));
        title.setText(get_string("title"));
        con.setText(get_string("con"));
 */

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diary_read.this, pic_list.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diary_read.this, letter_box.class);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diary_read.this, setting.class);
                startActivity(intent);
            }
        });

        img_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diary_read.this, diary_write.class);
                startActivity(intent);
            }
        });

        //listView.setAdapter(da);
    }

    public String read_diary() {
        String s = null;
        try {
            FileInputStream infile = openFileInput("diary.txt");
            byte[] txt = new byte[500];
            infile.read(txt);
            infile.close();
            s = new String(txt);
        }

        catch (IOException e) {
            s= "없어요";
        }
        return s;
    }
    public String get_string(String s){
        String string= getIntent().getStringExtra(s);
        return string;
    }

}
