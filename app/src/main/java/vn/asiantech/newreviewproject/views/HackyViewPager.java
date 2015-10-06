package vn.asiantech.newreviewproject.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 *  Created by sunday on 05/10/2015.
 */
public class HackyViewPager extends ViewPager{

    private boolean mIsEnable;
    public HackyViewPager(Context context) {
        super(context);
        mIsEnable = true;
    }

    public HackyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        mIsEnable = true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (mIsEnable) {
            try {
                return super.onInterceptTouchEvent(ev);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        if (mIsEnable) {
            return super.onTouchEvent(arg0);
        }

        return false;
    }
}
