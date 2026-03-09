package com.turingtech.circadianos.ui.alarm;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.turingtech.circadianos.R;
import com.turingtech.circadianos.ui.summary.SummaryActivity;

public class SmartAlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smart_alarm_view);

        ImageButton backButton = findViewById(R.id.alarmBackButton);
        MaterialButton slideButton = findViewById(R.id.slideToOffButton);

        backButton.setOnClickListener(v -> finish());
        slideButton.setOnClickListener(v -> {
            Intent summaryIntent = new Intent(SmartAlarmActivity.this, SummaryActivity.class);
            startActivity(summaryIntent);
            finish();
        });
    }
}
