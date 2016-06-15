package com.example.theerut.dodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView tv = (TextView) findViewById(R.id.text2);

        Bundle bundle = getIntent().getExtras();
//        String textPage1 = bundle.getString("xxxx");

//        tv.setText(textPage1);
    }
}
