package com.zhl.toucheventdispatchandexcutedemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by renyq on 2017/2/15-15:52.
 * Email:renyongqiang.china@hotmail.com
 */

public class CustomButton extends Button {
    private static final String TAG = CustomButton.class.getSimpleName();

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.w(TAG, "dispatchTouchEvent: " + event.getAction());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.w(TAG, "dispatchTouchEvent: " + event.getAction());
                break;
            case MotionEvent.ACTION_UP:
                Log.w(TAG, "dispatchTouchEvent: " + event.getAction());
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.w(TAG, "onTouchEvent: " + event.getAction());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.w(TAG, "onTouchEvent: " + event.getAction());
                break;
            case MotionEvent.ACTION_UP:
                Log.w(TAG, "onTouchEvent: " + event.getAction());
                break;
        }
        Log.w(TAG, "onTouchEvent: super.onTouchEvent(event):" + super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }
}
