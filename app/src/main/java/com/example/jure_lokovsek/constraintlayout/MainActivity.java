package com.example.jure_lokovsek.constraintlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.TranslateAnimation;

public class MainActivity extends Activity {

    private Placeholder mPlaceholder;
    private ConstraintLayout mLayout;

    /// more info here https://www.youtube.com/watch?v=LQ1DKrCYwz4&list=PLrnPJCHvNZuA80lNWNCLICR3qYzhw3iPI&index=5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlaceholder = findViewById(R.id.placeholder);
        mLayout = findViewById(R.id.layout);


    }

    public void click(View view){
        TransitionManager.beginDelayedTransition(mLayout);
        mPlaceholder.setContentId(view.getId());
    }


}
