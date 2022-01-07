package com.example.android1lesso4.model;

import java.io.Serializable;

public class BookModel implements Serializable {
    private final String name;
    public String Description;

    public BookModel(String name, String description) {
        this.name = name;
        Description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }
}
