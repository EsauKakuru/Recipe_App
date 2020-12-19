package com.materialdesign.pendorecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
    TextView SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        SignUp = (TextView) findViewById(R.id.signUptext);
    }

    public void Signuptext(View view) {
        Intent intent = new Intent(LoginPage.this, SignUpPage.class);
        startActivity(intent);
    }
}
