package com.amith.animapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;

import static android.view.ViewGroup.*;
import static android.widget.TableRow.*;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


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
                    //Toast.makeText(TestingActivity.this, "Hi", Toast.LENGTH_LONG).show();
                    afterFocusedEditTextAnimation();
                    //buildTextView();
                }
            }
        });

        btnClick = findViewById(R.id.btn_click);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //input = txtEmpID.getText().toString();
                //Toast.makeText(TestingActivity.this, input, Toast.LENGTH_LONG).show();

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_empid);
                empId.startAnimation(animation);

            }
        });
    }

    private void afterFocusedEditTextAnimation() {
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_empid);
//        empId.startAnimation(animation);

        empId.setTranslationY(-105);

        empId.setScaleX(0.5f);
        empId.setScaleY(0.5f);


        empId.setTextColor(getResources().getColor(android.R.color.black));



    }


//    private void buildTextView() {
//        TableRow.LayoutParams paramsExample = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT,1.0f);
//        //paramsExample.setLayoutDirection(x);
//        empId.setId(R.id.txt_anim_empid);
//        empId.setTranslationX(20);
//        empId.setTranslationY(100);
//        //empId.setBackgroundResource(R.drawable.textview_9patch_white);
//        //empId.setGravity(Gravity.CENTER);
//        empId.setTextColor(getResources().getColor(android.R.color.black));
//        //empId.setMargins(20, 20, 20, 20);
//        //empId.setPadding(20, 20, 20, 20);
//        //empId.setTextSize(40);
//        //empId.setText("customExample");
//
//        //if I comment out the following line, this TextView displays.
//        //if I leave it in, it doesn't display.
//        //empId.setLayoutParams(paramsExample);
//    }
}