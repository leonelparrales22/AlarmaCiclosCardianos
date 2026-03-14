package com.turingtech.circadianos.ui.sleep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.turingtech.circadianos.R;
import com.turingtech.circadianos.ui.alarm.SmartAlarmActivity;
import com.turingtech.circadianos.ui.error.ErrorActivity;

public class SleepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sleep_view);

        ImageButton backButton = findViewById(R.id.sleepBackButton);
        MaterialButton pauseButton = findViewById(R.id.pauseButton);
        MaterialButton wakeNowButton = findViewById(R.id.wakeNowButton);
        TextView reviewPermissions = findViewById(R.id.reviewPermissions);

        backButton.setOnClickListener(v -> finish());
        pauseButton.setOnClickListener(v -> finish());
        wakeNowButton.setOnClickListener(v ->
                startActivity(new Intent(SleepActivity.this, SmartAlarmActivity.class)));

        reviewPermissions.setOnClickListener(v ->
                startActivity(new Intent(SleepActivity.this, ErrorActivity.class)));
    }
}
