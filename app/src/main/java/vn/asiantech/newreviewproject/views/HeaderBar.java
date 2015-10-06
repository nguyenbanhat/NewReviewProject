package vn.asiantech.newreviewproject.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import vn.asiantech.newreviewproject.R;
/**
 *  Created by sunday on 25/09/2015.
 */
public class HeaderBar extends RelativeLayout implements View.OnClickListener {

    private Context mContext;
    private OnHeaderBarListener mOnHeaderBarListener;
    private TextView mTvTitleHeader;

    public enum HeaderBarType{
        TYPE_HOME
    }

    public HeaderBar(Context context) {
        super(context);
        mContext = context;
        init(context);
    }

    public HeaderBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init(context);
    }

    private void init(Context context){
        View rootView = LayoutInflater.from(context).inflate(R.layout.header_bar, this, false);
        mTvTitleHeader = (TextView) rootView.findViewById(R.id.tvTitleHeader);
        this.addView(rootView);
    }

    public void setmOnHeaderBarListener(OnHeaderBarListener mOnHeaderBarListener) {
        this.mOnHeaderBarListener = mOnHeaderBarListener;
    }

    /*public void setOnHeaderBarListener(OnHeaderBarListener l) {
        this.mOnHeaderBarListener = l;
    }*/
    public void setTitle(String title){
        mTvTitleHeader.setText(title);
    }

    public void setType(HeaderBarType type){
        switch (type){
            case TYPE_HOME:
                mTvTitleHeader.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }

    @Override
    public void onClick(View v) {

    }

    public interface OnHeaderBarListener{}
}
