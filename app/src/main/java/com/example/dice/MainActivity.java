package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import generators.random.Numbers;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgDice;
    private Button btnRollDice;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

initViews();

           //int diceNumber= Numbers.getIntInRange(1,6);


    }
private void initViews() {
         imgDice=findViewById(R.id.imgDice);
         btnRollDice=findViewById(R.id.btnRollDice);
         btnRollDice.setOnClickListener(this);
}

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.btnRollDice:
                rollTheDice();
                break;
        }


    }

    private void rollTheDice() {
            int diceNumber=Numbers.getIntInRange(1,6);
            
            setDicePicture(diceNumber);

    }

    private void setDicePicture(int diceNumber) {

            switch (diceNumber)
            {
                case 1:
                    imgDice.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.one));
                    break;
                case 2:
                    imgDice.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.two));
                    break;
                case 3:
                    imgDice.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.three));
                    break;
                case 4:
                    imgDice.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.four));
                    break;
                case 5:
                    imgDice.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.five));
                    break;
                case 6:
                    imgDice.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.six));
                    break;
            }

    }
}