package com.DefaultCompany.Optics2D;

import android.app.Activity;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.unity3d.player.*;
import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClickMainActivity(View v){

        if(v.getId() == R.id.btn_guide){
//            Intent i = new Intent(MainActivity.this, UnityPlayerActivity.class);
            Intent i = new Intent(MainActivity.this, Guide.class);
            startActivity(i);

        }

        if(v.getId() == R.id.btn_aboutUs){
            Intent i = new Intent(MainActivity.this, AboutUs.class);
            startActivity(i);

        } if(v.getId() == R.id.btn_start){
            Log.e("Unity", "ana dost start");
            Intent i = new Intent(MainActivity.this, UnityPlayerActivity.class);
            startActivity(i);

        }

    }
}
