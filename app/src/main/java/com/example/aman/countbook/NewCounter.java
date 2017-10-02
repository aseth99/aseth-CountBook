package com.example.aman.countbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewCounter extends AppCompatActivity {

    //private EditText c_name;
    //private EditText value;
    //private EditText comment;
    //private EditText nDate;

    private ArrayList<Counter> counterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_counter);
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

        //c_name = (EditText) findViewById(R.id.editTextname);
        //value = (EditText) findViewById(R.id.editTextval);
        //comment = (EditText) findViewById(R.id.editTextcomm);
        //nDate = (EditText) findViewById(R.id.editTextdate);

        //String CNAME = c_name.toString();
        //String COMMENT = comment.toString();
        //String newDate = nDate.toString();
        //Integer VALUE = Integer.valueOf(value.toString());
        //Counter nCounter = new Counter(CNAME, newDate, VALUE, VALUE, COMMENT);

        Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                /*
                String c_name = ((EditText) findViewById(R.id.editTextname)).toString();
                String comment = ((EditText) findViewById(R.id.editTextcomm)).toString();
                String Notdate = ((EditText) findViewById(R.id.editTextname)).toString();
                //Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(Notdate);
                int value = Integer.parseInt( ((EditText) findViewById(R.id.editTextval)).toString());
                Counter nCounter = new Counter(c_name, Notdate, value, value, comment);
                counterList.add(nCounter);
                */
                Intent intent3 = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent3);
            }
        });
    }



}
