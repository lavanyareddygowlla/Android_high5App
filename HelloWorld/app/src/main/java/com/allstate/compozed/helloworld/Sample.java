package com.allstate.compozed.helloworld;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.widget.Toast;

@SuppressLint("NewApi")
public class Sample extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        notify("onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        notify("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        notify("onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        notify("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        notify("onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        notify("onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        notify("onSaveInstanceState");
    }

    private void notify(String methodName) {
        String name = this.getClass().getName();
        String[] strings = name.split("\\.");
        Toast.makeText(getApplicationContext(),
                methodName + "" + strings[strings.length - 1],
                Toast.LENGTH_LONG).show();
    }

}
