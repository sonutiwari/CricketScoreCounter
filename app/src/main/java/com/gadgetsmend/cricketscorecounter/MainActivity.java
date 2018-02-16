package com.gadgetsmend.cricketscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView scoreViewTeamA;
    TextView scoreViewTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewTeamA = findViewById(R.id.displayScoreTeamA);
        scoreViewTeamB = findViewById(R.id.displayScoreTeamB);
    }

    /**
     * Add 1 in the Score of Team A
     * @param v
     */
    public void addOneForTeamA(View v){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Add 2 in the Score of Team A
     * @param v
     */
    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Add 3 in the Score of Team A
     * @param v
     */
    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Add 4 in the Score of Team A
     * @param v
     */
    public void addFourForTeamA(View v){
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);

    }


    /**
     * Add 6 in the Score of Team A
     * @param v
     */
    public void addSixForTeamA(View v){
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Displays the given score for Team A.
     * @param score
     */
    public void displayForTeamA(int score) {
        scoreViewTeamA.setText(String.valueOf(score));
    }

    /**
     * Add 1 in the Score of Team B
     * @param v
     */
    public void addOneForTeamB(View v){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Add 2 in the Score of Team B
     * @param v
     */
    public void addTwoForTeamB(View v){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Add 3 in the Score of Team B
     * @param v
    */
    public void addThreeForTeamB(View v){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Add 4 in the Score of Team B
     * @param v
     */
    public void addFourForTeamB(View v){
        scoreTeamB += 4;
        displayForTeamB(scoreTeamB);

    }


    /**
     * Add 6 in the Score of Team B
     * @param v
    */
    public void addSixForTeamB(View v){
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     * @param score
     */
    public void displayForTeamB(int score) {
        scoreViewTeamB.setText(String.valueOf(score));
    }

    /** Reset Scores of both A and B
     * @param v
     */

    public  void  resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
