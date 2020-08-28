package com.example.lt_day8;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img_level, img_led;
    private int level = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_level = findViewById(R.id.img_level);
        img_led = findViewById(R.id.img_led);
        img_led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionDrawable drawable = (TransitionDrawable) img_led.getDrawable();
                drawable.startTransition(2000);
            }
        });
        img_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                level += 26;
                if (level > 101) {
                    level = 0;
                }
                img_level.setImageLevel(level);
            }
        });
    }
}