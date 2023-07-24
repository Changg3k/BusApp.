package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DangKy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        TextView Ten =(TextView) findViewById(R.id.Ten);
        TextView Ho =(TextView) findViewById(R.id.Ho);
        TextView Email =(TextView) findViewById(R.id.Email);
        TextView sodienthoai =(TextView) findViewById(R.id.sodienthoai);
        TextView matkhau =(TextView) findViewById(R.id.matkhau);





    }
}
