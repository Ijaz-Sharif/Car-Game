package com.roam.cargame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.roam.cargame.Screen.AdvanceLevelGameActivity;
import com.roam.cargame.Screen.HintGameActivity;
import com.roam.cargame.Screen.IdentifyBrandGameActivity;
import com.roam.cargame.Screen.IdentifyCarGameActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openGame1(View view){
        startActivity(new Intent(this, IdentifyBrandGameActivity.class));

    }
    public void openGame2(View view){
        startActivity(new Intent(this, HintGameActivity.class));

    }
    public void openGame3(View view){
        startActivity(new Intent(this, IdentifyCarGameActivity.class));

    }
    public void openGame4(View view){
        startActivity(new Intent(this, AdvanceLevelGameActivity.class));

    }
}