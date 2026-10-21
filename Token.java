
public class Token {

    public enum TokenType{
        NUMBER, STRING, IDENTIFIER,

        LET, DISPLAY, IF, THEN, ELSE,
        TRUE, FALSE,

        PLUS, MINUS, MULTIPLY, DIVIDE,
        MODULUS, POWER,

        ASSIGN, EQUAL, NOT_EQUAL,
        LESS, LESS_EQUAL,
        GREATER, GREATER_EQUAL,

        AND, OR, NOT,

        LEFT_PAREN, RIGHT_PAREN,
        COMMA, SEMICOLON
    }

    private TokenType type;
    private String text;
    private int lineNum;

    public Token(TokenType type, String text, int lineNum){
        this.type = type;
        this.text = text;
        this.lineNum = lineNum;
    }

    @Override
    public String toString(){
        return ("[" + type + "]" + text);
    }

}
