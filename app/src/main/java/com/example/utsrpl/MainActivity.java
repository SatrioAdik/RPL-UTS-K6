package com.example.utsrpl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btReza;
    Button btSatrio;
    Button btSelvi;
    Button btTyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btReza = (Button) findViewById(R.id.btReza);
        btSatrio = (Button) findViewById(R.id.btSatrio);
        btSelvi = (Button) findViewById(R.id.btSelvi);
        btTyo = (Button) findViewById(R.id.btTyo);

        btReza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intAgt1 = new Intent(getApplicationContext(),anggota1.class);
                startActivity(intAgt1);
            }
        });

        btSatrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intAgt2 = new Intent(getApplicationContext(), anggota2.class);
                startActivity(intAgt2);
            }
        });

        btSelvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intAgt3 = new Intent(getApplicationContext(), anggota3.class);
                startActivity(intAgt3);
            }
        });

        btTyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intAgt4 = new Intent(getApplicationContext(), anggota4.class);
                startActivity(intAgt4);
            }
        });
    }
}