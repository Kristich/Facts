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


    private static final String KEY_FACT = "KEY_FACT";

    private static final String KEY_COLOR = "KEY_COLOR";

    public TextView factLabel;

    public Button showFactButton;

    private FactsBook factsBook = new FactsBook();

    private ColorWheel colorWheel = new ColorWheel();


    private RelativeLayout relativeLayout;

    private String fact = factsBook.facts[0];
    private int color = Color.parseColor(colorWheel.colors[0]);


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        outState.putString(KEY_FACT, fact);

        outState.putInt(KEY_COLOR, color);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        fact = savedInstanceState.getString(KEY_FACT);
        color = savedInstanceState.getInt(KEY_COLOR);


        factLabel.setText(fact);

        relativeLayout.setBackgroundColor(color);

        showFactButton.setTextColor(color);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        factLabel = (TextView) findViewById(R.id.factTextView);

        factLabel.setText(factsBook.facts[0]);

        showFactButton = (Button) findViewById(R.id.showFactButton);

        showFactButton.setTextColor(Color.parseColor(colorWheel.colors[0]));

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

                color = colorWheel.getColor();

                relativeLayout.setBackgroundColor(color);

                fact = factsBook.getFact();

                factLabel.setText(fact);

                showFactButton.setTextColor(color);

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
