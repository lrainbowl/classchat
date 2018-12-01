package com.example.rainbow.classchat;

import java.util.List;
import java.util.ArrayList;

public class Class {
    public String className;
    public List<User> students;
    Class(String name) {
        className = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }

    public void addStudent(User student) {
        students.add(student);
    }
}
