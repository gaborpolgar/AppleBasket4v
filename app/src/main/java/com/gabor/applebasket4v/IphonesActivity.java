package com.gabor.applebasket4v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.ResponseCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IphonesActivity extends AppCompatActivity {

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

    private List<Product> products = new ArrayList<>();
    //10.0.2.2: s? s nélkül jó most
    private String url = "http://10.0.2.2:8000/api/products";

    private ProgressBar progressBar;
    private ListView listViewPhones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphones);
        init();
        standardReferences();
        RequestTask task = new RequestTask(url, "GET");
        listViewPhones.setVisibility(View.VISIBLE);
        task.execute();
    }

    private void standardReferences() {

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IphonesActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        iphoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IphonesActivity.this, IphonesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IphonesActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IphonesActivity.this, SearchActivity.class);
                startActivity(intent);
                finish();
            }
        });

        connect_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IphonesActivity.this, ConnectionActivity.class);
                startActivity(intent);
                finish();
            }
        });

        information_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IphonesActivity.this, InformationActivity.class);
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

        progressBar = findViewById(R.id.progressBar);
        listViewPhones = findViewById(R.id.listViewPhones);


    }

    private class ProductAdapter extends ArrayAdapter<Product> {

        public ProductAdapter() {
            super(IphonesActivity.this, R.layout.activity_iphone_list_items, products);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.activity_iphone_list_items, null, false);
            Product actualProduct = products.get(position);
            TextView textViewModel = view.findViewById(R.id.textViewModel);
            TextView textViewStorage = view.findViewById(R.id.textViewStorage);
            TextView textViewColor = view.findViewById(R.id.textViewColor);

            textViewModel.setText(actualProduct.getModel());
            textViewStorage.setText("(" + actualProduct.getStorage() + ")");
            textViewColor.setText("(" + actualProduct.getColor() + ")");
            //textViewStorage.setText(actualProduct.getStorage());
            //textViewColor.setText(actualProduct.getColor());

            //miért a textView
            //textView törlés de nekem a list itemsbe nvan
            /*
            * textViewTorles.setOnClickListener(new View.OnClickListener(){
            *
            * */

            return view;
        }
    }

    //űrlapalaphelyeztbe nem kell

    private class RequestTask extends AsyncTask<Void, Void, Response> {

        String requestUrl;
        String requestType;
        String requestParams;

        public RequestTask(String requestUrl, String requestType){
            this.requestUrl = requestUrl;
            this.requestType = requestType;
        }


        // ezek nekem nem kellenek?
        @Override
        protected Response doInBackground (Void... voids){
            Response response = null;
            try{
                switch(requestType){
                    case "GET":
                        response = RequestHandler.get(requestUrl);
                        break;
                    case "POST":
                        response = RequestHandler.post(requestUrl, requestParams);
                        break;
                    case "PUT":
                        response = RequestHandler.delete(requestUrl + "/" + requestParams);
                        break;
                    case "DELETE":
                        response = RequestHandler.delete(requestUrl + "/" + requestParams);
                        break;
                }
                } catch (IOException e){
                Toast.makeText(IphonesActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
            }
            return response;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
        }


         //ez kellett valamiért
        @RequiresApi(api = Build.VERSION_CODES.N)
        @Override
        protected void onPostExecute(Response response) {
            super.onPostExecute(response);
            progressBar.setVisibility(View.GONE);
            Gson converter = new Gson();
            if (response.getResponseCode() > 400 ){
                Toast.makeText(IphonesActivity.this, "Hiba történt a kérés feldolgozása során", Toast.LENGTH_SHORT).show();
                Log.d("onPostExecuteError:", response.getContent());
            }
            switch(requestType){
                case "GET":
                    Product[] productsArray = converter.fromJson(response.getContent(), Product[].class);
                    products.clear();
                    products.addAll(Arrays.asList(productsArray));
                    listViewPhones.setAdapter(new ProductAdapter());
                    break;
                case "POST":
                    Product product = converter.fromJson(response.getContent(), Product.class);
                    products.add( 0, product);
                    break;

                case "PUT":
                    Product updateProduct = converter.fromJson(
                            response.getContent(), Product.class);
                    products.replaceAll(product1 ->
                            product1.getId() == updateProduct.getId() ? updateProduct : product1);
                    break;
                case "DELETE":
                    int id = Integer.parseInt(requestParams);
                    products.removeIf(product1 -> product1.getId() == id);
                    break;
            }
        }
    }

}