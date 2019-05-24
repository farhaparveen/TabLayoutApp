package com.example.tablayoutapp;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    AppBarLayout appBarLayout;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayoutid);
        appBarLayout=findViewById(R.id.appbarid);
        viewPager=findViewById(R.id.viewpagerid);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentQuiz(),"Quiz");
        adapter.addFragment(new FragmentExplore(),"Explore");
        adapter.addFragment(new FragmentStore(),"Store");


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
