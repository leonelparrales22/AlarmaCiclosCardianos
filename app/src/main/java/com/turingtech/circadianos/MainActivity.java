package com.turingtech.circadianos;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.turingtech.circadianos.ui.config.ConfigActivity;
import com.turingtech.circadianos.ui.sleep.SleepActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_view);

        MaterialButton configureWindowButton = findViewById(R.id.configureWindowButton);
        MaterialButton sleepModeButton = findViewById(R.id.sleepModeButton);

        configureWindowButton.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ConfigActivity.class)));

        sleepModeButton.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, SleepActivity.class)));
    }
}