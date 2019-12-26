package com.example.alertdialog26112019;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button mBtnShowAlert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FastFood menu1 = new FastFoodBuilder()
//                        .orderSandwich("Two Sanwich")
//                        .orderCoffee("One Milk Coffee ")
//                        .build();
//        Log.d("BBB",menu1.getSandwich());
//        Log.d("BBB",menu1.getCoffee());

        mBtnShowAlert = findViewById(R.id.buttonShowAlert);

        mBtnShowAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Thông báo!!");
                alert.setMessage("Bạn muốn thoát ứng dụng không?");
                alert.setIcon(R.drawable.ic_launcher_background);
                alert.setCancelable(false);

                alert.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                alert.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                alert.show();
            }
        });

    }
}
