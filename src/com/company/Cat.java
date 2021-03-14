package com.company;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void infoCat(){
        System.out.println("Name cat - " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
