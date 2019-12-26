package com.example.alertdialog26112019;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FastFood menu1 = new FastFoodBuilder()
                        .orderSandwich("Two Sanwich")
                        .orderCoffee("One Milk Coffee ")
                        .build();
        Log.d("BBB",menu1.getSandwich());
        Log.d("BBB",menu1.getCoffee());


    }
}
