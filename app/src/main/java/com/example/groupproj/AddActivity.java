package com.example.groupproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.text.TextUtils;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AddActivity extends AppCompatActivity {
    RatingBar ratingbar;
    ListView show;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        EditText name = findViewById(R.id.name_id);
        EditText address = findViewById(R.id.address_id);
        EditText tags = findViewById(R.id.Tags);
        EditText desc = findViewById(R.id.desc_id);
        ratingbar = (RatingBar)findViewById(R.id.ratingbar_id);
        TextView out = findViewById(R.id.save_id);
        Button btn = findViewById(R.id.back_id);

        out.setOnClickListener(view -> {
            String name_input = name.getText().toString();
            String address_input = address.getText().toString();
            String tags_input = tags.getText().toString();
            String desc_input = desc.getText().toString();
            String rating =String.valueOf(ratingbar.getRating());
















        });


=======
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Button btn = (Button)findViewById(R.id.details_btn);
        Button btn2 = (Button)findViewById(R.id.home_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddActivity.this, DetailsActivity.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddActivity.this, MainActivity.class));
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
>>>>>>> 3e696bf888ba2e0c443b321fd3c4624e8e993dc0
    }
}