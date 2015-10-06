package vn.asiantech.newreviewproject.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import vn.asiantech.newreviewproject.R;
import vn.asiantech.newreviewproject.containers.TabFourContainer;
import vn.asiantech.newreviewproject.containers.TabOneContainer;
import vn.asiantech.newreviewproject.containers.TabThreeContainer;
import vn.asiantech.newreviewproject.containers.TabTwoContainer;
import vn.asiantech.newreviewproject.views.PagerSlidingTabStrip;

/**
 *  Created by sunday on 06/10/2015.
 */
public class FragmentPagerAdapter extends FragmentStatePagerAdapter implements PagerSlidingTabStrip.IconTabProvider{
    private static final int NUM_TABS = 4;
    private int[] ICONS = {R.drawable.custom_tab_one, R.drawable.custom_tab_two,
                        R.drawable.custom_tab_three, R.drawable.custom_tab_four};
    Context mContext;


    public FragmentPagerAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TabOneContainer();
            case 1:
                return new TabTwoContainer();
            case 2:
                return new TabThreeContainer();
            default:
                return new TabFourContainer();

        }
    }

    @Override
    public int getCount() {
        return NUM_TABS;
    }

    @Override
    public Drawable getPageIconDrawable(int position) {
        return findResources(mContext).getDrawable(ICONS[position]);
    }

    private Resources findResources(Context context){
        return context.getResources();
    }
}
