package com.example.ina97.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by ina97 on 2017-11-13.
 */

public class letter_box extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.letter_box);

            ImageView b_write = (ImageView) findViewById(R.id.bu_write);
            ImageView b_read = (ImageView) findViewById(R.id.bu_read);

            ImageView b1 = (ImageView) findViewById(R.id.tab_diary);
            ImageView b2 = (ImageView) findViewById(R.id.tab_pic);
            ImageView b3 = (ImageView) findViewById(R.id.tab_letter);
            ImageView b4 = (ImageView) findViewById(R.id.tab_setting);


            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(letter_box.this, diary_read.class);
                    startActivity(intent);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(letter_box.this, pic_list.class);
                    startActivity(intent);
                }
            });

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(letter_box.this, letter_box.class);
                    startActivity(intent);
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(letter_box.this, setting.class);
                    startActivity(intent);
                }
            });

            b_write.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(letter_box.this, letter_write.class);
                    startActivity(intent);
                }
            });

            b_read.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(letter_box.this,letter_read.class);
                    startActivity(intent2);
                }
            });
        }
}
