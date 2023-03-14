package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName(10);
        obj.getName();
    }
}