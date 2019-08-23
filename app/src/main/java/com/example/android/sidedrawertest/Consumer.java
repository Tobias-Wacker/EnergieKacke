package com.example.android.sidedrawertest;

public class Consumer {

    private int ID;
    private String name;
    private int watt;
    private int time;
    private int type;


    public Consumer(String defaultName, int defaultWatt, int defaultTime, int defaultType){

        name = defaultName;
        watt = defaultWatt;
        time = defaultTime;
        type = defaultType;
    }

    public String getConsumerName(){
        return name;
    }

    public int getConsumerWatt(){
        return watt;
    }

    public int getConsumerTime(){
        return time;
    }

    public int getConsumerType(){
        return type;
    }

}
