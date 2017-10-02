package com.example.aman.countbook;

import android.os.Parcelable;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aman on 2017-10-02.
 */

public class Counter {
    private String c_name;
    private Date dateOfUpdate;
    private int c_value;
    private int c_init_val;
    private String comment;

    public Counter(String c_name, int c_value, String comment){
        this.c_name = c_name;
        this.dateOfUpdate = new Date();
        this.c_value = c_value;
        this.c_init_val = c_value;
        this.comment = comment;
    }
    public Counter(String c_name, int c_value){
        this.c_name = c_name;
        this.dateOfUpdate = new Date();
        this.c_value = c_value;
        this.c_init_val = c_value;
    }


    public String get_C_name(){
        return this.c_name;
    }

    public Date getDate(){
        return this.dateOfUpdate;
    }

    public void updateDate(Date update){
        this.dateOfUpdate = update;
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
                "initial Count: " + this.c_init_val + "\n" +
                "Count: " + this.c_value;
    }
}
