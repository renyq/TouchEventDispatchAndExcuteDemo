package com.zhl.toucheventdispatchandexcutedemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by renyq on 2017/2/15-16:15.
 * Email:renyongqiang.china@hotmail.com
 */

public class CustomViewGroup extends RelativeLayout {
    private static final String TAG = CustomViewGroup.class.getSimpleName();

    public CustomViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "dispatchTouchEvent: " + event.getAction());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "dispatchTouchEvent: " + event.getAction());
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "dispatchTouchEvent: " + event.getAction());
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "onTouchEvent: " + event.getAction());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "onTouchEvent: " + event.getAction());
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "onTouchEvent: " + event.getAction());
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "onInterceptTouchEvent: " + ev.getAction());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "onInterceptTouchEvent: " + ev.getAction());
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "onInterceptTouchEvent: " + ev.getAction());
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }
}
