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
    public String getName(){
        return name;
    }
    public void setname(){
        this.name = name;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public void setnumberOfStudents(){
        this.numberOfStudents = numberOfStudents;
    }
    public int getAge(){
        return age;
    }
    public void setage(){
        this.age = age;
    }

}