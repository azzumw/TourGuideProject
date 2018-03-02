package com.example.macintosh.tourguideproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView cafesTV;
    private TextView localshopsTV;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cafesTV = findViewById(R.id.cafesTV);
        localshopsTV = findViewById(R.id.localshopsTV);

        cafesTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,RestaurantANDcafeActivity.class);
                startActivity(intent);
            }
        });

        localshopsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,LocalShopsActivity.class);
                startActivity(intent);
            }
        });



    }
}
