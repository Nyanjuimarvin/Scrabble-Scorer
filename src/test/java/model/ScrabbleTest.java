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
}