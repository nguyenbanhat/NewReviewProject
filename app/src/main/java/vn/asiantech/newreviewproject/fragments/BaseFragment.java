package vn.asiantech.newreviewproject.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 *  Created by sunday on 06/10/2015.
 */
public class BaseFragment extends Fragment{

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }
    //call new ChildFragment
    public void replaceFragment(Fragment fragment){

    }

    public interface OnBaseFragmentListener{
        void setHeaderTitle(String title);
    }
}
