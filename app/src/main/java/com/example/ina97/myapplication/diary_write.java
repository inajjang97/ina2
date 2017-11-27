package com.example.ina97.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ina97 on 2017-11-13.
 */

public class diary_write extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary_write);

        ImageView b_done = (ImageView)findViewById(R.id.bu_write);
        ImageView b1 = (ImageView) findViewById(R.id.tab_diary);
        ImageView b2 = (ImageView) findViewById(R.id.tab_pic);
        ImageView b3 = (ImageView) findViewById(R.id.tab_letter);
        ImageView b4 = (ImageView) findViewById(R.id.tab_setting);
/*
        Intent intent = new Intent(this.getIntent());
        ListView listView = (ListView)findViewById(R.id.lv);
        ArrayList<diary> d= new ArrayList<>();
        final d_list_adapter da = new d_list_adapter(getApplicationContext(),listView,d);
*/
        b_done.setOnClickListener(new View.OnClickListener(){

            EditText et1 = (EditText) findViewById(R.id.edit_date);
            EditText et2 = (EditText) findViewById( R.id.edit_title);
            EditText et3 = (EditText) findViewById((R.id.edit_con));

            String date = et1.getText().toString();
            String title = et2.getText().toString();
            String con = et3.getText().toString();

            private  void getPreferences() {
                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                pref.getString("hoho","");
            }

            private  void savePreferences(){
                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("name", "Inna JJang");
                editor.commit();
            }
            @Override
            public void onClick(View v){

                try{
                    FileOutputStream file = openFileOutput("diary.txt", Context.MODE_PRIVATE);
                    file.write(date.getBytes());
                    file.write(title.getBytes());
                    file.write(con.getBytes());
                    file.close();
                }
                catch (IOException e) {
                }

                Intent newintent= new Intent(getApplicationContext(), diary_read.class);
                //newintent.putExtra("date", date);
                //newintent.putExtra("title", title);
                //newintent.putExtra("con", con);
                startActivity(newintent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diary_write.this, diary_read.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diary_write.this, pic_list.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diary_write.this, letter_box.class);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diary_write.this, setting.class);
                startActivity(intent);
            }
        });

    }

}
