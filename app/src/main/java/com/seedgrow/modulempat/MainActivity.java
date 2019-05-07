package com.seedgrow.modulempat;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText phoneNumber;
    private EditText websiteUri;
    private EditText locationUri;
    private EditText textShare;

    Button buttonWebsite;
    Button buttonLocation;
    Button buttonText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumber = findViewById(R.id.edtPhoneNumber);
        websiteUri = findViewById(R.id.edtWebsiteUri);
        locationUri = findViewById(R.id.edtLocationUri);
        textShare = findViewById(R.id.edtShareText);

        buttonWebsite = findViewById(R.id.btnWebsiteUri);
        buttonWebsite.setOnClickListener(this);

        buttonLocation = findViewById(R.id.btnLocationUri);
        buttonLocation.setOnClickListener(this);

        buttonText = findViewById(R.id.btnShareText);
        buttonText.setOnClickListener(this);
    }

    public void openDial(View view){
        if (phoneNumber.getText().toString().isEmpty()){
            phoneNumber.setError("Tidak boleh Kosong");
        }else {
            Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"
                    + phoneNumber.getText().toString()));
            startActivity(dialPhone);
        }
    }

    public void openDialPhone(View view) {
        if (phoneNumber.getText().toString().length() == 0) {
            Toast.makeText(this, "Silahkan isi Nomer Handphone",
                    Toast.LENGTH_SHORT).show();
        } else {
            //String numberPhone = phoneNumber.getText().toString();
            Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"
                    + phoneNumber.getText().toString()));
            startActivity(dialPhone);
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnWebsiteUri:
                if (websiteUri.getText().toString().length() == 0) {
                    Toast.makeText(this, "Silahkan Masukan Url", Toast.LENGTH_SHORT).show();
                } else {

                    Intent openWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUri.getText().toString()));
                    startActivity(openWebsite);
                }
                break;
            case R.id.btnLocationUri:
                if (locationUri.getText().toString().length() == 0) {
                    Toast.makeText(this, "Silahkan Masukan Url Lokasi", Toast.LENGTH_SHORT).show();
                } else {

                    Intent openLocation = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + locationUri.getText().toString()));
                    startActivity(openLocation);
                }
                break;

            case R.id.btnShareText:
                if (textShare.getText().toString().length() == 0) {
                    Toast.makeText(this, "Silahkan Masukan Text yang akan di Share ", Toast.LENGTH_SHORT).show();
                } else {
                    ShareCompat.IntentBuilder
                            .from(this)
                            .setType("text/plan")
                            .setChooserTitle("Share this text with : ")
                            .setText(textShare.getText().toString())
                            .startChooser();
                }
                break;

        }
    }


}


