package com.driver;

public class Teacher {

    private String name;
    private int numberOfStudents;
    private int age;

    public Teacher() {

    }
    public Teacher(String name, int numberOfStudents, int age){
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public void setname(){
        this.name = name;
    }
    public int getnumberOfStudents(){
        return numberOfStudents;
    }
    public void setnumberOfStudents(){
        this.numberOfStudents = numberOfStudents;
    }
    public int getage(){
        return age;
    }
    public void setage(){
        this.age = age;
    }

}