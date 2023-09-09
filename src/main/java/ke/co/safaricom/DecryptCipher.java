package ke.co.safaricom;

public class DecryptCipher {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',};

    private  char c;
    private int key;

    public DecryptCipher() {

    }

    public DecryptCipher(char c, int key) {
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



}
