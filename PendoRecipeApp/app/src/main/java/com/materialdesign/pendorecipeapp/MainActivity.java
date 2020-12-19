
package com.materialdesign.pendorecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton AmericanCuisine;
    ImageView ChineseCuisine;
    ImageView ItalianCuisine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AmericanCuisine =  (ImageButton) findViewById(R.id.american_image_button);
        ChineseCuisine =  (ImageView) findViewById(R.id.chinese_image_view);
        ItalianCuisine = (ImageView) findViewById(R.id.italian_cuisine_image);

    }

    public void AmericanCuisine(View view) {
        Intent intent = new Intent(MainActivity.this, american_dishes.class);
        startActivity(intent);

    }

    public void ChineseClicked(View view) {
        Intent intent = new Intent(MainActivity.this, chinese_dishes.class);
        startActivity(intent);
    }

    public void ItalianClicked(View view) {
        Intent intent = new Intent(MainActivity.this, italian_dishes.class);
        startActivity(intent);

    }
}