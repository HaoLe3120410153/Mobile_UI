package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.myapplication.adapter.ListAdapter;
import com.example.myapplication.data.ListDinksData;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.databinding.ActivityProductScreenBinding;

import java.util.ArrayList;

public class ProductScreen extends AppCompatActivity {

    ActivityProductScreenBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListDinksData> dataArrayList = new ArrayList<>();
    ListDinksData listDinksData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageList = {R.drawable.coca, R.drawable.pepsi,R.drawable.coca, R.drawable.pepsi};
//        int[] ingredientList = {R.string.COCAIngredients, R.string.PEPSIIngredients, R.string.COCALIngredients, R.string.PEPSILIngredients};
        String[] nameList = {"Coca M","Coca L", "Pepsi M", "Pepsi L" };
        String[] priceList = {"15.000đ", "15.000đ", "20.000đ", "20.000đ"};

        for ( int i = 0; i< imageList.length; i++){
            listDinksData= new ListDinksData(nameList[i], priceList[i], imageList[i]);
            dataArrayList.add(listDinksData);
        }
        listAdapter = new ListAdapter(ProductScreen.this, dataArrayList);
//        binding.drinkListview.setAdapter(listAdapter);
//        binding.drinkListview.setClickable(true);


    }
}
