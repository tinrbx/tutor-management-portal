package com.example.otams;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CreateTimeslotActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_timeslot);

        ImageButton backButton = findViewById(R.id.backButt);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateTimeslotActivity.this, TutorDashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}
