package com.zhl.toucheventdispatchandexcutedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private CustomButton mCustomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomButton = (CustomButton) findViewById(R.id.customButton);

        mCustomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");
            }
        });

        mCustomButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.d(TAG, "onTouch: " + event.getAction());
                        break;

                    case MotionEvent.ACTION_MOVE:
                        Log.d(TAG, "onTouch: " + event.getAction());
                        break;

                    case MotionEvent.ACTION_UP:
                        Log.d(TAG, "onTouch: " + event.getAction());
                        break;

                    default:
                        break;
                }
                Log.d(TAG, "onTouch: false" + event.getAction());
                return false;
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "dispatchTouchEvent: " + ev.getAction());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "dispatchTouchEvent: " + ev.getAction());
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "dispatchTouchEvent: " + ev.getAction());
                break;
            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "onTouchEvent: " + event.getAction());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "onTouchEvent: " + event.getAction());
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "onTouchEvent: " + event.getAction());
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }
}
