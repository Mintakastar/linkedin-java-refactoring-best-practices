package com.raffenio.module2.challenge;

public class Student {
    private String name;
    private int age;
    private double[] grades;

    public Student(String Name, int age, double[] grades) {
        this.name = Name;
        this.age = age;
        this.grades = grades;
    }

    /**
     * Calculate GPA of student,
     * The GPA, or Grade Point Average, is a number that indicates how high you scored in your courses on average.
     * Using a scale from 1.0 to 4.0, your GPA tracks your progress during your studies. This number is used to
     * assess whether you meet the standards and expectations set by the degree programme or university.
     * @return
     */
    public double calculateGPA() {
        double result=0;
        double average = calculateAverage();

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

    public double calculateAverage(){
        double sum = 0;
        int length = grades.length;
        for (int i = 0; i < length ; i++) {
            sum += grades[i];
        }
        return  sum / length;
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

