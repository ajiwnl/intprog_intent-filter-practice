package com.araneta.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button = findViewById(R.id.btn2);
        textView = findViewById(R.id.textview);
        Intent intent = getIntent();

        String new_txt = intent.getStringExtra(MainActivity.EXTRA_NAME);

        textView.setText(new_txt);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent launch = new Intent(SecondActivity.this,MainActivity.class);

                startActivity(launch);

            }
        });
    }
}