package com.gabor.applebasket4v;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Connection extends AppCompatActivity {

    private ImageView mainImage1;
    private ImageView mainImage2;
    private ImageView logo;
    private Button iphoneButton;
    private Button ipadButton;
    private Button macButton;
    private ImageView search;
    private ImageView user;
    private Button connect_button;
    private Button information_button;

    private Button shopsButton;
    private Button serviceButton;
    private Button customerServiceButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);
        init();

        shopsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://127.0.0.1:8000/frontend/footer_components/shops"));
                startActivity(intent);
                finish();
            }
        });

        serviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://127.0.0.1:8000/frontend/footer_components/shops"));
                startActivity(intent);
                finish();
            }
        });

        customerServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://127.0.0.1:8000/frontend/footer_components/shops"));
                startActivity(intent);
                finish();
            }
        });

    }

    public void init() {
        mainImage1 = findViewById(R.id.mainImage1);
        mainImage2 = findViewById(R.id.mainImage2);
        logo = findViewById(R.id.logo);
        iphoneButton = findViewById(R.id.iphoneButton);
        ipadButton = findViewById(R.id.ipadButton);
        macButton = findViewById(R.id.macButton);
        search = findViewById(R.id.search);
        user = findViewById(R.id.user);
        connect_button = findViewById(R.id.connect_button);
        information_button = findViewById(R.id.information_button);

        shopsButton = findViewById(R.id.shopsButton);
        serviceButton = findViewById(R.id.serviceButton);
        customerServiceButton = findViewById(R.id.customerServiceButton);
    }

}