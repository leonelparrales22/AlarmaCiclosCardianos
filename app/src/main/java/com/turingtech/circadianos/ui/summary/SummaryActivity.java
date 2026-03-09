package com.turingtech.circadianos.ui.summary;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.turingtech.circadianos.MainActivity;
import com.turingtech.circadianos.R;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_view);

        MaterialButton doneButton = findViewById(R.id.summaryDoneButton);
        doneButton.setOnClickListener(v -> {
            Intent intent = new Intent(SummaryActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish();
        });
    }
}
