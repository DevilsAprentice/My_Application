package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class calculatorr extends AppCompatActivity {

       EditText edAngka1, edAngka2;
       Button btTambah, btKurang, btKali, btBagi,btReset;

       TextView edHasil;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_calculatorr);
            edAngka1 = (EditText) findViewById(R.id.edAngka1);
            edAngka2 = (EditText) findViewById(R.id.edAngka2);
            btTambah = (Button) findViewById(R.id.btTambah);
            btKurang = (Button) findViewById(R.id.btKurang);
            btKali = (Button) findViewById(R.id.btKali);
            btBagi = (Button) findViewById(R.id.btBagi);
            edHasil = (TextView) findViewById(R.id.edHasil);
            btReset = (Button) findViewById(R.id.btResest);

            btTambah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int angka1 = Integer.parseInt(edAngka1.getText().toString());
                    int angka2 = Integer.parseInt(edAngka2.getText().toString());
                    int hasil = angka1 + angka2;
                    edHasil.setText("Hasil : " + hasil);
                }
            });
            btKurang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int angka1 = Integer.parseInt(edAngka1.getText().toString());
                    int angka2 = Integer.parseInt(edAngka2.getText().toString());
                    int hasil = angka1 - angka2;
                    edHasil.setText("Hasil : " + hasil);
                }
            });

            btKali.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int angka1 = Integer.parseInt(edAngka1.getText().toString());
                    int angka2 = Integer.parseInt(edAngka2.getText().toString());
                    int hasil = angka1 * angka2;
                    edHasil.setText("Hasil : " + hasil);
                }
            });

            btBagi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int angka1 = Integer.parseInt(edAngka1.getText().toString());
                    int angka2 = Integer.parseInt(edAngka2.getText().toString());
                    float hasil = angka1/angka2;
                    edHasil.setText("Hasil : "+hasil);

                }
            });

            btReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edAngka1.setText("");
                    edAngka2.setText("");
                    edHasil.setText("");
                    edAngka1.requestFocus();
                }
            });




    }
}