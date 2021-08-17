package com.example.computerwaysltd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private FirebaseAuth mAuth; Button legister; String[] Department = {"Technical Department","Stores Department"};String[] Enter_Level = {"Department Manager","Assistant Manager","Engineer/Technician","Internship","Academic Attachment"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register); legister=findViewById(R.id.buttonregister); Spinner spin = (Spinner) findViewById(R.id.spinner1); Spinner Spin = (Spinner) findViewById(R.id.spinner2); spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Enter_Level);  aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); spin.setAdapter(aa); Spin.setOnItemSelectedListener(this);
        ArrayAdapter bb = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Department);  bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); Spin.setAdapter(bb);

        legister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Login.class);
                view.getContext().startActivity(intent);}
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(getApplicationContext(),Enter_Level[position],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

