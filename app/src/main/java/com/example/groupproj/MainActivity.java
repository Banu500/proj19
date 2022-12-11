package com.example.groupproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

//        new  Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                // on below line we are
//                // creating a new intent
//                Intent i = new Intent(MainActivity.this, AboutActivity.class);
//
//                // on below line we are
//                // starting a new activity.
//                startActivity(i);
//
//                // on the below line we are finishing
//                // our current activity.
//                finish();
//            }
//        }, 2000);


        Button btn = (Button)findViewById(R.id.save_id);
        Button btn2 = (Button)findViewById(R.id.delete_id);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddActivity.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        });

        }

    }
