package vn.asiantech.newreviewproject.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import vn.asiantech.newreviewproject.R;

/**
 *  Created by sunday on 06/10/2015.
 */
public abstract class BaseContainerFragment extends Fragment {

    private Activity mActivity;

    public void replaceFragment(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        if (addToBackStack) {
            transaction.addToBackStack(null);
        } else {
            transaction.addToBackStack(fragment.getTag());
        }
        transaction.replace(R.id.containerFrameLayout, fragment);

        if (mActivity != null && !mActivity.isFinishing()) {
            transaction.commitAllowingStateLoss();
        }
        getChildFragmentManager().executePendingTransactions();
    }

    public abstract Fragment getChildFragment();

    public boolean popFragment(){
        boolean isPop = false;
        if(getChildFragmentManager().getBackStackEntryCount() > 1){
            isPop = true;
            getChildFragmentManager().popBackStack();
        }
        return isPop;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mActivity = activity;
        if (mActivity != null) {
            try {
                Log.e("Test", "pop fragment: " + getChildFragmentManager().getBackStackEntryCount());
            } catch (ClassCastException ignore) {
            }
        }
    }
}
