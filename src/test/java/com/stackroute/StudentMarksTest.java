package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    private StudentMarks studentMarks = new StudentMarks();

    @Test
    public void testSetNumOfStudents() {
        studentMarks.setNumOfStudents(3);
        assertEquals("get num of students", 3, studentMarks.getNumOfStudents());
    }

    @Test
    public void testSetNumOfStudentsFailure() {
        studentMarks.setNumOfStudents(3);
        assertNotNull("once set numOfStudents shouldn't be null", studentMarks.getNumOfStudents());
    }

    @Test
    public void testSetStuGrades() {
        studentMarks.setNumOfStudents(3);
        int[] grades = {12,43,76};
        studentMarks.setStuGrades(grades);
        assertArrayEquals("grades should be same", grades, studentMarks.getStuGrades());
    }

    @Test(expected = ArithmeticException.class)
    public void testSetStuGradesFailure() {
        studentMarks.setNumOfStudents(3);
        int[] grades = {12,43,176};
        studentMarks.setStuGrades(grades);
    }
}