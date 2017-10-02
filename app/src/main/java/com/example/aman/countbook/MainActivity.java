/*
 * MainActivity.java
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
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Represents main page of app
 *
 * @author Aman Seth
 * @version 1.0
 * @since 1.0
 *
 */
public class MainActivity extends AppCompatActivity {
    private EditText c_name;
    private EditText value;
    private EditText comment;

    private ArrayList<String> counterList = new ArrayList<String>();
    private ListView counter_list;
    private ArrayAdapter<String> adapter;
    
    private ArrayAdapter<Counter> C_adapter;
    private ArrayList<Counter> counterListCounters = new ArrayList<Counter>();
    private ListView c_counter_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button summaryButton = (Button) findViewById(R.id.summaryButton);
        summaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                goToSummary();
            }
        });

        Button test = (Button) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                addHere();
            }
        });

        counter_list = (ListView) findViewById(R.id.cList);

    }
    /**
     * Changes activity to Summary Page
     *
     * @author Aman Seth
     * @version 1.0
     *
     * @since 1.0
     *
     */
    private void goToSummary() {


        Intent intent2 = new Intent(this, Summary.class);
        intent2.putExtra("intVar", counterList.size());
        startActivity(intent2);


    }

    /**
     * Adds counters to list, uses array adapter to display information
     *
     * @author Aman Seth
     * @version 1.0
     *
     * @since 1.0
     *
     */
    private void addHere(){
        c_name = (EditText) findViewById(R.id.cntName);
        value = (EditText) findViewById(R.id.num);
        comment = (EditText) findViewById(R.id.comment);

        String CNAME = c_name.getText().toString();
        String COMMENT = comment.getText().toString();
        String VALUE = (value.getText().toString());

        Counter nCounter = new Counter(CNAME, Integer.parseInt(VALUE), COMMENT);

        counterList.add(nCounter.getInfo());
        counterListCounters.add(nCounter);

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, counterList);
        counter_list.setAdapter(adapter);
    }

}
