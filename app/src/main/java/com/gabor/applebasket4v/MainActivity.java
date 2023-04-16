package com.gabor.applebasket4v;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

    private ImageView mobil_cat_pic;
    private TextView iphone_cat_text;
    private ImageView tablet_cat_pic;
    private TextView ipad_cat_text;
    private ImageView mac_cat_pic;
    private TextView mac_cat_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        iphoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Iphones.class);
                startActivity(intent);
                finish();
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Search.class);
                startActivity(intent);
                finish();
            }
        });

        connect_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Connection.class);
                startActivity(intent);
                finish();
            }
        });

        information_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Information.class);
                startActivity(intent);
                finish();
            }
        });

        mobil_cat_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Iphones.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //tablet és ipad fülek külön? vagy ugynazon a lapon, mert az adatok ugyanazok lesznek kb.

    public void init(){
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

        mobil_cat_pic = findViewById(R.id.mobil_cat_pic);
        iphone_cat_text = findViewById(R.id.iphone_cat_text);
        tablet_cat_pic = findViewById(R.id.tablet_cat_pic);
        ipad_cat_text = findViewById(R.id.ipad_cat_text);
        mac_cat_pic = findViewById(R.id.mac_cat_pic);
        mac_cat_text = findViewById(R.id.mac_cat_text);

    }
}