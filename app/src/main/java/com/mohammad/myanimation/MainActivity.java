package com.mohammad.myanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text =findViewById(R.id.text);
       // "للشفافية"
     //   anim = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        //"للتكبير والتصغير"
      //  anim = AnimationUtils.loadAnimation(this,R.anim.scale);
      //  "للتحريك "
//        anim = AnimationUtils.loadAnimation(this,R.anim.tran);
        //"للدوران"
//        anim = AnimationUtils.loadAnimation(this,R.anim.rotat);

        anim = AnimationUtils.loadAnimation(this,R.anim.allanimation);

        text.setAnimation(anim);
    }
}
