package com.hazimfenjan.court_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    /**
     * Displays the given score for Team A.
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View view){
        scoreA=scoreA+3;
        displayTeamA(scoreA);
    }
    public void addTwoForTeamA(View view){
        scoreA=scoreA+2;
        displayTeamA(scoreA);
    }
    public void addOneForTeamA(View view){
        scoreA=scoreA+1;
        displayTeamA(scoreA);
    }


    public void displayTeamA (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_a_score);
        countViewer.setText(""+ number);
    }

    /**
     * Display score for team B
     */

    public void addThreeForTeamB(View view){
        scoreB=scoreB+3;
        displayTeamB(scoreB);
    }
    public void addTwoForTeamB(View view){
        scoreB=scoreB+2;
        displayTeamB(scoreB);
    }
    public void addOneForTeamB(View view){
        scoreB=scoreB+1;
        displayTeamB(scoreB);
    }


    public void displayTeamB (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_b_score);
        countViewer.setText(""+ number);
    }

    public void reset (View view){
        scoreA = 0;
        scoreB = 0;
        displayTeamA(scoreA);
        displayTeamB(scoreB);

    }

}
