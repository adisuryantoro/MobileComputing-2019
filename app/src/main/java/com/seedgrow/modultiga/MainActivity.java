package com.seedgrow.modultiga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";
    EditText edt1;
    String textName1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startInput(View view){
        //Global Inisialisai
        edt1 = findViewById(R.id.edt_Tim_A);
        //Private Inisialisai
        EditText edt2 = findViewById(R.id.edt_Tim_B);

        //Mengambil Text yang di Tulis
        textName1 = edt1.getText().toString();
        Log.d("MainActivity/30", textName1);
        String textName2 = edt2.getText().toString();
        Log.d("TAG", textName2);

        Intent intent =  new Intent(this, SkorActivity.class);
        //Code untuk membawa data dari Activty Pertama ke Activty ke Dua
        intent.putExtra("Tim A", textName1);
        intent.putExtra("Tim B", textName2);
        startActivity(intent);
    }

    public void input(View view){
        EditText edtA = findViewById(R.id.edt_Tim_A);
        EditText edtB = findViewById(R.id.edt_Tim_B);

        String namaTimA = edtA.getText().toString();
        Log.d("MainActivity", namaTimA);

        String namaTimB = edtB.getText().toString();
        Log.d("MainActivity", namaTimB);


        Intent intent = new Intent(this, SkorActivity.class);
        intent.putExtra("Tim A", namaTimA);
        intent.putExtra("Tim B", namaTimB);
        startActivity(intent);
    }
}




