package model;

import java.util.ArrayList;

public class Scrabble {

    public int wordNumberValue(String yourWord){

        char [] splitWords = yourWord.toCharArray();
        ArrayList<Integer> numberTotal = new ArrayList<Integer>();
        for( int iterator : splitWords){
            if( iterator == 'a' || iterator == 'e' || iterator== 'i'|| iterator=='o'||
                iterator=='u'|| iterator=='l'|| iterator=='n'|| iterator=='r'|| iterator=='s'|| iterator=='t'){
                numberTotal.add(1);
            }

        }

        int sum = 0;
        for(int iterator:numberTotal)
            sum += iterator;

        return sum;
    }
}
