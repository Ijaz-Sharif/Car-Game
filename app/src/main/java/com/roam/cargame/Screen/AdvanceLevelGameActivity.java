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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.roam.cargame.Model.Car;
import com.roam.cargame.R;

import java.util.ArrayList;

public class AdvanceLevelGameActivity extends AppCompatActivity {
  TextView toastMessage;
    int randomNumber1,randomNumber2,randomNumber3;
    ImageView imageView3,imageView2,imageView1;
    EditText car_name1,car_name2,car_name3;
    Button btn;
    int numberOfItemps=0,corectAns=0;
    TextView carname1,carname2,carname3,tvscore;
    int score=0;
    boolean ans1=false,ans2=false,ans3=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_level_game);
        toastMessage =findViewById(R.id.message);
        imageView3=findViewById(R.id.imageView3);
        imageView1=findViewById(R.id.imageView1);
        imageView2=findViewById(R.id.imageView2);
        car_name1=findViewById(R.id.car_name1);
        car_name2=findViewById(R.id.car_name2);
        car_name3=findViewById(R.id.car_name3);
        carname1=findViewById(R.id.carname1);
        carname2=findViewById(R.id.carname2);
        carname3=findViewById(R.id.carname3);
        tvscore=findViewById(R.id.tvscore);
           score=0;
        btn=findViewById(R.id.btn);
        newQuestion();

    }
    public void newQuestion(){
        tvscore.setText("Score "+score);
        carname1.setVisibility(View.GONE);
        carname2.setVisibility(View.GONE);
        carname3.setVisibility(View.GONE);
        btn.setText("submit");
          car_name3.setTextColor(Color.BLACK);
        car_name2.setTextColor(Color.BLACK);
        car_name1.setTextColor(Color.BLACK);
        car_name1.setText("");
        car_name2.setText("");
        car_name3.setText("");
        car_name1.setFocusable(true);
        car_name1.setFocusableInTouchMode(true); // user touches widget on phone with touch screen
        car_name1.setClickable(true);
        car_name2.setFocusable(true);
        car_name2.setFocusableInTouchMode(true); // user touches widget on phone with touch screen
        car_name2.setClickable(true);
        car_name3.setFocusable(true);
        car_name3.setFocusableInTouchMode(true); // user touches widget on phone with touch screen
        car_name3.setClickable(true);
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


        imageView1.setImageDrawable(getResources().getDrawable(carArrayList.get(randomNumber1).getCarPic()));
        randomNumber2= generateRandomNumber();
        imageView2.setImageDrawable(getResources().getDrawable(carArrayList.get(randomNumber2).getCarPic()));
        randomNumber3= generateRandomNumber();
        imageView3.setImageDrawable(getResources().getDrawable(carArrayList.get(randomNumber3).getCarPic()));




    }

    public  void showCorrectMessage(){
        numberOfItemps=0;
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

    public  void showYellowMessage(){

        toastMessage.setVisibility(View.VISIBLE);
        toastMessage.setText("WRONG!");
        toastMessage.setTextColor(Color.YELLOW);
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

    public void generateQuestion(View view) {


        if(numberOfItemps==3){
            newQuestion();
        }
        else {
            numberOfItemps++;

            if(car_name1.getText().toString().equals(carArrayList.get(randomNumber1).getCarName())){
                car_name1.setFocusable(false);
                car_name1.setFocusableInTouchMode(false); // user touches widget on phone with touch screen
                car_name1.setClickable(false);
                car_name1.setTextColor(Color.GREEN);
                corectAns++;
                ans1=true;
                score++;
            }
            else{
                car_name1.setFocusable(true);
                car_name1.setFocusableInTouchMode(true); // user touches widget on phone with touch screen
                car_name1.setClickable(true);
                car_name1.setTextColor(Color.RED);
            }
            if(car_name2.getText().toString().equals(carArrayList.get(randomNumber2).getCarName())){
                car_name2.setFocusable(false);
                car_name2.setFocusableInTouchMode(false); // user touches widget on phone with touch screen
                car_name2.setClickable(false);
                corectAns++;
                car_name2.setTextColor(Color.GREEN);
                ans2=true;
                score++;

            }
            else {
                car_name2.setFocusable(true);
                car_name2.setFocusableInTouchMode(true); // user touches widget on phone with touch screen
                car_name2.setClickable(true);
                car_name2.setTextColor(Color.RED);
            }
            if(car_name3.getText().toString().equals(carArrayList.get(randomNumber3).getCarName())){
                car_name3.setFocusable(false);
                car_name3.setFocusableInTouchMode(false); // user touches widget on phone with touch screen
                car_name3.setClickable(false);
                corectAns++;
                ans3=true;
                car_name3.setTextColor(Color.GREEN);
                score++;
            }
            else {
                car_name3.setFocusable(true);
                car_name3.setFocusableInTouchMode(true); // user touches widget on phone with touch screen
                car_name3.setClickable(true);
                car_name3.setTextColor(Color.RED);
            }


            if(corectAns==3){
                 showCorrectMessage();
                btn.setText("next");
                numberOfItemps=3;
            }
            if(numberOfItemps==3){
                if(corectAns<=2){
                    showWrongMessage();
                }
                if(!ans1){
                   carname1.setText(carArrayList.get(randomNumber1).getCarName());
                   carname1.setVisibility(View.VISIBLE);
                   carname1.setTextColor(Color.YELLOW);
                }
                if(!ans2){
                    carname2.setText(carArrayList.get(randomNumber2).getCarName());
                    carname2.setVisibility(View.VISIBLE);
                    carname2.setTextColor(Color.YELLOW);
                }
                if(!ans3){
                    carname3.setText(carArrayList.get(randomNumber3).getCarName());
                    carname3.setVisibility(View.VISIBLE);
                    carname3.setTextColor(Color.YELLOW);
                }
            }
            if(numberOfItemps==3){
                btn.setText("next");
            }


        }
    }

}