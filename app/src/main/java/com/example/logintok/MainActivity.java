package com.example.logintok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button tmbl_login;
    private EditText Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tmbl_login = (Button) findViewById(R.id.tmbl_login);
        Username =(EditText) findViewById(R.id.edit_Username);
        Password =(EditText) findViewById(R.id.edit_Password);
            Username.setText(getIntent().getStringExtra("data1"));
            Password.setText(getIntent().getStringExtra("data1"));

         tmbl_login.setOnClickListener(){
            Toast.makeText(getApplicationContext(),"berpindah", Toast.LENGTH_LONG).show();
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            i.putExtra("data1",Username.getText().toString());
            startActivity(i);
            finish();
        }
    }
}