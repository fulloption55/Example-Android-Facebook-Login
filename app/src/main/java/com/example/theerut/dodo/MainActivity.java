package com.example.theerut.dodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText userText;
    EditText passText;
    TextView errorText;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindWidgets();
        setListeners();

    }

    private void bindWidgets() {
        b1 = (Button) findViewById(R.id.b1);
        userText = (EditText) findViewById(R.id.userText);
        passText = (EditText) findViewById(R.id.passText);
        errorText = (TextView) findViewById(R.id.errorText);
        imageView = (ImageView) findViewById(R.id.question_mark);
    }

    private void setListeners() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLogin(userText.getText().toString(), passText.getText().toString());
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);

            }
        });

    }

    private void checkLogin(String user, String password) {
        if ("user".equalsIgnoreCase(user) && "pass".equals(password)) {
            goToNextPage();
        } else {
            errorText.setVisibility(View.VISIBLE);
        }

    }

    private void goToNextPage() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

    }
}
