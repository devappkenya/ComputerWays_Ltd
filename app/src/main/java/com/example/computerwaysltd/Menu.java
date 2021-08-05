package com.example.computerwaysltd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;

import java.lang.reflect.Array;

public class Menu extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView,autoCompleteTextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        autoCompleteTextView = findViewById(R.id.autocompletetext);




        String []option = {"Hardware", "Software", "Networking and Installation","Maintenance and Repairs"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.option_item,option);

        //to make default value
        autoCompleteTextView.setText(arrayAdapter.getItem(0).toString(),false);

        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}