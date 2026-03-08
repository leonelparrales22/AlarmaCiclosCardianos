package com.turingtech.circadianos.ui.config;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.turingtech.circadianos.R;
import com.turingtech.circadianos.ui.sleep.SleepActivity;

public class ConfigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config_view);

        ImageButton backButton = findViewById(R.id.backButton);
        MaterialButton saveButton = findViewById(R.id.saveButton);
        MaterialButton goSleepButton = findViewById(R.id.goSleepButton);

        View.OnClickListener returnHomeListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };

        backButton.setOnClickListener(returnHomeListener);
        saveButton.setOnClickListener(returnHomeListener);
        goSleepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfigActivity.this, SleepActivity.class));
            }
        });
    }
}
