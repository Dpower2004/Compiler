public class Converter {
    char c;
    public Converter(){

    }
    While(//TBD){

        if(Character.isWhitespace(c)){
            break
        }

        else if(Character.isDigit(c)){
            new Token(NUMBER, c, 0);
        }

        else if(Character.isLetter(c)){
            new Token(STRING, c, 0);
        }

        else{
            // Check for operators
        }
    }
}
