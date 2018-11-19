package kz.education.tursun.personalworkfive;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import kz.education.tursun.personalworkfive.module.hostel.HostelsFragment;
import kz.education.tursun.personalworkfive.module.museum.MuseumsFragment;
import kz.education.tursun.personalworkfive.module.restaurant.RestaurantsFragment;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
    private List<Fragment> fragments =new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragments.add(RestaurantsFragment.getInstance());
        fragments.add(MuseumsFragment.getInstance());
        fragments.add(HostelsFragment.getInstance());
        mTabLayout = findViewById(R.id.tabLayout);
        mPager = findViewById(R.id.pager);
        FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        };
        mPager.setAdapter(adapter);
        mTabLayout.addTab(mTabLayout.newTab().setText(R.string.resturants));
        mTabLayout.addTab(mTabLayout.newTab().setText(R.string.museums));
        mTabLayout.addTab(mTabLayout.newTab().setText(R.string.hostels));
//        mTabLayout.(0).setText(getResources().getString(R.string.favourites));
//        mTabLayout.getTabAt(1).setText(getResources().getString(R.string.service_payment));
//        mTabLayout.getTabAt(2).setText(getResources().getString(R.string.history));
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
