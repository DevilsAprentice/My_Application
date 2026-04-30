package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.SharedPreferences;

public class MainActivity extends AppCompatActivity {

    EditText edUsername, edPassword;
    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        //shardpref
        SharedPreferences prefs = getSharedPreferences("Prefs", MODE_PRIVATE);
        String savedName = prefs.getString("KEY_USERNAME", null);

        if (savedName != null) {
            Intent intent = new Intent(MainActivity.this, SkeletonActivity.class);
            startActivity(intent);
            finish();
            return;
        }


        edUsername = findViewById(R.id.edUsername);
        edPassword = findViewById(R.id.edPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.regist);


        btnLogin.setOnClickListener(v -> {
            String username = edUsername.getText().toString();
            String password = edPassword.getText().toString();

            if (username.equals("admin") && password.equals("admin")) {
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SkeletonActivity.class );

                //sharedpreferencs
                SharedPreferences sharedPreferences = getSharedPreferences("Prefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("KEY_USERNAME", username);
                editor.apply();

                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
            }
        });


        btnRegister.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Register.class);
            startActivity(intent);
        });
    }
}
