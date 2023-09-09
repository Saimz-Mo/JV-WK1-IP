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

}
