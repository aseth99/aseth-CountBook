package com.example.aman.countbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                goToAdd();
            }
        });
        Button summaryButton = (Button) findViewById(R.id.summaryButton);
        summaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                goToSummary();
            }
        });
    }
    private void goToAdd() {

        Intent intent1 = new Intent(this, NewCounter.class);

        startActivity(intent1);

    }
    private void goToSummary() {

        Intent intent2 = new Intent(this, Summary.class);

        startActivity(intent2);

    }
}
