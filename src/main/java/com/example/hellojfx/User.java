package com.example.hellojfx;

public class User {
    private final String name;
    private final String last_name;
    // constructor
    public User(String name, String last_Name) {
        this.name = name;
        this.last_name = last_Name;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }
}
