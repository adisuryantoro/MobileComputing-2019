package com.seedgrow.modultiga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SkorActivity extends AppCompatActivity {
    int skorA = 0, skorB = 0;
    TextView a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        //Inisialisasi dimana Text akan tampil
        TextView namaTimA = findViewById(R.id.tv_Tim_A);
        TextView namaTimB = findViewById(R.id.tv_Tim_B);

        //Get data daari Intent
        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        //Data yang telah di ambil kemudian di Tampilkan
        namaTimA.setText("Team" + " " + namaA);
        namaTimB.setText("Team" + " " + namaB);
    }

    public void Tambah(View view) {
        if (view.getId() == R.id.btn_Plus_Satu_A) {
            skorA = skorA + 1;
        } else if (view.getId() == R.id.btn_Plus_Dua_A) {
            skorA = skorA + 2;
        } else if (view.getId() == R.id.btn_Plus_Tiga_A) {
            skorA = skorA + 3;
        } else if (view.getId() == R.id.btn_Plus_Satu_B) {
            skorB = skorB + 1;
        } else if (view.getId() == R.id.btn_Plus_Dua_B) {
            skorB = skorB + 2;
        } else if (view.getId() == R.id.btn_Plus_Tiga_B) {
            skorB = skorB + 3;
        }

        TextView skorTimA = findViewById(R.id.tv_Skor_Tim_A);
        TextView skorTimB = findViewById(R.id.tv_Skor_Tim_B);

        skorTimA.setText(String.valueOf(skorA));
        skorTimB.setText(String.valueOf(skorB));
    }

}


