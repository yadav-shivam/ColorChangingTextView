package com.colorchangingtextview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ColorChangingTextView colorChangingTextView=findViewById(R.id.tv_colorChanging);

        //change your colors
        int[] colorsArray={ContextCompat.getColor(this,R.color.colorPrimary), ContextCompat.getColor(this,R.color.colorAccent),
                ContextCompat.getColor(this,R.color.yellow),
                ContextCompat.getColor(this,R.color.skyBlue),ContextCompat.getColor(this,R.color.colorOrange)};

        colorChangingTextView.animateIt(colorsArray);
    }
}
