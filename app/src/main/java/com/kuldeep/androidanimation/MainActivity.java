package com.kuldeep.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button btnTranslate, btnScale, btnAlpha, btnRotate, btnStop,btnToLottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnScale = findViewById(R.id.btnScale);
        btnStop = findViewById(R.id.btn_stop);
        btnToLottie = findViewById(R.id.btn_to_lottie);

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.clearAnimation();
            }
        });

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation translate_ex = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_ex);
                imageView.startAnimation(translate_ex);

            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha_ex = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha_ex);
                imageView.startAnimation(alpha_ex);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate_ex = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_ex);
                imageView.startAnimation(rotate_ex);

            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale_ex = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_ex);
                imageView.startAnimation(scale_ex);
            }
        });

        btnToLottie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LottieAnimation.class));

            }
        });

    }
}