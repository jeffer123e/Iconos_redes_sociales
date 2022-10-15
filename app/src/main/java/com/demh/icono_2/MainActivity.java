package com.demh.icono_2;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_facebook;
    private ImageButton btn_twitter;
    private ImageButton btn_instam;
    private String TAG = "MyActivity";
    String _url_facebook="https://es-la.facebook.com/";
    String _url_twitter="https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZXMifQ%3D%3D%22%7D";
    String _url_instam="https://www.instagram.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_facebook = findViewById(R.id.btn_facebook);
        btn_twitter = findViewById(R.id.btn_twitter);
        btn_instam = findViewById(R.id.btn_instam);
        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(_url_facebook));
                startActivity(intent);
            }
        });

        btn_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(_url_twitter));
                startActivity(intent);
            }
        });

        btn_instam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(_url_instam));
                startActivity(intent);
            }
        });
    }
}