package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mButtonTop;
    Button mButtonLow;
    TextView mStoryView;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonLow = findViewById(R.id.buttonBottom);
        mStoryView = findViewById(R.id.storyTextView);

        mStoryView.setText(R.string.T1_Story);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1 || mStoryIndex == 2){
                    updateStoryT3();
                }else {
                    mStoryView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonLow.setVisibility(View.INVISIBLE);
                }
                mStoryIndex = mStoryIndex + 2;
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){
                    updateStoryT2();
                }
                else if (mStoryIndex == 2){
                    mStoryView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonLow.setVisibility(View.INVISIBLE);
                }else{
                    mStoryView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonLow.setVisibility(View.INVISIBLE);
                }
                mStoryIndex = mStoryIndex + 1;
            }
        });


    }

    private void updateStoryT2(){
        mStoryView.setText(R.string.T2_Story);
        mButtonTop.setText(R.string.T2_Ans1);
        mButtonLow.setText(R.string.T2_Ans2);
    }
    private void updateStoryT3(){
        mStoryView.setText(R.string.T3_Story);
        mButtonTop.setText(R.string.T3_Ans1);
        mButtonLow.setText(R.string.T3_Ans2);
    }
}
