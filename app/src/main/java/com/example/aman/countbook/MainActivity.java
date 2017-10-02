package com.example.aman.countbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText c_name;
    private EditText value;
    private EditText comment;
    private ArrayList<Counter> counterList = new ArrayList<Counter>();
    private ListView counter_list;
    private ArrayAdapter<Counter> adapter;// = new ArrayAdapter<Counter>(getApplicationContext(), android.R.layout.simple_list_item_1, counterList);

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



        //Counter new_counter = (Counter) intent4.getParcelableExtra("counter");
    }

    private void goToSummary() {

        Intent intent2 = new Intent(this, Summary.class);

        startActivity(intent2);

    }
    private void addHere(){
        c_name = (EditText) findViewById(R.id.cntName);
        value = (EditText) findViewById(R.id.num);
        comment = (EditText) findViewById(R.id.comment);

        String CNAME = c_name.getText().toString();
        String COMMENT = comment.getText().toString();
        String VALUE = (value.getText().toString());

        Counter nCounter = new Counter(CNAME, Integer.parseInt(VALUE), COMMENT);

        counterList.add(nCounter);

        adapter = new ArrayAdapter<Counter>(getApplicationContext(), android.R.layout.simple_list_item_1, counterList);
        counter_list.setAdapter(adapter);
    }
/*
    public class counterAdapter extends ArrayAdapter<Counter> {
        public counterAdapter() {
            super(MainActivity.this, 0, counterList);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            Counter cnter = counterList.get(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
            }
            // Lookup view for data population
            TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
            TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
            // Populate the data into the template view using the data object
            tvName.setText(user.name);
            tvHome.setText(user.hometown);
            // Return the completed view to render on screen
            return convertView;
        }
    }
*/
}
