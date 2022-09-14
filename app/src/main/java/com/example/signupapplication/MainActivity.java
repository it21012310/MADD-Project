package com.example.signupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText fullname = (EditText) findViewById(R.id.fullname);


        MaterialButton signinbtn = (MaterialButton) findViewById(R.id.signinbtn);

        // admin and admin

        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname1 = fullname.getText().toString();
                Toast.makeText(MainActivity.this,"Full name is"+fullname1,Toast.LENGTH_SHORT).show();
            }
        });
    }
}