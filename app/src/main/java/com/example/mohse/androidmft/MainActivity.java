package com.example.mohse.androidmft;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Tag","onCreate called");

     //findViewById: returns a ImageView View class and is
     // casted to a ImageView type so we can work with it.
        ImageView imageView = (ImageView) findViewById(R.id.myimage);
        imageView.setImageResource(R.drawable.myimage);

        //set setBackgroundColor
        getWindow().getDecorView().setBackgroundColor(Color.rgb(100,155,244));


    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Tag","onStart called");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tag","onResume called");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tag","onPause called");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tag","onStop called");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Tag","onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Tag","onRestart called");
    }

}
