package com.roam.cargame.Screen;

import static com.roam.cargame.Utils.Constant.carArrayList;
import static com.roam.cargame.Utils.Constant.generateRandomNumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.roam.cargame.Model.Car;
import com.roam.cargame.R;

import java.util.ArrayList;
import java.util.Random;

public class IdentifyCarGameActivity extends AppCompatActivity {
    TextView toastMessage,car_name,tvscore;
    int randomNumber1,randomNumber2,randomNumber3;
    ImageView imageView3,imageView2,imageView1;
    int nameindex,score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_car_game);
        toastMessage =findViewById(R.id.message);
        car_name=findViewById(R.id.car_name);
        imageView3=findViewById(R.id.imageView3);
        imageView1=findViewById(R.id.imageView1);
        imageView2=findViewById(R.id.imageView2);

        tvscore=findViewById(R.id.tvscore);
        score=0;
           newQuestion();

           imageView1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   if(car_name.getText().toString().equals(carArrayList.get(randomNumber1))){
                       showCorrectMessage();
                   }else {
                       showWrongMessage();
                   }

               }
           });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car_name.getText().toString().equals(carArrayList.get(randomNumber2))){
                    showCorrectMessage();
                }else {
                    showWrongMessage();
                }
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car_name.getText().toString().equals(carArrayList.get(randomNumber3))){
                    showCorrectMessage();
                }else {
                    showWrongMessage();
                }
            }
        });





    }

    public void newQuestion(){
        tvscore.setText("Score "+score);
        randomNumber1= generateRandomNumber();
        if(randomNumber1==100){
            randomNumber1=99;
        }
        if(randomNumber1==01||randomNumber1==02||randomNumber1==03||randomNumber1==04||randomNumber1==05||randomNumber1==06||randomNumber1==07){
            randomNumber1 = Integer.parseInt(Integer.toString(randomNumber1).substring(1));
        }
        imageView1.setImageDrawable(getResources().getDrawable(carArrayList.get(randomNumber1).getCarPic()));
        randomNumber2= generateRandomNumber();
        if(randomNumber2==100){
            randomNumber2=99;
        }
        if(randomNumber2==01||randomNumber2==02||randomNumber2==03||randomNumber2==04||randomNumber2==05||randomNumber2==06||randomNumber2==07){
            randomNumber2 = Integer.parseInt(Integer.toString(randomNumber2).substring(1));
        }
        imageView2.setImageDrawable(getResources().getDrawable(carArrayList.get(randomNumber2).getCarPic()));
        randomNumber3= generateRandomNumber();
        if(randomNumber3==100){
            randomNumber3=99;
        }
        if(randomNumber3==01||randomNumber3==02||randomNumber3==03||randomNumber3==04||randomNumber3==05||randomNumber3==06||randomNumber3==07){
            randomNumber3 = Integer.parseInt(Integer.toString(randomNumber3).substring(1));
        }
        imageView3.setImageDrawable(getResources().getDrawable(carArrayList.get(randomNumber3).getCarPic()));
        nameindex=generateNumber();
        if(nameindex==1){
            car_name.setText(carArrayList.get(randomNumber1).getCarName());
        }
        if(nameindex==2){
            car_name.setText(carArrayList.get(randomNumber2).getCarName());
        }
        if(nameindex==3){
            car_name.setText(carArrayList.get(randomNumber3).getCarName());
        }



    }

    public  void showCorrectMessage(){
        score++;
        toastMessage.setVisibility(View.VISIBLE);
        toastMessage.setText("CORRECT! ");
        toastMessage.setTextColor(Color.GREEN);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toastMessage.setVisibility(View.GONE);
            }
        }, 1000);

    }


    public  void showWrongMessage(){

        toastMessage.setVisibility(View.VISIBLE);
        toastMessage.setText("WRONG!");
        toastMessage.setTextColor(Color.RED);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toastMessage.setVisibility(View.GONE);
            }
        }, 1000);

    }
    public static int generateNumber(){
        // what is our range?
        int max = 3;
        int min = 1;
// create instance of Random class
        Random randomNum = new Random();
        return min + randomNum.nextInt(max);
    }
    public void generateQuestion(View view) {
        newQuestion();
    }
}