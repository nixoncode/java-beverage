package com.company;

public class StudentMarks {

    public static void main(String[] args) {
        int[] student_marks = {59, 64, 36, 85, 92, 54, 55, 76, 47, 60};


        int total = 0;

        for (int i = 0; i < student_marks.length; i++) {
            System.out.println(student_marks[i]);
            total += student_marks[i];
        }

        int average = total / student_marks.length;

        System.out.println("The total marks is " + total + " and the average is: " + average);
    }
}
