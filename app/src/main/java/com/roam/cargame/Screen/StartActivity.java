package com.roam.cargame.Screen;



import static com.roam.cargame.Utils.Constant.addCarData;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.roam.cargame.MainActivity;
import com.roam.cargame.R;

import java.util.Random;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
       addCarData();
    }

    public void openCarGame(View view) {

        startActivity(new Intent(this, MainActivity.class));
    }

    public void aboutScreen(View view) {
        startActivity(new Intent(this,AboutActivity.class));
    }
}