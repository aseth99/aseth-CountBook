/*
 * CounterList.java
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

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by aman on 2017-10-02.
 */
/**
 * Class to keep lists of counters
 *
 * @author Aman Seth
 * @version 1.0
 * @see Counter
 * @since 1.0
 *
 */
public class CounterList {

    public ArrayList<Counter> getCounterList() {
        return counterList;
    }

    ArrayList<Counter> counterList;

    public CounterList(){
        counterList = new ArrayList<Counter>();
    }

    public Collection<Counter> getCounters(){
        return counterList;
    }
    
    public void removeCounter(String counterName){
        for(Counter counter: counterList){
            if (counter.get_C_name().equals(counterName)){
                counterList.remove(counter);
            }
        }
    }
}
