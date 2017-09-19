package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView forecastTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        forecastTextView = (TextView) findViewById(R.id.forecast);

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        String weatherForDay = (String) getIntent().getExtras().get("weatherForDay");

        forecastTextView.setText(weatherForDay);
    }
}