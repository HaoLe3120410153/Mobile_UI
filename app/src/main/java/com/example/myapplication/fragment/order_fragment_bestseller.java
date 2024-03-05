package com.example.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.ProductScreen;
import com.example.myapplication.R;

public class order_fragment_bestseller extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_order_bestseller, container, false);

        // Find the view that you want to set the click listener on
        View productLayout = rootView.findViewById(R.id.product1);

        // Set the click listener
        productLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToProductScreen();
            }
        });

        return rootView;
    }

    private void goToProductScreen() {
        Intent intent = new Intent(getActivity(), ProductScreen.class);
        startActivity(intent);
    }
}
