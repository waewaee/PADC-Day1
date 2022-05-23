package com.waewaee.padc_day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class BookFlightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_flight);

        TextView tvReturn = findViewById(R.id.tv_return);
        TextInputLayout tilReturn = findViewById(R.id.til_return);

        Button btnOneWay = findViewById(R.id.btn_one_way);
        Button btnRoundTrip = findViewById(R.id.btn_round_trip);

        btnOneWay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvReturn.setVisibility(v.GONE);
                tilReturn.setVisibility(v.GONE);
                btnOneWay.setBackgroundResource(R.drawable.btn_rounded_corner2);
                btnRoundTrip.setBackgroundResource(R.color.allTransparent);
            }
        });


        btnRoundTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvReturn.setVisibility(v.VISIBLE);
                tilReturn.setVisibility(v.VISIBLE);
                btnRoundTrip.setBackgroundResource(R.drawable.btn_rounded_corner2);
                btnOneWay.setBackgroundResource(R.color.allTransparent);
            }
        });
    }
}