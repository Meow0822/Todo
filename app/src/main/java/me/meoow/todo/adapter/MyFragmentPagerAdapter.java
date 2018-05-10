package me.meoow.todo.adapter;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import me.meoow.todo.R;
import me.meoow.todo.fragment.PageFragment;
import me.meoow.todo.fragment.TodayFragment;
import me.meoow.todo.fragment.WeekFragment;

public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private static final int PAGE_COUNT = 3;

    private Activity myActivity;

    public MyFragmentPagerAdapter(FragmentManager fm, Activity activity) {
        super(fm);
        this.myActivity = activity;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PageFragment pageFragment = new PageFragment();
                return pageFragment;
            case 1:
                TodayFragment todayFragment = new TodayFragment();
                return todayFragment;
            case 2:
                WeekFragment weekFragment = new WeekFragment();
                return weekFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return myActivity.getString(R.string.inbox);
            case 1:
                return myActivity.getString(R.string.today);
            case 2:
                return myActivity.getString(R.string.next_7_days);
        }
        return null;

    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }


}
