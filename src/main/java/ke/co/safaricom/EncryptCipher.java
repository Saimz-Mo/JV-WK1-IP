package ke.co.safaricom;

import java.util.Arrays;

public class EncryptCipher {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',};

    private char c;
    private int key;

    public EncryptCipher() {

    }

    public EncryptCipher(char c, int key){
        this.c = c;
        this.key = key;

    }

    public Character[] getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(Character[] alphabet) {
        this.alphabet = alphabet;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = Character.toUpperCase(c);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public char encrypt() {
        int index = Arrays.asList(alphabet).indexOf(c);
        int newIndex = (index + key) % 26;

        if (c==' '){
            return ' ';
        }

        if (c >= '0' && c <='9') {
            return c;
        }

        if (c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':' || c == '\'' || c == '\"' || c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}' || c == '<' || c == '>' || c == '&' || c == '#' || c == '$' || c == '%' || c == '^' || c == '*' || c == '+' || c == '-' || c == '/' || c == '\\' || c == '|' || c == '=' || c == '_' || c == '~' || c == '`' || c == '@' || c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':' || c == '\'' || c == '\"' || c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}' || c == '<' || c == '>' || c == '&' || c == '#' || c == '$' || c == '%' || c == '^' || c == '*' || c == '+' || c == '-' || c == '/' || c == '\\' || c == '|' || c == '=' || c == '_' || c == '~' || c == '`') {
            return c;
        }

        return alphabet[newIndex];
    }


}
