package com.seedgrow.modullima;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
//    EditText password;
    Button btnLogin;
    SharedPreferences pref;
    Intent intent;
    String mUsername,mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.edt_username);
        password = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);


        //SharedPreference
        pref = getSharedPreferences("USERDETAIL", MODE_PRIVATE);

        intent = new Intent(MainActivity.this, DetailActivity.class);
        if (pref.contains("username") && pref.contains("password")) {
            startActivity(intent);
            finish();
        }

    }


    //Method Login
    public void login(View view) {
        mUsername = this.username.getText().toString();
        mPassword = this.password.getText().toString();

        if (mUsername.equals("Mobile") && mPassword.equals("Computing") ){
            SharedPreferences.Editor editor = pref.edit();
            editor.putString("username", mUsername);
            editor.putString("password", mPassword);
            editor.commit();

            startActivity(intent);
            finish();

        } else if (mUsername.isEmpty() || mPassword.isEmpty()){
            Toast toast = Toast.makeText(MainActivity.this,
                    "Username atau Passwrod Tidak Boleh Kosong",
                    Toast.LENGTH_SHORT);
            toast.show();
        } else {
            AlertDialog.Builder builder = new AlertDialog
                    .Builder(MainActivity.this);
            builder.setMessage("User Name & Password Salah")
                    .setNegativeButton("Coba Lagi", null).create().show();
        }


//        if (mUsername.equals("Mobile Computing") && mPassword.equals("praktikum")) {
//            SharedPreferences.Editor editor = pref.edit();
//            editor.putString("username", mUsername);
//            editor.putString("password", mPassword);
//            editor.commit();
//
//            startActivity(intent);
//            finish();
//        } else {
//
  //          AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
    //        builder.setMessage("User Name & Password Salah").setNegativeButton("Coba Lagi", null).create().show();show
//
//        }
    }

}
