package com.gabor.applebasket4v;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
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
    }

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