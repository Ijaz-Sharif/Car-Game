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

public class HintGameActivity extends AppCompatActivity {
         TextView tvscore;
    TextView toastMessage,answer,dashesText;
    ImageView car_image;
    int randomNumber;
    EditText tv_character;
    int numberOfItems=0,score;
    Button btn;
    String dashText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hint_game);
        toastMessage =findViewById(R.id.message);
        toastMessage =findViewById(R.id.message);
        car_image=findViewById(R.id.car_image);
        answer=findViewById(R.id.answer);
        tv_character=findViewById(R.id.tv_character);
        dashesText=findViewById(R.id.dashesText);
        btn=findViewById(R.id.btn);
        tvscore=findViewById(R.id.tvscore);
        score=0;
        generateQuestion();
    }
    public void generateQuestion(){
        tvscore.setText("Score "+score);
        numberOfItems=0;
        btn.setText("submit");
        tv_character.setText("");
        randomNumber= generateRandomNumber();

        if(randomNumber==100){
            randomNumber=99;
        }
        if(randomNumber==01||randomNumber==02||randomNumber==03||randomNumber==04||randomNumber==05||randomNumber==06||randomNumber==07){
            randomNumber = Integer.parseInt(Integer.toString(randomNumber).substring(1));
        }
        car_image.setImageDrawable(getResources().getDrawable(carArrayList.get(randomNumber).getCarPic()));
        generateDashes();
    }
    public void checkAnswer(View view){

              if(numberOfItems==3){

                  generateQuestion();


              }
              else {
                  replaceDishesWithText();
                  numberOfItems++;
                  if(dashesText.getText().toString().equals(carNameArrayList.get(randomNumber))){
                      showCorrectMessage();
                      btn.setText("next");
                      score++;
                  }
                  if(numberOfItems==3){
                      if(!dashesText.getText().toString().equals(carNameArrayList.get(randomNumber))){
                          showWrongMessage();
                      }
                      btn.setText("next");
                  }
              }

    }
      public void generateDashes(){
        String dash="-";
        for(int i=0;i<=carArrayList.get(randomNumber).getCarName().length();i++){
            dash=dash+"-";
        }
          dashesText.setText(dash);
      }


      public void replaceDishesWithText(){
          dashText=dashesText.getText().toString();
          for(int i=0;i<carArrayList.get(randomNumber).getCarName().length();i++){
               dashText=dashesText.getText().toString();
              char charaeter=carArrayList.get(randomNumber).getCarName().charAt(i);
                  if(tv_character.getText().toString().equalsIgnoreCase(String.valueOf(charaeter))){

                      char[] myNameChars = dashText.toCharArray();
                      myNameChars[i] = charaeter;
                      dashText = String.valueOf(myNameChars);
                      dashesText.setText(dashText);
                  }
          }



      }
    public  void showCorrectMessage(){
        toastMessage.setVisibility(View.VISIBLE);
        toastMessage.setText("CORRECT! ");
        toastMessage.setTextColor(Color.GREEN);
        answer.setText(carArrayList.get(randomNumber).getCarName());
        answer.setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toastMessage.setVisibility(View.GONE);
                answer.setVisibility(View.GONE);
                btn.setText("next");
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
}