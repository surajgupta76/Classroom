package com.driver;

public class Student {

    private String name;
    private int age;
    private double averageScore;

    public Student(){
        
    }
    public Student(String name, int age, double averageScore){
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }
    public String getname(){
        return name;
    }
    public void setname(){
        this.name = name;
    }
    public int getage(){
        return age;
    }
    public void setage(){
        this.age = age;
    }
    public double getaverageScore(){
        return averageScore;
    }
    public void setaverageScore(){
        this.averageScore = averageScore;
    }

}
