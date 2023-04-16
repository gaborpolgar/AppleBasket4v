package com.gabor.applebasket4v;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;

public class Search extends AppCompatActivity {

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

    private ProgressBar progressBar;
    private LinearLayout linearLayoutSearchForm;
    private EditText editTextModel;
    private EditText editTextStorage;
    private EditText editTextColour;
    private Button searchButton;
    private ListView listViewSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
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

        progressBar = findViewById(R.id.progressBar);
        linearLayoutSearchForm = findViewById(R.id.linearLayoutSearchForm);
        editTextModel = findViewById(R.id.editTextModel);
        editTextStorage = findViewById(R.id.editTextStorage);
        editTextColour = findViewById(R.id.editTextColour);
        searchButton = findViewById(R.id.searchButton);
        listViewSearch = findViewById(R.id.listViewSearch);
    }
}