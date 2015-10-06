package vn.asiantech.newreviewproject.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

/**
 *  Created by sunday on 06/10/2015.
 */
@EActivity
public abstract class BaseAppCompatActivity extends AppCompatActivity {

    @AfterViews
    protected void initView(){
            this.afterView();
    }

    abstract void afterView();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
