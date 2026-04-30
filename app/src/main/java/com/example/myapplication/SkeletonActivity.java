package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.SharedPreferences;


public class SkeletonActivity extends AppCompatActivity {

    TextView TextView;
    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_skeleton);

        TextView tvUsername = findViewById(R.id.SpUsn);
        Button btLogout = findViewById(R.id.btnLogout);

        SharedPreferences prefs = getSharedPreferences("Prefs", MODE_PRIVATE);

        String savedUsername = prefs.getString("KEY_USERNAME", "Guest");
        tvUsername.setText(savedUsername);

        btLogout.setOnClickListener(v -> {

            SharedPreferences.Editor editor = prefs.edit();


            editor.clear();
            editor.apply();


            Intent intent = new Intent(SkeletonActivity.this, MainActivity.class);
            startActivity(intent);


            finish();
        });



        };
    }
