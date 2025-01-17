package com.araneta.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;

    public static final String EXTRA_NAME = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn1);
        editText = findViewById(R.id.txt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = editText.getText().toString();

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra(EXTRA_NAME, text);
                startActivity(intent);

            }
        });
    }
}