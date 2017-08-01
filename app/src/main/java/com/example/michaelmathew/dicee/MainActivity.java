package com.example.michaelmathew.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variables
        Button rollButton;
        rollButton=(Button) findViewById(R.id.rollButton);
        final ImageView leftDice= (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice= (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };
        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            //Every time roll is pressed, whatever is in onClick function occurs
            public void onClick(View v){
                Log.d("Dicee","Ze button has been pressed");
                Random randomNumbergenerator= new Random();
                int number= randomNumbergenerator.nextInt(6);
                Random randomNumbergenerator2= new Random();
                int number2= randomNumbergenerator2.nextInt(6);

                Log.d("Dicee","The random number is: " + number );
                leftDice.setImageResource(diceArray[number]);//want to put a randomnumber to get from array
                rightDice.setImageResource(diceArray[number2]);
            }


        });

    }
}
