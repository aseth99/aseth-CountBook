package com.example.aman.countbook;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aman on 2017-10-02.
 */

public class Counter {
    private String c_name;
    private String dateOfUpdate;
    private int c_value;
    private int c_init_val;
    private String comment;

    public Counter(String c_name, String dateOfUpdate, int c_value, int c_init_val, String comment){
        this.c_name = c_name;
        this.dateOfUpdate = dateOfUpdate;
        this.c_value = c_value;
        this.c_init_val = c_init_val;
        this.comment = comment;
    }


    public String get_C_name(){
        return this.c_name;
    }

    public String getDate(){
        return this.dateOfUpdate;
    }

    public int getC_value(){
        return this.c_value;
    }

    public int getC_init_val(){
        return this.c_init_val;
    }

    public void incVal(){
        this.c_value = c_value++;
    }

    public void decVal(){
        this.c_value = c_value--;
    }

    public void resetVal(){
        this.c_value = c_init_val;
    }

    public String getComment(){
        return this.comment;
    }

    public String getInfo() {
        return "Name: " + this.c_name + "\n" +
                "Date: " + (new SimpleDateFormat("yyyy-MM-dd").format(this.dateOfUpdate)).toString() + "\n" +
                "Count: " + this.c_value;
    }
}
