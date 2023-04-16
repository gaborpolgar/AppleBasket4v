package com.gabor.applebasket4v;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class Registration extends AppCompatActivity {

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

    private TextInputLayout inputLayoutName;
    private EditText nameText;
    private TextInputLayout inputLayoutEmail;
    private EditText emailText;
    private TextInputLayout inputLayoutPassword;
    private EditText passwordText;
    private TextInputLayout inputLayoutPasswordConfirm;
    private EditText passwordConfirmText;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
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

        inputLayoutName = findViewById(R.id.inputLayoutName);
        nameText = findViewById(R.id.nameText);
        inputLayoutEmail = findViewById(R.id.inputLayoutEmail);
        inputLayoutPasswordConfirm = findViewById(R.id.inputLayoutPasswordConfirm);
        passwordConfirmText = findViewById(R.id.passwordConfirmText);
        login = findViewById(R.id.login);
    }
}