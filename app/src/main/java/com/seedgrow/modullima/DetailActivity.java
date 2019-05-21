package com.seedgrow.modullima;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    SharedPreferences prf;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView result = (TextView) findViewById(R.id.resultView);
        Button btnLogOut = (Button) findViewById(R.id.btnLogOut);

        prf = getSharedPreferences("USERDETAIL", MODE_PRIVATE);

        intent = new Intent(DetailActivity.this, MainActivity.class);
        result.setText(prf.getString("username", null));

        //Method Logout
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = prf.edit();
                editor.clear();
                editor.commit();
                startActivity(intent);
                finish();
            }
        });
    }

}
