package com.example.computerwaysltd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Services extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        autoCompleteTextView = findViewById(R.id.autocompleteText);




        String []option = {"Hardware", "Software", "Networking and Installation","Maintenance and Repairs"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.option_item,option);

        //to make default value
        autoCompleteTextView.setText(arrayAdapter.getItem(0).toString(),false);

        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}