package com.example.groupproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Button btn = (Button)findViewById(R.id.contact_app);
        Button btn2 = (Button)findViewById(R.id.home1_btn);

        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override

                                   public void onClick(View v) {
                                       new Handler().postDelayed(new Runnable() {

                                           @Override
                                           public void run() {
                                               Uri gmmIntentUri = Uri.parse("geo:0,0?q=196 Bloor St");
                                               Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                                               mapIntent.setPackage("com.google.android.apps.maps");
                                               startActivity(mapIntent);
                                           }
                                       }, 1000);
                                   }
                               });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailsActivity.this, AddActivity.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}