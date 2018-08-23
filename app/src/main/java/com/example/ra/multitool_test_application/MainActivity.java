package com.example.ra.multitool_test_application;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigation;
    private FrameLayout container;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_music:
                    MusicFragment musicFragment = MusicFragment.newInstance();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, musicFragment);
                    ft.commit();
                    return true;
                case R.id.navigation_calander:
                    CalanderFragment calanderFragment = CalanderFragment.newInstance();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, calanderFragment);
                    ft.commit();
                    return true;
                case R.id.navigation_home:
                    HomeFragment homeFragment = HomeFragment.newInstance();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, homeFragment);
                    ft.commit();
                    return true;
                case R.id.navigation_dashboard:
                    DashboardFragment dashboardFragment = DashboardFragment.newInstance();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, dashboardFragment);
                    ft.commit();
                    return true;
                case R.id.navigation_notifications:
                    NotificationsFragment notificationsFragment = NotificationsFragment.newInstance();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, notificationsFragment);
                    ft.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = findViewById(R.id.navigation);
        container = findViewById(R.id.container);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_home);
    }

}
