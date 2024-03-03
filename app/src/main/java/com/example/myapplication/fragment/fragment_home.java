//package com.example.myapplication.fragment;
//
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentTransaction;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.example.myapplication.R;
//
//
//public class fragment_home extends Fragment {

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

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false);
//    }
//}

package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class fragment_home extends Fragment {

    private int currentValue = 0;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Tìm và gán TextView
        textView = view.findViewById(R.id.count_product);

        // Tìm và gán các button
        Button btnDecrease = view.findViewById(R.id.button_decrease);
        Button btnIncrease = view.findViewById(R.id.button_increase);

        // Đặt onClickListener cho nút giảm
        btnDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Giảm giá trị của TextView nếu giá trị hiện tại lớn hơn 0
                if (currentValue > 0) {
                    currentValue--;
                    textView.setText(String.valueOf(currentValue));
                }
            }
        });

        // Đặt onClickListener cho nút tăng
        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tăng giá trị của TextView
                currentValue++;
                textView.setText(String.valueOf(currentValue));
            }
        });

        return view;
    }
}
