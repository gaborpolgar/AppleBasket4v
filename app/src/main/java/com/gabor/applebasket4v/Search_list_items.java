package com.gabor.applebasket4v;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Search_list_items extends AppCompatActivity {

    private TextView textViewDelete;
    private TextView textViewToBasket;
    private TextView textViewModel;
    private TextView textViewStorage;
    private TextView textViewColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_list_items);
    }

    public void init() {
        textViewDelete = findViewById(R.id.textViewDelete);
        textViewToBasket = findViewById(R.id.textViewToBasket);
        textViewModel = findViewById(R.id.textViewModel);
        textViewStorage = findViewById(R.id.textViewStorage);
        textViewColour = findViewById(R.id.textViewColour);

    }




}