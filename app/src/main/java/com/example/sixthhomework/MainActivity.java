package com.example.sixthhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sixthhomework.ViewPager.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        if(Build.VERSION.SDK_INT >= 21){
            View view = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE ;
            view.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        for (int i = 1; i <= 4; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(""+i));
        }
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                ;
            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0 :
                        Toast.makeText(MainActivity.this,"嗨~~",Toast.LENGTH_SHORT).show();
                        break;
                    case 1 :
                        Toast.makeText(MainActivity.this,"Hello~~",Toast.LENGTH_SHORT).show();
                        break;
                    case 2 :
                        Toast.makeText(MainActivity.this,"こんにちは~~",Toast.LENGTH_SHORT).show();
                        break;
                    case 3 :
                        Toast.makeText(MainActivity.this,"안녕하세요~~",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                ;
            }
        });


        tabLayout.setupWithViewPager(viewPager);
    }
}
