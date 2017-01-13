package com.allstate.compozed.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import android.content.Context;
import android.content.Intent;

import android.view.View.OnClickListener;


public class HelloWorld extends Activity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        addListenerOnButton();
    }


    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, App2Activity.class);
                startActivity(intent);

            }

        });

    }

}
