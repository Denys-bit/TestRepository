package com.example.hellojfx;

public class User {
    private String name;
    private String last_name;

    public User(String name, String last_Name) {
        name = name;
        last_name = last_Name;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }
}
