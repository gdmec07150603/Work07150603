package com.example.administrator.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

       Log.d("work2","Apk OnStart ,我知道了");
    }

    @Override
    protected void onResume() {
        super.onResume();
       Log.d("work2","Apk OnResume ,我知道了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("work2","Apk OnPause ,我知道了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("work2","Apk OnStop ,我知道了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("work2","Apk onRestart ,我知道了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("work2","Apk onDestroy ,我知道了");
    }
}
