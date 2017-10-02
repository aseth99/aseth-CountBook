/*
 * Summary.java
 *
 * Version: 1.0
 *
 * Date: 2017-10-02
 *
 * Author: Aman Seth
 *
 * Copyright (c) 2017. CMPUT 301. University of Alberta - All Rights Reserved. You may use, distribute, or modify
 *  this code under terms and conditions of the Code of Student Behavior at the University of Alberta. You may find a
 *  copy of the license in the project. Otherwise please contact aseth@ualberta.ca
 */
package com.example.aman.countbook;

import android.content.Intent;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Intent intent5 = getIntent();
        int intValue = intent5.getIntExtra("intVar", 0);
        TextView lView = (TextView)findViewById(R.id.summary);



        lView.setText(String.valueOf(intValue));

        //lView.a();
    }

}
