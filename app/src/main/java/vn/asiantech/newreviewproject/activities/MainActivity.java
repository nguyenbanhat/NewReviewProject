package vn.asiantech.newreviewproject.activities;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import vn.asiantech.newreviewproject.R;
import vn.asiantech.newreviewproject.views.HackyViewPager;
import vn.asiantech.newreviewproject.views.PagerSlidingTabStrip;

@EActivity(R.layout.activity_main)
public class MainActivity extends BaseAppCompatActivity {
    private PagerAdapter mAdapter;

    @ViewById(R.id.viewPager)
    protected HackyViewPager mViewPager;

    @ViewById(R.id.tabStrip)
    protected PagerSlidingTabStrip mTabStrip;


    @Override
    void afterView() {
        setValue();
        addEvent();
    }

    private void setValue(){
        mAdapter = new vn.asiantech.newreviewproject.adapters.FragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        mViewPager.setAdapter(mAdapter);
        mTabStrip.setViewPager(mViewPager);
        mViewPager.setOffscreenPageLimit(4);

    }

    private void addEvent(){
        mTabStrip.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        Toast.makeText(getApplication(), "Tab 1", Toast.LENGTH_SHORT).show();
                    case 1:
                        Toast.makeText(getApplication(), "Tab 2", Toast.LENGTH_SHORT).show();
                    case 2:
                        Toast.makeText(getApplication(), "Tab 3", Toast.LENGTH_SHORT).show();

                    case 3:
                        Toast.makeText(getApplication(), "Tab 4", Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
