package com.example.android.quizappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Photos are used under the listed licences, from listed sources as follows:
 * Question 1 photo credit to Robert Lz, under CC Attribution 4.0 license from https://www.flickr.com/photos/robertlz/19247517784
 * Question 2 photo credit to Sicnag, under Creative Commons 4.0 Attribution 4.0 international license from https://www.flickr.com/photos/42220226@N07/25246888623
 * Question 3 photo credit to dave_7, under CC Attribution 4.0 international license from https://www.flickr.com/photos/daveseven/12140400735
 * Question 4 photo credit to ShanHams, under Creative Commons Attribution-Share Alike 4.0 International License from https://commons.wikimedia.org/wiki/File:73_Barracuda_MarconiMuseum.jpg
 * Question 5 photo credit to TrekPhiler, under CC Attribution 3.0 Unported License from https://commons.wikimedia.org/wiki/File:Pro_Street_Camaro_at_launch.JPG
 * Question 6 photo credit to Tony Crowe, under Public domain license from https://www.flickr.com/photos/152309897@N08/38339573792
 * Question 7 photo credit to Toestemming van Xavier Rincker, under GNU Free Documentation License https://commons.wikimedia.org/wiki/File:Lachgas01.jpg
 * Background photo credit to Bill Abbott, under CC Attribution-Share Alkie 2.0 Generic License from https://commons.wikimedia.org/wiki/File:Porsche_935_twin_turbo_(6293115751).jpg
 * ScoreQuiz button background button used courtesy of freebuttons.com from http://www.freebuttons.com/index.php?action=display&buttonName=Neon&color=0
 */
public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    int quizResults = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
    }

    /**
     * Checks status of checkboxes and applies IF logic to score Question #1
     */
    public void score_Quiz(View view) {
        CheckBox answer1A = findViewById(R.id.answer_1a_checkbox);
        boolean chk_box1a = answer1A.isChecked();
        if (chk_box1a) {
            Log.v("Main Activity", "CORRECT part-answer 1A LOGGED");
            quizResults = quizResults + 5;
        }

        //---verifies Checkbox: Answer_1C is clicked--//
        CheckBox answer1C = findViewById(R.id.answer_1c_checkbox);
        boolean chk_box1c = answer1C.isChecked();
        if (chk_box1c) {
            Log.v("Main Activity", "CORRECT part-answer 1C LOGGED:" + answer1C);
            quizResults = quizResults + 5;
        }

        //---Gets Text from Question#2 text field and logs answer---//
        EditText answer2Field = findViewById(R.id.answer_2_field);
        String answer2Given = answer2Field.getText().toString();
        //-----Compares user text entry to answer and scores result--//
        String answer2String = "1967";
        if (answer2Given.equals(answer2String)) {
            quizResults = quizResults + 10;
        }else{
            Log.v("Main Activity", "Answer given for #2 :" + answer2Given);
        }

        //-----Gets checked radio button ID, and compares to stored correct answer button ID determine score for Question#3-----//
        int radio_selected = radioGroup.getCheckedRadioButtonId();
        radioButton =findViewById(radio_selected);
        RadioButton answerCorrect3b = findViewById(R.id.radio_two);
        if (answerCorrect3b.isChecked()) {
            quizResults = quizResults + 10;}
        //---verifies Checkbox: Answer_4A is clicked--//
        CheckBox answer4A = findViewById(R.id.answer_4a_checkbox);
        boolean chk_box4a = answer4A.isChecked();
        if (chk_box4a) {
            Log.v("Main Activity", "CORRECT part-answer 4A LOGGED");
            quizResults = quizResults + 10;}
        //---verifies Checkbox: Answer_4B is clicked--//
        CheckBox answer4B = findViewById(R.id.answer_4b_checkbox);
        boolean chk_box4b = answer4B.isChecked();
        if (chk_box4b) {
            Log.v("Main Activity", "CORRECT part-answer 4B LOGGED");
            quizResults = quizResults + 10;}

        //---verifies Checkbox: Answer_5C is clicked--//
        CheckBox answer5C = findViewById(R.id.answer_5c_checkbox);
        boolean chk_box5c = answer5C.isChecked();
        if (chk_box5c) {
            Log.v("Main Activity", "CORRECT part-answer 5C LOGGED");
            quizResults = quizResults + 10;}
        //---verifies Checkbox: Answer_5D is clicked--//
        CheckBox answer5D = findViewById(R.id.answer_5d_checkbox);
        boolean chk_box5d = answer5D.isChecked();
        if (chk_box5d) {
            Log.v("Main Activity", "CORRECT part-answer 5C LOGGED");
            quizResults = quizResults + 10;}

        //---verifies Checkbox: Answer_6B is clicked--//
        CheckBox answer6B = findViewById(R.id.answer_6b_checkbox);
        boolean chk_box6b = answer6B.isChecked();
        if (chk_box6b) {
            Log.v("Main Activity", "CORRECT part-answer 6B LOGGED");
            quizResults = quizResults + 10;}
        //---verifies Checkbox: Answer_6C is clicked--//
        CheckBox answer6C = findViewById(R.id.answer_6c_checkbox);
        boolean chk_box6c = answer6C.isChecked();
        if (chk_box6c) {
            Log.v("Main Activity", "CORRECT part-answer 6C LOGGED");
            quizResults = quizResults + 10;}

        //---verifies Checkbox: Answer_7A is clicked--//
        CheckBox answer7A = findViewById(R.id.answer_7a_checkbox);
        boolean chk_box7a = answer7A.isChecked();
        if (chk_box7a) {
            Log.v("Main Activity", "CORRECT part-answer 7A LOGGED");
            quizResults = quizResults + 10;}
        //---verifies Checkbox: Answer_7D is clicked--//
        CheckBox answer7D = findViewById(R.id.answer_7d_checkbox);
        boolean chk_box7d = answer7D.isChecked();
        if (chk_box7d) {
            Log.v("Main Activity", "CORRECT part-answer 7D LOGGED");
            quizResults = quizResults + 10;}

        //------Creates Toast messase to display Quiz Score-------//
        Toast.makeText(this, String.valueOf(quizResults) + " ,out of 100 possible Points!", Toast.LENGTH_SHORT).show();

        //** Auto Resets Quiz**//
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}