package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String string []={"Android","Java","JQuery","Node","HTML"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner1);
        arrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,string);
        spinner.setAdapter(arrayAdapter);
    }
}
