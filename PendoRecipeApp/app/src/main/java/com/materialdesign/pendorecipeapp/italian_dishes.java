package com.materialdesign.pendorecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class italian_dishes extends AppCompatActivity {
    ImageButton Pargiana;
    ImageButton Porchetta;
    ImageButton Spaghetti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_dishes);
        Pargiana = (ImageButton) findViewById(R.id.pargiana_image_button);
        Porchetta = (ImageButton) findViewById(R.id.porchetta_image);
        Spaghetti = (ImageButton) findViewById(R.id.spaghetti_image);
    }

    public void PargianaClicked(View view) {
        Intent intent = new Intent(italian_dishes.this, LoginPage.class);
        startActivity(intent);
    }


    public void SpaghettiClicked(View view) {
        Intent intent = new Intent(italian_dishes.this, LoginPage.class);
        startActivity(intent);

    }

    public void PorchettaClicked(View view) {
        Intent intent = new Intent(italian_dishes.this, LoginPage.class);
        startActivity(intent);

    }
}