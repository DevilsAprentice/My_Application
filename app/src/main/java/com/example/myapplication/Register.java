package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView tvRpassword;
        TextView tvRusername;
        Button btRegister;



        tvRusername = findViewById(R.id.tvRusername);
        tvRpassword = findViewById(R.id.tvRpassword);

        btRegister = findViewById(R.id.btRegister);

        btRegister.setOnClickListener(v -> {
            String username = tvRusername.getText().toString();
            String password = tvRpassword.getText().toString();

            Toast.makeText(this, "Regist Success", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Register.this, ConfrimRegister.class );
            intent.putExtra("username", username);
            intent.putExtra("password", password);
            startActivity(intent);
            finish();

        });


    }
}