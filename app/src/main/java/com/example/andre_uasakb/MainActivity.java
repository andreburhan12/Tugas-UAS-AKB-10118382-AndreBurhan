package com.example.andre_uasakb;

// 12 Agustus 2021
//
//        10118382
//        Andre Burhan
//        IF - 9

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.andre_uasakb.fragment.InfoFragment;
import com.example.andre_uasakb.fragment.MapsFragment;
import com.example.andre_uasakb.fragment.ProfileFragment;
import com.example.andre_uasakb.fragment.WisataFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomnav = findViewById(R.id.bottom_navigation);
        bottomnav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ProfileFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectFragment = null;

            switch (item.getItemId()){
                case R.id.nav_profil:
                    selectFragment = new ProfileFragment();
                    break;
                case R.id.nav_lokasi:
                    selectFragment = new MapsFragment();
                    break;
                case R.id.nav_wisata:
                    selectFragment = new WisataFragment();
                    break;
                case R.id.nav_info:
                    selectFragment = new InfoFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectFragment).commit();

            return true;
        }
    };
}