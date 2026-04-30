package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConfrimRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confrim_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView ConfrimUsername;
        TextView ConfrimPassword;


        ConfrimUsername = findViewById(R.id.ConfrimUsername);
        ConfrimPassword = findViewById(R.id.ConfrimPassword);

        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        ConfrimUsername.setText("username: " + username);
        ConfrimPassword.setText("password: " + password);
    }
}