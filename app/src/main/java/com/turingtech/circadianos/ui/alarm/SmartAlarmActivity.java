package com.turingtech.circadianos.ui.alarm;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.turingtech.circadianos.R;

public class SmartAlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smart_alarm_view);

        ImageButton backButton = findViewById(R.id.alarmBackButton);
        MaterialButton slideButton = findViewById(R.id.slideToOffButton);

        View.OnClickListener closeListener = v -> finish();

        backButton.setOnClickListener(closeListener);
        slideButton.setOnClickListener(closeListener);
    }
}
