package com.gadgetsmend.cricketscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(8);
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = getItemId();
        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
*/


    /*
     *Add 1 in the Score of Team A
    */
    public void addOneForTeamA(View v){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);

    }

    /*
     *Add 2 in the Score of Team A
    */
    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    /*
     *Add 3 in the Score of Team A
    */
    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    /*
     *Add 4 in the Score of Team A
    */
    public void addFoureForTeamA(View v){
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);

    }


    /*
     *Add 6 in the Score of Team A
    */
    public void addSixForTeamA(View v){
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.displayScoreTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /*
     *Add 1 in the Score of Team B
    */
    public void addOneForTeamB(View v){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);

    }

    /*
     *Add 2 in the Score of Team B
    */
    public void addTwoForTeamB(View v){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);

    }

    /*
     *Add 3 in the Score of Team B
    */
    public void addThreeForTeamB(View v){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);

    }

    /*
     *Add 4 in the Score of Team B
    */
    public void addFoureForTeamB(View v){
        scoreTeamB += 4;
        displayForTeamB(scoreTeamB);

    }


    /*
     *Add 6 in the Score of Team B
    */
    public void addSixForTeamB(View v){
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.displayScoreTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /* Reset Scores of both
     * A and B
     */

    public  void  resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
