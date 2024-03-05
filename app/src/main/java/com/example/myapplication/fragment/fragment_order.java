package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.myapplication.R;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link fragment_order#newInstance} factory method to
// * create an instance of this fragment.
// */
public class fragment_order extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_order, container, false);

        // Lấy tham chiếu tới LinearLayout và thiết lập sự kiện click
        LinearLayout bestSellerLayout = rootView.findViewById(R.id.best_seller);
        bestSellerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment();
            }
        });

        return rootView;
    }

    private void changeFragment() {
        // Xử lý sự kiện khi click vào LinearLayout ở đây
        Fragment newFragment = new order_fragment_bestseller(); // Thay YourNewFragment bằng Fragment mới bạn muốn hiển thị
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout_order, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
