// 12 Agustus 2021
//
//        10118382
//        Andre Burhan
//        IF - 9

package com.example.andre_uasakb.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.andre_uasakb.R;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashActivity.this, InfoActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}