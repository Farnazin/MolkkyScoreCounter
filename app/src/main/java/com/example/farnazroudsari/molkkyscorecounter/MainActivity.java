package com.example.farnazroudsari.molkkyscorecounter;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.farnazroudsari.molkkyscorecounter.R;

import static android.R.attr.button;
import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    public boolean teamState;

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int missTeamA = 0;
    int missTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**add score to team A and change the color of button to orange*/
    Button button;
    public void changeScoreOfTeamA(View v){
        teamState=true;

        Drawable dr = getResources().getDrawable(R.drawable.shape);
        dr.setColorFilter(Color.parseColor("#FF9800"), PorterDuff.Mode.SRC_ATOP);

        switch (v.getId()) {
            case R.id.btn:

                if (button == null) {
                    button = (Button) findViewById(v.getId());
                } else {
                    button.setBackgroundResource(R.drawable.shape);
                    button = (Button) findViewById(v.getId());
                }
                button.setBackgroundDrawable(dr);

                break;

            case R.id.btn2:
                if (button == null) {
                    button = (Button) findViewById(v.getId());
                } else {
                    button.setBackgroundResource(R.drawable.shape);
                    button = (Button) findViewById(v.getId());
                }
                button.setBackgroundDrawable(dr);

                break;

            default:
                break;
        }


    }

    /** add score to team B and change the cplor of button to orange*/
    public void changeScoreOfTeamB(View v){
        teamState=false;
        Drawable dr = getResources().getDrawable(R.drawable.shape);
        dr.setColorFilter(Color.parseColor("#FF9800"), PorterDuff.Mode.SRC_ATOP);

        switch (v.getId()) {
            case R.id.btn:

                if (button == null) {
                    button = (Button) findViewById(v.getId());
                } else {
                    button.setBackgroundResource(R.drawable.shape);
                    button = (Button) findViewById(v.getId());
                }
                button.setBackgroundDrawable(dr);

                break;

            case R.id.btn2:
                if (button == null) {
                    button = (Button) findViewById(v.getId());
                } else {
                    button.setBackgroundResource(R.drawable.shape);
                    button = (Button) findViewById(v.getId());
                }
                button.setBackgroundDrawable(dr);

                break;

            default:
                break;
        }
    }



    /** increase the score by 7 */

    public void addSeven(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 7;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 7;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }

    }

    /** increase the score by 9 */
    public void addNine(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 9;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 9;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }

    }

    /** increase the score by 8 */
    public void addEight(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 8;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }

        }
        else{
            scoreTeamB = scoreTeamB + 8;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }

    }

    /** increase the score by 5 */
    public void addFive(View view) {

        if(teamState) {
            scoreTeamA = scoreTeamA + 5;
            displayForTeamA(scoreTeamA);
            if (scoreTeamA > 50) {
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 5;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }

    }

    /** increase the score by 11 */
    public void addEleven(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 11;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 11;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }
    }

    /** increase the score by 12 */
    public void addTwelve(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 12;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 12;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }

    }

    /** increase the score by 6 */
    public void addSix(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 6;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 6;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }
    }

    /** increase the score by 3 */
    public void addThree(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }
    }

    /** increase the score by 10 */
    public void addTen(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 10;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 10;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }

    }

    /** increase the score by 4 */
    public void addFour(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 4;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 4;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }

    }

    /** increase the score by 1 */
    public void addOne(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }

    }

    /** increase the score by 2 */
    public void addTwo(View view) {

        if(teamState){
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA );
            if(scoreTeamA > 50){
                scoreTeamA = 25;
                displayForTeamA(scoreTeamA);
            }
        }
        else{
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB );
            if(scoreTeamB > 50){
                scoreTeamB = 25;
                displayForTeamB(scoreTeamB);
            }
        }

    }



    public void increment(View view) {

        if(teamState) {
            missTeamA = missTeamA + 1;
            displayMissTrowTeamA(missTeamA);

            if (missTeamA == 3) {
                scoreTeamA = 0;
                missTeamA = 0;
                displayForTeamA(scoreTeamA);
            }
        }
        else {
            missTeamB = missTeamB + 1;
            displayMissTrowTeamB(missTeamB);

            if (missTeamB == 3) {
                scoreTeamB = 0;
                missTeamB = 0;
                displayForTeamB(scoreTeamB);
            }
        }
    }





    public void scoreReset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        missTeamA = 0;
        missTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayMissTrowTeamA(missTeamA);
        displayMissTrowTeamB(missTeamB);
        button.getBackground().setColorFilter(null);
    }


    /**
     private void display(int number) {
     TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
     scoreTextView.setText("" + number);
     }

     /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayMissTrowTeamA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_missed_throw_a);
        quantityTextView.setText("" + number);
    }

    private void displayMissTrowTeamB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_missed_throw_b);
        quantityTextView.setText("" + number);
    }


}
