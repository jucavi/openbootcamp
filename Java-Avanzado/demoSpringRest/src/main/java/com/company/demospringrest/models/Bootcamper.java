package com.company.demospringrest.models;


// POJO: Plain Old Java Object
public class Bootcamper {

    private String name;

    public Bootcamper() {}
    public Bootcamper(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
