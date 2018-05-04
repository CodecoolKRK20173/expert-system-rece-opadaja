package com.codecool.java.expertsystem.model;

import java.util.Set;

public class Fact {

    /*
    +Fact(id:String,description:String)
    +getIdSet(): Set<String>
    +setFactValueById(id:String,value:boolean): void
    +getValueById(id:String): boolean
    +getDescription(): String
     */
    private String id;
    private String description;

    public Fact(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Set<String> getIdSet() {
        return null;
        //TODO: Implement method
    }

    public void setFactValueById(String id, boolean value) {
        //TODO: Implement method
    }

    public boolean getValueById(String id) {
        //TODO: Implement method
        return false;
    }

    public String getDescription() {
        //TODO: Implement method
        return this.description;
    }

}
