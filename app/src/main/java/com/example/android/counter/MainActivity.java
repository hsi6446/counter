package com.example.android.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mATeamScore;
    private TextView mBTeamScore;

    private int aAddThree = 0;
    private int aAddTwo = 0;
    private int aFreeThrow = 0;
    private int bAddThree = 0;
    private int bAddTwo = 0;
    private int bFreeThrow = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mATeamScore = (TextView) findViewById(R.id.aScore_board);
        mBTeamScore = (TextView) findViewById(R.id.bScore_board);
    }

    private void AScoreBoard(int number) {

        if (number > 0) {
            mATeamScore.setText("" + number);
        } else {
            mATeamScore.setText("" + 0);
        }

    }

    private void BScoreBoard(int number) {

        if (number > 0) {
            mBTeamScore.setText("" + number);
        } else {
            mBTeamScore.setText("" + 0);
        }

    }

    public void aThree(View view) {
        aAddThree += 3;

        AScoreBoard(aAddThree + aAddTwo + aFreeThrow);

    }

    public void aTwo(View view) {
        aAddTwo += 2;

        AScoreBoard(aAddThree + aAddTwo + aFreeThrow);

    }

    public void aFree(View view) {
        aFreeThrow += 1;

        AScoreBoard(aAddThree + aAddTwo + aFreeThrow);

    }

    public void bThree(View view) {
        bAddThree += 3;

        BScoreBoard(bAddThree + bAddTwo + bFreeThrow);

    }

    public void bTwo(View view) {
        bAddTwo += 2;

        BScoreBoard(bAddThree + bAddTwo + bFreeThrow);

    }

    public void bFree(View view) {
        bFreeThrow += 1;

        BScoreBoard(bAddThree + bAddTwo + bFreeThrow);

    }

    public void reset(View view) {
        aAddThree = 0;
        aAddTwo = 0;
        aFreeThrow = 0;

        bAddThree = 0;
        bAddTwo = 0;
        bFreeThrow = 0;

        AScoreBoard(0);
        BScoreBoard(0);
    }

}
