package com.kristich.facts;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public TextView factLabel;

    public Button showFactButton;

    private FactsBook factsBook = new FactsBook();

    private ColorWheel colorWheel = new ColorWheel();


    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        factLabel = (TextView) findViewById(R.id.factTextView);

        showFactButton = (Button) findViewById(R.id.showFactButton);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



//                if (randomNumb == 0) {
//
//                    fact = "Fact Number 0";
//
//                } else if (randomNumb == 1)  {
//
//                    fact = "Facts Number 1";
//
//                } else if (randomNumb == 2) {
//
//                    fact = "Facts Number 2";
//
//                } else {
//
//                    fact = "Error!";
//
//                }

                int color = colorWheel.getColor();

                relativeLayout.setBackgroundColor(color);

                factLabel.setText(factsBook.getFact());

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }
}
