package com.example.login_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.etName);
        password=(EditText)findViewById(R.id.etPassword);
        login=(Button)findViewById(R.id.btnLogin);

    }
    public void loginvalidate(View view)
    {
        if (username.getText().toString().equals("Admin") && password.getText().toString().equals("1234"))
        {
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
    }

}
