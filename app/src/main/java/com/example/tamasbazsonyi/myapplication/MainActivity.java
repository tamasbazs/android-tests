package com.example.tamasbazsonyi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String expectedEmail = "username";
    private static String expectedPW = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // onClickLoginBtn event handler
    public void onClickLoginBtn(View v)
    {
        EditText email = (EditText) findViewById(R.id.email_txt);
        EditText password = (EditText) findViewById(R.id.password_txt);
        if(email.getText().toString().equals(expectedEmail) && password.getText().toString().equals(expectedPW)) {
            Toast.makeText(this, "Clicked on Button with valid credentials", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, LoggedInActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Clicked on Button but with invalid credentials", Toast.LENGTH_LONG).show();
        }
    }
}
