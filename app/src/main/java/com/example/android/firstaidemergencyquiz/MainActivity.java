package com.example.android.firstaidemergencyquiz;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.firstaidemergencyquiz.R.id.answer4;

public class MainActivity extends AppCompatActivity {

    int RightAnswer = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view) {
        //is the answer 1 is checked
        RadioButton answer1 =  (RadioButton) findViewById(R.id.answer1);
        boolean ans1 = answer1.isChecked();

        //is the answer 2 is checked
        RadioButton answer2 = (RadioButton) findViewById(R.id.answer2);
        boolean ans2 = answer2.isChecked();
        //is answer of question3 is correct
        EditText text = (EditText) findViewById(R.id.textid);
       String ansr3 = text.getText().toString();


        //is the answer 4 is checked
        RadioButton answer4 = (RadioButton) findViewById(R.id.answer4);
        boolean ans4 = answer4.isChecked();

        //is the answer 5 is checked
        RadioButton answer5 = (RadioButton) findViewById(R.id.answer5);
        boolean  ans5 = answer5.isChecked();


        //is all Right answers of question6 are checked
        CheckBox answer61 = (CheckBox) findViewById(R.id.answer_1);

        boolean ans61 = answer61.isChecked();

        CheckBox answer62  = (CheckBox) findViewById(R.id.answer_2);

        boolean ans62 = answer62.isChecked();

        CheckBox answer63  = (CheckBox) findViewById(R.id.answer_3);

        boolean ans63 = answer63.isChecked();

        //beggining of the process of checking answers
         if (ans1)   {

        RightAnswer= RightAnswer+1;
        }
        if (ans2)   {
            RightAnswer= RightAnswer+1;
        }

        if (ansr3 == "911") {
            RightAnswer= RightAnswer+1;
        }
        if (ans4)  {
            RightAnswer= RightAnswer+1;
        }
        if (ans5)  {
            RightAnswer= RightAnswer+1;
        }
        if (ans61 && ans62 && ans61 ) {
            RightAnswer= RightAnswer+1;
        }
        // Show the total of right answers Toast
        Toast.makeText(this, "Your Total Right answer of 6 Questions is:" + RightAnswer, Toast.LENGTH_SHORT).show();


}


}
