package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleTest {

    Scrabble myScrabble;

    @BeforeEach
    void setUp(){
        myScrabble = new Scrabble();
    }

    @Test
    @DisplayName("Must Return 1")
    public void runWordNumberValue_forLettersThatAre1_Int() {
        int expectedNumber = 1;
        assertEquals(expectedNumber,myScrabble.wordNumberValue("i"));
    }

    @Test
    @DisplayName("Should Return 2")
    public void runWordNumberValue_forLettersThatAre2_Int(){
        int expectedNumber = 2;
        assertEquals(expectedNumber,myScrabble.wordNumberValue("d"));
    }

    @Test
    @DisplayName("Should Return 3")
    public void runWordNumberValue_forLettersThatAre3_Int(){
        int expectedNumber = 3;
        assertEquals(expectedNumber,myScrabble.wordNumberValue("b"));
    }

    @Test
    @DisplayName("Should Return 4")
    public void runWordNumberValue_forLettersThatAre4_Int(){
        int expectedNumber = 4;
        assertEquals(expectedNumber,myScrabble.wordNumberValue("f"));
    }

    @Test
    @DisplayName("Should Return 5")
    public void runWordNumberValue_forLettersThatAre5_Int(){
        int expectedNumber = 5;
        assertEquals(expectedNumber,myScrabble.wordNumberValue("k"));
    }

    @Test
    @DisplayName("Should Return 8")
    public void runWordNumberValue_forLettersThatAre8_Int(){
        int expectedNumber = 8;
        assertEquals(expectedNumber,myScrabble.wordNumberValue("j"));
    }

    @Test
    @DisplayName("Should Return 10")
    public void runWordNumberValue_forLettersThatAre10_Int(){
        int expectedNumber = 10;
        assertEquals(expectedNumber,myScrabble.wordNumberValue("Z"));
    }
}