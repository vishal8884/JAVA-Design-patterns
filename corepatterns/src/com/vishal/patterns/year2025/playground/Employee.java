package com.vishal.patterns.year2025.playground;

import java.util.Objects;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj.getClass() != this.getClass()) return false;

        Employee other = (Employee) obj;

        return this.getId() == other.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}