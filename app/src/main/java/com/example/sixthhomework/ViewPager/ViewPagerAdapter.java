package com.example.sixthhomework.ViewPager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.sixthhomework.fragment.First_Fragment;
import com.example.sixthhomework.fragment.Forth_Fragment;
import com.example.sixthhomework.fragment.Second_Fragment;
import com.example.sixthhomework.fragment.Third_Fragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return position+1+"";
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            Fragment firstFragment = new First_Fragment();
            return firstFragment;
        }
        else if(position == 1){
            Fragment secondFragment = new Second_Fragment();
            return secondFragment;
        }else if(position == 2){
            Fragment thirdFragment = new Third_Fragment();
            return thirdFragment;
        }else if(position == 3){
            Fragment forthFragment = new Forth_Fragment();
            return forthFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
