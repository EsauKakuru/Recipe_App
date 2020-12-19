package com.materialdesign.pendorecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class chinese_dishes extends AppCompatActivity {
    ImageButton springrolls;
    ImageButton quicknoodles;
    ImageButton friedtolu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_dishes);
        springrolls = (ImageButton) findViewById(R.id.spring_rolls_image);
        quicknoodles = (ImageButton) findViewById(R.id.quick_noodles_image);
        friedtolu = (ImageButton) findViewById(R.id.fried_tolu_image);
    }

    public void springrolls(View view) {
        Intent intent = new Intent(chinese_dishes.this, LoginPage.class);
        startActivity(intent);

    }

    public void quicknoodles(View view) {
        Intent intent = new Intent(chinese_dishes.this, LoginPage.class);
        startActivity(intent);

    }

    public void FriedTolu(View view) {
        Intent intent = new Intent(chinese_dishes.this, LoginPage.class);
        startActivity(intent);


    }
}