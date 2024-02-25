package com.example.myapplication.Screens;

import com.example.myapplication.R;
import com.example.myapplication.fragment.fragment_account;
import com.example.myapplication.fragment.fragment_home;
import com.example.myapplication.fragment.fragment_notification;
import com.example.myapplication.fragment.fragment_order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new fragment_home());
        binding.bottomNavigation.setBackground(null);
        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.menu_tab_home) {
                replaceFragment(new fragment_home());
            } else if (item.getItemId() == R.id.menu_tab_order) {
                replaceFragment(new fragment_order());
            } else if (item.getItemId() == R.id.menu_tab_notification) {
                replaceFragment(new fragment_notification());
            } else if (item.getItemId() == R.id.menu_tab_account) {
                replaceFragment(new fragment_account());
            }
            return true;
        });


    }
    private  void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}
