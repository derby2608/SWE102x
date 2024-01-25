package com.example.swe102x_assignment3;

public class GradeRating {
    public char numberToStringGrade (int grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("Grade can't be lower than 0");
        } else if (grade > 100) {
            throw new IllegalArgumentException("Grade can't be greater than 100");
        } else if (grade <= 50) {
            return 'F';
        } else if (grade <= 60) {
            return 'D';
        } else if (grade <= 70) {
            return 'C';
        } else if (grade <= 80) {
            return 'B';
        }
        return 'A';
    }
}
