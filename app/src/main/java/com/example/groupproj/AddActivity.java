package com.example.groupproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

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
        TextView out = findViewById(R.id.home1_btn);

        out.setOnClickListener(view -> {
            String name_input = name.getText().toString();
            String address_input = address.getText().toString();
            String tags_input = tags.getText().toString();
            String desc_input = desc.getText().toString();
            String rating =String.valueOf(ratingbar.getRating());



            //Resturant.add(tags_input);
            //Resturant.add(desc_input);
            //Resturant.add(rating);

            Intent intent = new Intent(AddActivity.this, MainActivity.class);
            //intent.putExtra("key", resturants);
            startActivity(intent);














        });


    }
}