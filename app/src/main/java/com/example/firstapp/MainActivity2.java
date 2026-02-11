package com.example.firstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView result    =   findViewById(R.id.result);
  private TextView znak    =   findViewById(R.id.textZnak);
   private EditText numberOne =   findViewById(R.id.editNumberOne);
   private EditText numberTwo =  findViewById(R.id.editNumberTwo);
   private Button buttonRes   = findViewById(R.id.setRes);
   private Button buttonPlus=findViewById(R.id.buttonPlus);
   private Button buttonMinus=findViewById(R.id.buttonMinus);

  private Button buttonAster=findViewById(R.id.buttonAster);
  private Button buttonDivision=findViewById(R.id.buttonDivision);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EdgeToEdge.enable(this);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                znak.setText("+");
            }
        });
        buttonAster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                znak.setText("*");
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                znak.setText("/");
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                znak.setText("-");
            }
        });

            buttonRes.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    Integer num1=Integer.parseInt(numberOne.getText().toString());
                    Integer num2=Integer.parseInt(numberTwo.getText().toString());

                    String zn=znak.getText().toString();
                    if (zn.equals("+")){
                        result.setText(num1+num2+"");
                    }else if (zn.equals("-")) {
                        result.setText(num1-num2+"");
                    }else if (zn.equals("*")) {
                        result.setText(num1*num2+"");
                    }else  {
                        if (num2==0){
                            result.setText("Нельзя делить на 0");
                        }
                        result.setText(num1/num2+"");
                    }

                }
});

    }


}