package com.example.android.footballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardsA = 0;
    int yellowCardsB = 0;
    int redCardsA = 0;
    int redCardsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayYellowCardsForTeamA(yellowCardsA);
        displayYellowCardsForTeamB(yellowCardsB);
        displayRedCardsForTeamA(redCardsA);
        displayRedCardsForTeamB(redCardsB);
    }

    // Display Scores
    public void displayScoreForTeamA (int scoreA) {
        TextView scoreTeamA = (TextView) findViewById(R.id.score_team_A);
        scoreTeamA.setText(String.valueOf(scoreA));
    }

    public void displayScoreForTeamB (int scoreB) {
        TextView scoreTeamB = (TextView) findViewById(R.id.score_team_B);
        scoreTeamB.setText(String.valueOf(scoreB));
    }


    // Display Yellow Cards
    public void displayYellowCardsForTeamA (int yellowA) {
        TextView yellowCardsA = (TextView) findViewById(R.id.yellow_cards_counter_a);
        yellowCardsA.setText(String.valueOf(yellowA));
    }

    public void displayYellowCardsForTeamB (int yellowB) {
        TextView yellowCardsB = (TextView) findViewById(R.id.yellow_cards_counter_b);
        yellowCardsB.setText(String.valueOf(yellowB));
    }

    //Display Red Cards

    public void displayRedCardsForTeamA (int redA) {
        TextView redCardsA = (TextView) findViewById(R.id.red_cards_counter_a);
        redCardsA.setText(String.valueOf(redA));
    }

    public void displayRedCardsForTeamB (int redB) {
        TextView redCardsB = (TextView) findViewById(R.id.red_cards_counter_b);
        redCardsB.setText(String.valueOf(redB));
    }

    // Increase Scores
    public void increaseScoreA(View view) {
        scoreTeamA ++;
        displayScoreForTeamA(scoreTeamA);
    }

    public void increaseScoreB(View view) {
        scoreTeamB ++;
        displayScoreForTeamB(scoreTeamB);
    }

    // Increase Yellow Cards
    public void increaseYellowCardsA(View view) {
        yellowCardsA ++;
        displayYellowCardsForTeamA(yellowCardsA);
    }

    public void increaseYellowCardsB(View view) {
        yellowCardsB ++;
        displayYellowCardsForTeamB(yellowCardsB);
    }

    // Increase Red Cards
    public void increaseRedCardsA(View view) {
        redCardsA ++;
        displayRedCardsForTeamA(redCardsA);
    }

    public void increaseRedCardsB(View view) {
        redCardsB ++;
        displayRedCardsForTeamB(redCardsB);
    }

    // Reset all
    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowCardsA = 0;
        yellowCardsB = 0;
        redCardsA = 0;
        redCardsB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayYellowCardsForTeamA(yellowCardsA);
        displayYellowCardsForTeamB(yellowCardsB);
        displayRedCardsForTeamA(redCardsA);
        displayRedCardsForTeamB(redCardsB);
    }
}
