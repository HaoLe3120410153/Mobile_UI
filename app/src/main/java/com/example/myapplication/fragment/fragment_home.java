package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;


public class fragment_home extends Fragment {

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_home, container, false);
//
//        // Định nghĩa các sự kiện click hoặc logic xử lý khác tại đây
//        // Ví dụ:
//        view.findViewById(R.id.button_to_bestseller_screen).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Gọi phương thức để thay đổi fragment khi click vào button
//                replaceFragment(new fragment_order());
//            }
//        });
//        view.findViewById(R.id.button_to_bestseller_screen).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Gọi phương thức để thay đổi fragment khi click vào button
//                replaceFragment(new fragment_order());
//            }
//        });
//        view.findViewById(R.id.button_to_bestseller_screen).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Gọi phương thức để thay đổi fragment khi click vào button
//                replaceFragment(new fragment_order());
//            }
//        });
//        return view;
//    }
//
//
//        // Phương thức để thay đổi fragment
//        private void replaceFragment(Fragment fragment) {
//            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            fragmentTransaction.replace(R.id.frame_layout, fragment);
//            fragmentTransaction.addToBackStack(null);
//            fragmentTransaction.commit();
//        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}