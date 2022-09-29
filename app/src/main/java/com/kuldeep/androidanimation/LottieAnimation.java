package com.kuldeep.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class LottieAnimation extends AppCompatActivity {

    private LottieAnimationView laView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_animation);

//         we can also use below code for animation
//        laView = findViewById(R.id.lottieAnimationView);
//
//        laView.setAnimation(R.raw.lottie);
//        laView.setRepeatCount(ValueAnimator.INFINITE);

    }
}