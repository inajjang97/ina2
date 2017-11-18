package com.example.ina97.myapplication;

/**
 * Created by ina97 on 2017-11-17.
 */

class diary {
    String date;
    String title;
    String con;

    public diary( String date, String title, String con){
        this.date=date;
        this.title=title;
        this.con=con;
    }

    public void setDate(String date){
        this.date=date;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setCon(String con){
        this.con=con;
    }

    public String getDate(){
        return date;
    }

    public String getTitle(){
        return title;
    }

    public String getCon(){
        return con;
    }
}
