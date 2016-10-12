package com.activitylifecycle;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    public static final String LOG_TAG = Main2Activity.class.getSimpleName();

    Button mFinishButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "-->onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mFinishButton = (Button) findViewById(R.id.btn_finish);
        mFinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d(LOG_TAG, "-->onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(LOG_TAG, "-->onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(LOG_TAG, "-->onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(LOG_TAG, "-->onStop()");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d(LOG_TAG, "-->onRestart()");
        super.onRestart();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.d(LOG_TAG, "-->onSaveInstanceState()");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "-->onRestoreInstanceState()");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        Log.d(LOG_TAG, "-->onDestroy()");
        super.onDestroy();
    }

    @Override
    public void finish() {
        Log.d(LOG_TAG, "-->finish()");
        super.finish();
    }
}
