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
            }else if(iterator == 'd' || iterator == 'g'){
                numberTotal.add(2);
            }else if(iterator == 'b' || iterator =='c'||iterator == 'm'|| iterator == 'p'){
                numberTotal.add(3);
            }else if( iterator =='f' || iterator ==  'h'|| iterator == 'v' || iterator == 'w'||iterator == 'y'  ){
                numberTotal.add(4);
            }

        }

        int sum = 0;
        for(int iterator:numberTotal)
            sum += iterator;

        return sum;
    }
}
