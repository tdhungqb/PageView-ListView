package com.example.qpc1.viewpage_listview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PaperAdapter extends FragmentStatePagerAdapter{
    public PaperAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ListFragment.newInstance(position);
    }

    @Override
    public int getCount() {

        return 2;
    }

    @Override
    public CharSequence getPageTitle(int positon){
        String title = "";
        switch (positon){
            case 0:
                title = "Trai Cay";
                break;
            case 1:
                title = "Thoi Tiet";
                break;
        }
        return title;
    }
}