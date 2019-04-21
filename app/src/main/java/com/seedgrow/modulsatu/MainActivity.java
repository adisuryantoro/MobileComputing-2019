package com.seedgrow.modulsatu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


//Lifecycle Android
public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Tes onCreate");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Tes onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Tes onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Tes onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Tes onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Tes onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Tes onDestroy");
    }
}
