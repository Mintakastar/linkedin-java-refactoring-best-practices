package com.raffenio.module2.challenge;

public class SomeClass {
    private String name;
    private int age;
    private double[] grades;

    public SomeClass(String Name, int age, double[] grades) {
        this.name = Name;
        this.age = age;
        this.grades = grades;
    }

    /**
     * Does a calculation related to the average
     * it this grades?
     * @return
     */
    public double calculate() {
        double result=0;
        double sum = 0;
        int length = grades.length;
        for (int i = 0; i < length ; i++) {
            sum += grades[i];
        }
        double average = sum / length;

        if (average >= 90) {
            result = 4.0;
        } else if (average >= 80) {
            result = 3.0;
        } else if (average >= 70) {
            result = 2.0;
        } else if (average >= 60) {
            result = 1.0;
        }

        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
}

