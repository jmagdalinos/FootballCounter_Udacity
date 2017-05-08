package com.example.android.footballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring variables for score keeping
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardsA = 0;
    int yellowCardsB = 0;
    int redCardsA = 0;
    int redCardsB = 0;

    //Declaring final variables to use when saving state
    private static final String STATE_SCORE_A = "scoreTeamA";
    private static final String STATE_SCORE_B = "scoreTeamB";
    private static final String STATE_YELLOW_CARDS_A = "yellowCardsA";
    private static final String STATE_YELLOW_CARDS_B = "yellowCardsB";
    private static final String STATE_RED_CARDS_A = "redCardsA";
    private static final String STATE_RED_CARDS_B = "redCardsB";

    //Declaring all views and buttons
    TextView scoreTeamA_Text_View;
    TextView scoreTeamB_Text_View;
    TextView yellowCardsA_Text_View;
    TextView yellowCardsB_Text_View;
    TextView redCardsA_Text_View;
    TextView redCardsB_Text_View;
    Button scoreTeamA_Button;
    Button scoreTeamB_Button;
    Button yellowCardsA_Button;
    Button yellowCardsB_Button;
    Button redCardsA_Button;
    Button redCardsB_Button;
    Button reset_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Call method to initialize all views
        initializeAllViews();

        //Call method to initialize OnClickListeners
        initializeOnClickListeners();

        //Call method to display scores and cards on each view
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayYellowCardsForTeamA(yellowCardsA);
        displayYellowCardsForTeamB(yellowCardsB);
        displayRedCardsForTeamA(redCardsA);
        displayRedCardsForTeamB(redCardsB);
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        //Saves current state of all variables using the relevant final variables
        savedInstanceState.putInt(STATE_SCORE_A, scoreTeamA);
        savedInstanceState.putInt(STATE_SCORE_B, scoreTeamB);
        savedInstanceState.putInt(STATE_YELLOW_CARDS_A, yellowCardsA);
        savedInstanceState.putInt(STATE_YELLOW_CARDS_B, yellowCardsB);
        savedInstanceState.putInt(STATE_RED_CARDS_A, redCardsA);
        savedInstanceState.putInt(STATE_RED_CARDS_B, redCardsB);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        //Saves current state of all variables using the relevant final variables and displays
        // them in the relevant views
        scoreTeamA = savedInstanceState.getInt(STATE_SCORE_A);
        scoreTeamB = savedInstanceState.getInt(STATE_SCORE_B);
        yellowCardsA = savedInstanceState.getInt(STATE_YELLOW_CARDS_A);
        yellowCardsB = savedInstanceState.getInt(STATE_YELLOW_CARDS_B);
        redCardsA = savedInstanceState.getInt(STATE_RED_CARDS_A);
        redCardsB = savedInstanceState.getInt(STATE_RED_CARDS_B);

        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayYellowCardsForTeamA(yellowCardsA);
        displayYellowCardsForTeamB(yellowCardsB);
        displayRedCardsForTeamA(redCardsA);
        displayRedCardsForTeamB(redCardsB);
    }


    //Initializes all views and assigns them to variable
    public void initializeAllViews(){
        //TextViews
        scoreTeamA_Text_View = (TextView) findViewById(R.id.score_team_A);
        scoreTeamB_Text_View = (TextView) findViewById(R.id.score_team_B);
        yellowCardsA_Text_View = (TextView) findViewById(R.id.yellow_cards_counter_a);
        yellowCardsB_Text_View = (TextView) findViewById(R.id.yellow_cards_counter_b);
        redCardsA_Text_View = (TextView) findViewById(R.id.red_cards_counter_a);
        redCardsB_Text_View = (TextView) findViewById(R.id.red_cards_counter_b);

        //Buttons
        scoreTeamA_Button = (Button) findViewById(R.id.goal_a);
        scoreTeamB_Button = (Button) findViewById(R.id.goal_b);
        yellowCardsA_Button = (Button) findViewById(R.id.yellow_cards_a);
        yellowCardsB_Button = (Button) findViewById(R.id.yellow_cards_b);
        redCardsA_Button = (Button) findViewById(R.id.red_cards_a);
        redCardsB_Button = (Button) findViewById(R.id.red_cards_b);
        reset_Button = (Button) findViewById(R.id.reset_button);
    }


    // Set a click listener on Activity-selection Views
    public void initializeOnClickListeners() {
        scoreTeamA_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseScoreA();
            }
        });

        scoreTeamB_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseScoreB();
            }
        });

        yellowCardsA_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseYellowCardsA();
            }
        });

        yellowCardsB_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseYellowCardsB();
            }
        });

        redCardsA_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseRedCardsA();
            }
        });

        redCardsB_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseRedCardsB();
            }
        });

        reset_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScores();
            }
        });
    }


    //Display Scores
    public void displayScoreForTeamA (int scoreA) {
        scoreTeamA_Text_View.setText(String.valueOf(scoreA));
    }

    public void displayScoreForTeamB (int scoreB) {
        scoreTeamB_Text_View.setText(String.valueOf(scoreB));
    }


    //Display Yellow Cards
    public void displayYellowCardsForTeamA (int yellowA) {
        yellowCardsA_Text_View.setText(String.valueOf(yellowA));
    }
    public void displayYellowCardsForTeamB (int yellowB) {
        yellowCardsB_Text_View.setText(String.valueOf(yellowB));
    }


    //Display Red Cards
    public void displayRedCardsForTeamA (int redA) {
        redCardsA_Text_View.setText(String.valueOf(redA));
    }

    public void displayRedCardsForTeamB (int redB) {
        redCardsB_Text_View.setText(String.valueOf(redB));
    }


    //Increase Scores
    public void increaseScoreA() {
        scoreTeamA ++;
        displayScoreForTeamA(scoreTeamA);
    }

    public void increaseScoreB() {
        scoreTeamB ++;
        displayScoreForTeamB(scoreTeamB);
    }


    //Increase Yellow Cards
    public void increaseYellowCardsA() {
        yellowCardsA ++;
        displayYellowCardsForTeamA(yellowCardsA);
    }

    public void increaseYellowCardsB() {
        yellowCardsB ++;
        displayYellowCardsForTeamB(yellowCardsB);
    }


    //Increase Red Cards
    public void increaseRedCardsA() {
        redCardsA ++;
        displayRedCardsForTeamA(redCardsA);
    }

    public void increaseRedCardsB() {
        redCardsB ++;
        displayRedCardsForTeamB(redCardsB);
    }


    //Reset all score variables as well as views
    public void resetScores() {
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
