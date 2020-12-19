package com.materialdesign.pendorecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class american_dishes extends AppCompatActivity {
    ImageButton Greekpizza;
    ImageButton Italianbeef;
    ImageButton NewYorkBargler;
    ImageButton DipSandwich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_american_dishes);
        Greekpizza = (ImageButton) findViewById(R.id.greek_pizza_image);
        Italianbeef = (ImageButton) findViewById(R.id.italian_beef_image);
        NewYorkBargler = (ImageButton) findViewById(R.id.new_york_bargler_image);
        DipSandwich = (ImageButton) findViewById(R.id.dip_sandwich_image);

    }

    public void Greekbeef(View view) {
        Intent intent = new Intent(american_dishes.this, LoginPage.class);
        startActivity(intent);

    }

    public void Italian(View view) {
        Intent intent = new Intent(american_dishes.this, LoginPage.class);
        startActivity(intent);
    }

    public void NewYork(View view) {
        Intent intent = new Intent(american_dishes.this, LoginPage.class);
        startActivity(intent);

    }

    public void Dipsandwich(View view) {
        Intent intent = new Intent(american_dishes.this, LoginPage.class);
        startActivity(intent);

    }
}