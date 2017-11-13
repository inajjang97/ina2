package com.example.ina97.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
    }
}
