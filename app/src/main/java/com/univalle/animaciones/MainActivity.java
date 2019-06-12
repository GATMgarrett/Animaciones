package com.univalle.animaciones;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Declarando variables para los botones
    View vAnim5;
    View btnAnim1;
    View btnAnim2;
    View ivAnim3;
    View ivAnim4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Implementando los vinculo de los botones
        vAnim5 = findViewById(R.id.vAnim5);
        btnAnim1 = findViewById(R.id.btnAnim1);
        btnAnim2 = findViewById(R.id.btnAnim2);
        ivAnim3 = findViewById(R.id.ivAnim3);
        ivAnim4 = findViewById(R.id.ivAnim4);

        vAnim5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (vAnim5.getRotation() != 0) {
                    vAnim5.animate()
                            .rotation(0)
                            .alpha(1)
                            .translationX(0)
                            .setDuration(2000)
                            .start();
                } else {
                    vAnim5.animate()
                            .rotation(360)
                            .alpha(0)
                            .translationX(200)
                            .setDuration(2000)
                            .start();
                }

                ValueAnimator va = ValueAnimator.ofInt(0, 255, 100, 250);
                va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int value = (Integer) animation.getAnimatedValue();
                        vAnim5.setBackgroundColor(
                                Color.rgb(value, 255 - value, value));
                    }
                });
                va.setDuration(3000);
                va.start();

            }
        });

        btnAnim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Primera animacion
                if (btnAnim2.getRotation() != 0) {
                    btnAnim2.animate()
                            .rotation(0)
                            .start();
                } else {
                    btnAnim2.animate()
                            .rotation(360)
                            .start();
                }
                //Segunda animacion
                ValueAnimator va = ValueAnimator.ofInt(0, 255, 100, 250);
                va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int value = (Integer) animation.getAnimatedValue();
                        btnAnim1.setBackgroundColor(
                                Color.rgb(value, 255 - value, value));
                    }
                });
                va.setDuration(3000);
                va.start();
                //Tercera animacion
                if (ivAnim3.getTranslationX() != 0) {
                    ivAnim3.animate()
                            .translationX(0)
                            .setDuration(1000)
                            .start();
                } else {
                    ivAnim3.animate()
                            .translationX(400)
                            .setDuration(1000)
                            .start();
                }
                //Cuarta animacion
                if (ivAnim4.getTranslationY() != 0) {
                    ivAnim4.animate()
                            .translationY(0)
                            .setDuration(1000)
                            .start();
                } else {
                    ivAnim4.animate()
                            .translationY(400)
                            .setDuration(1000)
                            .start();
                }
                //Quinta animacion
                if (vAnim5.getScaleY() != 0) {
                    vAnim5.animate()
                            .scaleY(0)
                            .setDuration(1000)
                            .start();
                } else {
                    vAnim5.animate()
                            .scaleY(100)
                            .setDuration(1000)
                            .start();
                }
            }
        });
        ///Segundo boton con 5 animaciones
        btnAnim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Primera animacion
                if (btnAnim1.getScaleX() != 0) {
                    btnAnim1.animate()
                            .scaleX(0)
                            .setDuration(1000)
                            .start();
                } else {
                    btnAnim1.animate()
                            .scaleX(1)
                            .setDuration(1000)
                            .start();
                }
                //Segunda animacion

                //Tercera animacion
                if (ivAnim3.getScaleX() != 0) {
                    ivAnim3.animate()
                            .scaleX(0)
                            .scaleY(0)
                            .setDuration(1000)
                            .start();
                } else {
                    ivAnim3.animate()
                            .scaleX(1)
                            .scaleY(1)
                            .setDuration(1000)
                            .start();
                }

                //Cuarta animacion
                if (ivAnim4.getScaleX() != 1) {
                    ivAnim4.animate()
                            .scaleX(1)
                            .scaleY(1)
                            .setDuration(1000)
                            .start();
                } else {
                    ivAnim4.animate()
                            .scaleX(2)
                            .scaleY(2)
                            .setDuration(1000)
                            .start();
                }
                //Quinta animacion
                if (vAnim5.getRotation() != 0) {
                    vAnim5.animate()
                            .rotation(0)
                            .scaleY(0)
                            .setDuration(2000)
                            .start();
                } else {
                    vAnim5.animate()
                            .rotation(360)
                            .scaleY(1)
                            .setDuration(2000)
                            .start();
                }

                ValueAnimator va = ValueAnimator.ofInt(0, 255, 100, 250);
                va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int value = (Integer) animation.getAnimatedValue();
                        vAnim5.setBackgroundColor(
                                Color.rgb(value, 255 - value, value));
                    }
                });
                va.setDuration(3000);
                va.start();
            }
        });
        ivAnim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Primera animacion
                
                //Segunda animacion
                
                //Tercera animacion
                if (ivAnim3.getRotationY() != 0) {
                    ivAnim3.animate()
                            .rotationY(0)
                            .rotationX(0)
                            .setDuration(2000)
                            .start();
                } else {
                    ivAnim3.animate()
                            .rotationY(360)
                            .rotationX(360)
                            .setDuration(2000)
                            .start();
                }
                //Cuarta animacion
                if (ivAnim4.getRotationY() != 0) {
                    ivAnim4.animate()
                            .rotationY(0)
                            .scaleY(0)
                            .setDuration(2000)
                            .start();
                } else {
                    ivAnim4.animate()
                            .rotationY(360)
                            .scaleY(1)
                            .setDuration(2000)
                            .start();
                }
                //Quinta animacion
                if (vAnim5.getRotationX() != 0) {
                    vAnim5.animate()
                            .rotationX(0)
                            //.scaleY(0)
                            .setDuration(2000)
                            .start();
                } else {
                    vAnim5.animate()
                            .rotationX(360)
                            //.scaleY(1)
                            .setDuration(2000)
                            .start();
                }
            }
        });

    }
}
