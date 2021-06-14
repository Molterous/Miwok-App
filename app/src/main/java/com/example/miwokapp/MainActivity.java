package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // find the view of number id category
        TextView numbers = (TextView) findViewById(R.id.main_numbers);
        // set a click-listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // CREATE A NEW INTENT TO OPEN THE NUMBER ACTIVITY
                Intent numbersIntent = new Intent(MainActivity.this, NumberActivity.class);
                // start new activity
                startActivity(numbersIntent);
            }
        });

        // find the view of number id category
        TextView family = (TextView) findViewById(R.id.main_family_members);
        // set a click-listener on that view
        family.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // CREATE A NEW INTENT TO OPEN THE NUMBER ACTIVITY
                Intent familyIntent = new Intent(MainActivity.this, FamilyMemberActivity.class);
                // start new activity
                startActivity(familyIntent);
            }
        });

        // find the view of number id category
        TextView colors = (TextView) findViewById(R.id.main_colors);
        // set a click-listener on that view
        colors.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // CREATE A NEW INTENT TO OPEN THE NUMBER ACTIVITY
                Intent colorsIntent = new Intent(MainActivity.this, ColorActivity.class);
                // start new activity
                startActivity(colorsIntent);
            }
        });

        // find the view of number id category
        TextView phrases = (TextView) findViewById(R.id.main_phrases);
        // set a click-listener on that view
        phrases.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // CREATE A NEW INTENT TO OPEN THE NUMBER ACTIVITY
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                // start new activity
                startActivity(phrasesIntent);
            }
        });

    }
}