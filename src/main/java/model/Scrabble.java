package model;

import java.util.ArrayList;

public class Scrabble {

    public int wordNumberValue(String yourWord){

        char [] splitWords = yourWord.toCharArray();
        ArrayList<Integer> numberTotal = new ArrayList<Integer>();
        for( int iterator : splitWords){
            if(     (iterator == 'a'   || iterator == 'A') || ( iterator == 'e'|| iterator == 'E') ||
                    (iterator == 'i'   || iterator == 'I') || ( iterator == 'o'|| iterator == 'O') ||
                    (iterator == 'u'   || iterator == 'U') || ( iterator == 'l'|| iterator == 'L') ||
                    (iterator == 'n'   || iterator == 'N') || ( iterator == 'r'|| iterator == 'R') ||
                    (iterator == 's'   || iterator == 'S') || ( iterator == 't'|| iterator == 'T') )
            {
                numberTotal.add(1);

            }else if( (iterator == 'd' || iterator == 'D' )|| ( iterator == 'g'|| iterator == 'G'))
            {
                numberTotal.add(2);

            }else if( (iterator == 'b' || iterator == 'B') || ( iterator =='c' || iterator == 'C') ||
                      (iterator == 'm' || iterator == 'M') || ( iterator == 'p'|| iterator == 'P') )
            {
                numberTotal.add(3);

            }else if( (iterator =='f'  || iterator == 'F') || (iterator ==  'h' || iterator == 'H')||
                      (iterator == 'v' || iterator == 'V') || (iterator == 'w'  ||   iterator == 'W')||
                      (iterator == 'y' || iterator == 'Y'))
            {
                numberTotal.add(4);

            }else if( (iterator == 'k' || iterator == 'K'))
            {
                numberTotal.add(5);

            }else if( (iterator == 'j' || iterator == 'J') || (iterator == 'x' || iterator == 'X'))
            {
                numberTotal.add(8);
            }

        }

        int sum = 0;
        for(int iterator:numberTotal)
            sum += iterator;

        return sum;
    }
}
