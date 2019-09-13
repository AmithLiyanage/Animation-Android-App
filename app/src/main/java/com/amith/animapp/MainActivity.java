package com.amith.animapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;

import static android.widget.TableRow.*;


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
                    buildTextView();
                }
            }
        });

        btnClick = findViewById(R.id.btn_click);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //input = txtEmpID.getText().toString();
                //Toast.makeText(TestingActivity.this, input, Toast.LENGTH_LONG).show();

                // afterFocusedEditTextAnimation();
                buildTextView();
            }
        });
    }

    private void afterFocusedEditTextAnimation() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_empid);
        empId.startAnimation(animation);


    }


    private void buildTextView() {
        TableRow.LayoutParams paramsExample = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.0f);
        //paramsExample.setLayoutDirection( 50d);
    }
}