package com.example.aman.countbook;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by aman on 2017-10-02.
 */

public class CounterList {

    private ArrayList<Counter> counterList;

    public CounterList(){
        counterList = new ArrayList<Counter>();
    }

    public Collection<Counter> getCounters(){
        return counterList;
    }

    public void addCounter(Counter counter){
        counterList.add(counter);
    }

    public void removeCounter(String counterName){
        for(Counter counter: counterList){
            if (counter.get_C_name().equals(counterName)){
                counterList.remove(counter);
            }
        }
    }
}
