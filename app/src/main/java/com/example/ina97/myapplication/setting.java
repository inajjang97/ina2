package com.example.ina97.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by ina97 on 2017-11-13.
 */

public class setting extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.setting);


            ImageView b1 = (ImageView) findViewById(R.id.tab_diary);
            ImageView b2 = (ImageView) findViewById(R.id.tab_pic);
            ImageView b3 = (ImageView) findViewById(R.id.tab_letter);
            ImageView b4 = (ImageView) findViewById(R.id.tab_setting);


            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(setting.this, diary_read.class);
                    startActivity(intent);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(setting.this, pic_list.class);
                    startActivity(intent);
                }
            });

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(setting.this, letter_box.class);
                    startActivity(intent);
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(setting.this, setting.class);
                    startActivity(intent);
                }
            });
        }
}