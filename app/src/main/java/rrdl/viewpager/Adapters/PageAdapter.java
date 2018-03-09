package rrdl.viewpager.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import rrdl.viewpager.Fragments.MainFragment;

/**
 * Created by moneem on 09/03/18.
 */

public class PageAdapter extends FragmentPagerAdapter {
    private int[] colors;

    public PageAdapter(FragmentManager fm,int[] colors) {
        super(fm);
        this.colors=colors;
    }


    @Override
    public Fragment getItem(int position) {
        return (MainFragment.newInstance(position,this.colors[position]));
    }

    @Override
    public int getCount() {
        return 5;
    }
}
