package com.roam.cargame.Screen;


import static com.roam.cargame.Utils.Constant.carArrayList;
import static com.roam.cargame.Utils.Constant.carNameArrayList;
import static com.roam.cargame.Utils.Constant.generateRandomNumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.roam.cargame.R;

import java.util.Random;

public class IdentifyBrandGameActivity extends AppCompatActivity {
    TextView toastMessage,answer;
    ImageView car_image;
    int randomNumber,score;
    Spinner spinner;
    int index;
    ArrayAdapter aa;
    TextView tvscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identigy_brand_game);
        toastMessage =findViewById(R.id.message);
        car_image=findViewById(R.id.car_image);
        spinner=findViewById(R.id.spinner);
        answer=findViewById(R.id.answer);
        tvscore=findViewById(R.id.tvscore);
        score=0;

         aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,carNameArrayList);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        generateQuestion();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                index=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    }

    public void generateQuestion(){
        tvscore.setText("Score "+score);
        spinner.setAdapter(aa);
        randomNumber= generateRandomNumber();


        if(randomNumber==100){
            randomNumber=99;
        }



        car_image.setImageDrawable(getResources().getDrawable(carArrayList.get(randomNumber).getCarPic()));
    }
      // TODO Auto-generated method stub

    public  void showCorrectMessage(){
        score++;
        toastMessage.setVisibility(View.VISIBLE);
        toastMessage.setText("CORRECT! ");
        toastMessage.setTextColor(Color.GREEN);
        answer.setText(carArrayList.get(randomNumber).getCarName());
        answer.setTextColor(Color.BLUE);
        answer.setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toastMessage.setVisibility(View.GONE);
                answer.setVisibility(View.GONE);
            }
        }, 1000);

    }


    public  void showWrongMessage(){

        toastMessage.setVisibility(View.VISIBLE);
        toastMessage.setText("WRONG!");
        toastMessage.setTextColor(Color.RED);
        answer.setText(carArrayList.get(randomNumber).getCarName());
        answer.setTextColor(Color.BLUE);
        answer.setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toastMessage.setVisibility(View.GONE);
                answer.setVisibility(View.GONE);
            }
        }, 1000);

    }

    public void checkAnswer(View view) {
                if(index==0){
                    Toast.makeText(IdentifyBrandGameActivity.this, "select the brand", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(carNameArrayList.get(index).equals(carArrayList.get(randomNumber).getCarName())){
                        showCorrectMessage();
                    }else {
                        showWrongMessage();
                    }

                    generateQuestion();
                }


    }
}