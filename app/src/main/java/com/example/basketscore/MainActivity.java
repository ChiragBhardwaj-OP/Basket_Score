package com.example.basketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamA=0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
public void threePoint (View view)
{
    teamA = teamA + 3;
    displayForTeamA(teamA);
}
    public void twoPoint (View view)
    {
        teamA = teamA + 2;
        displayForTeamA(teamA);
    }
    public void freeThrow (View view)
    {
        teamA = teamA + 1;
        displayForTeamA(teamA);
    }

    public void threePointb (View view)
    {
        teamB = teamB + 3;
        displayForTeamB(teamB);
    }
    public void twoPointb (View view)
    {
        teamB = teamB + 2;
        displayForTeamB(teamB);
    }
    public void freeThrowb (View view)
    {
        teamB = teamB + 1;
        displayForTeamB(teamB);
    }

    public void reset (View view)
    {
        teamA=0;
        teamB=0;
        displayForTeamA(teamA);
        displayForTeamB(teamB);
    }

}