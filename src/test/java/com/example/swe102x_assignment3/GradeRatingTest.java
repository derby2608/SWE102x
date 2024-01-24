package com.example.swe102x_assignment3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeRatingTest {
    @Test
    @DisplayName("45 = F")
    void fGradeFor45(){
        var gradeTest = new GradeRating();
        assertEquals('F', gradeTest.numberToStringGrade(45));
    }
    @Test
    @DisplayName("50 = F")
    void fGradeFor50(){
        var gradeTest = new GradeRating();
        assertEquals('F', gradeTest.numberToStringGrade(50));
    }
    @Test
    @DisplayName("55 = D")
    void dGradeFor55(){
        var gradeTest = new GradeRating();
        assertEquals('D', gradeTest.numberToStringGrade(55));
    }
    @Test
    @DisplayName("60 = D")
    void dGradeFor60(){
        var gradeTest = new GradeRating();
        assertEquals('D', gradeTest.numberToStringGrade(60));
    }
    @Test
    @DisplayName("65 = C")
    void cGradeFor65(){
        var gradeTest = new GradeRating();
        assertEquals('C', gradeTest.numberToStringGrade(65));
    }
    @Test
    @DisplayName("70 = C")
    void cGradeFor70(){
        var gradeTest = new GradeRating();
        assertEquals('C', gradeTest.numberToStringGrade(70));
    }
    @Test
    @DisplayName("75 = B")
    void bGradeFor75(){
        var gradeTest = new GradeRating();
        assertEquals('B', gradeTest.numberToStringGrade(75));
    }
    @Test
    @DisplayName("80 = B")
    void bGradeFor80(){
        var gradeTest = new GradeRating();
        assertEquals('B', gradeTest.numberToStringGrade(80));
    }
    @Test
    @DisplayName("85 = A")
    void aGradeFor85(){
        var gradeTest = new GradeRating();
        assertEquals('A', gradeTest.numberToStringGrade(85));
    }
    @Test
    @DisplayName("100 = A")
    void aGradeFor100(){
        var gradeTest = new GradeRating();
        assertEquals('A', gradeTest.numberToStringGrade(100));
    }
    @Test
    @DisplayName("Value < 0 isn't allowed")
    void notAvailableForLessThan0(){
        var gradeTest = new GradeRating();
        assertThrows(IllegalArgumentException.class, () ->    {
            gradeTest.numberToStringGrade(-5);
        });
    }
    @Test
    @DisplayName("Value > 100 isn't allowed")
    void notAvailableForGreaterThan100(){
        var gradeTest = new GradeRating();
        assertThrows(IllegalArgumentException.class, () ->    {
            gradeTest.numberToStringGrade(105);
        });
    }
}