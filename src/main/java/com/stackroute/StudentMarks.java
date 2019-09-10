package com.stackroute;

public class StudentMarks {
    private int numOfStudents;
    private int[] stuGrades;

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public void setStuGrades(int[] stuGrades) {
        //throw error if grades are not valid ArithmeticException
        this.stuGrades = stuGrades;
    }

    public int[] getStuGrades() {
        return stuGrades;
    }

}
