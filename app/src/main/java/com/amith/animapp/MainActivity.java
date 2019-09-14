package com.amith.animapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.ViewGroup.*;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String input;

    Button btnClick;

    EditText txtEmpID;
    TextView empId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmpID = findViewById(R.id.txt_typing_empId);
        empId = findViewById(R.id.txt_anim_empid);

        txtEmpID.setSelected(false);
        txtEmpID.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    afterFocusedEditTextAnimation();
                }
            }
        });

        btnClick = findViewById(R.id.btn_click);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = txtEmpID.getText().toString();
                Toast.makeText(MainActivity.this, input, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void afterFocusedEditTextAnimation() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_empid);
        empId.startAnimation(animation);

//        empId.setTranslationY(-105);
//
//        empId.setScaleX(0.5f);
//        empId.setScaleY(0.5f);

        empId.setTextColor(getResources().getColor(android.R.color.black));
    }
}