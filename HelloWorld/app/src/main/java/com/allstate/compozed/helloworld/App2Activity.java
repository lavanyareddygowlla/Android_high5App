package com.allstate.compozed.helloworld;

/**
 * Created by localadmin on 20/12/16.
 */



        import android.app.Activity;
        import android.os.Bundle;
        import android.widget.Button;

public class App2Activity extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
    }

}