package vn.asiantech.newreviewproject.containers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.asiantech.newreviewproject.R;
import vn.asiantech.newreviewproject.fragments.BaseContainerFragment;
import vn.asiantech.newreviewproject.fragments.TabOneFragment_;

/**
 *  Created by sunday on 06/10/2015.
 */
public class TabOneContainer extends BaseContainerFragment{

    private boolean mIsInitView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return View.inflate(getActivity(), R.layout.container_fragment, null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (!mIsInitView) {
            mIsInitView = true;
            initViewFragment();
        }
    }
        public void initViewFragment(){
            replaceFragment(new TabOneFragment_(), false);
    }

    @Override
    public Fragment getChildFragment() {
        return getChildFragmentManager().findFragmentById(R.id.containerFrameLayout);
    }
}
