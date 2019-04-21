package com.seedgrow.modultiga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExampleActivity extends AppCompatActivity {
    TextView team1, team2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        //Global Inisialisasi
        team1 = findViewById(R.id.tv_Nama_Tim_A);
        team2 = findViewById(R.id.tv_Nama_Tim_B);

        //Privat Inisialisasi
        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        //Menampilkan Text
        team1.setText(namaA);
        team2.setText(namaB);
    }
}
