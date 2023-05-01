package com.gabor.applebasket4v;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Iphone_list_items extends AppCompatActivity {

    private TextView textViewDelete;
    private TextView textViewToBasket;
    private TextView textViewModel;
    private TextView textViewStorage;
    private TextView textViewColor;
    private TextView textViewPrice;
    private TextView textViewStock;
    private ImageView iphonePic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_list_items);
        init();
        standardReferences();
    }

    private void standardReferences() {


    }

    public void init() {
        textViewDelete = findViewById(R.id.textViewDelete);
        textViewToBasket = findViewById(R.id.textViewToBasket);
        textViewModel = findViewById(R.id.textViewModel);
        textViewStorage = findViewById(R.id.textViewStorage);
        textViewColor = findViewById(R.id.textViewColor);
        iphonePic = findViewById(R.id.imageViewIphonePic);
        textViewPrice = findViewById(R.id.textViewPrice);
        textViewStock = findViewById(R.id.textViewStock);

    }
}