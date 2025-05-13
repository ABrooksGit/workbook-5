package com.pluralsight;

public class Animal {

    protected String name;



    public Animal(String name){
        this.name = name;
    }



    public void setName(String name) {
        this.name = name;
    }


    private String getName(){

        return  name;
    }

    protected void digest(){

    }


}
