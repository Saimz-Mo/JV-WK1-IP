package ke.co.safaricom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecryptCipherTest {

    @Test
    public void decryptedCharacter_returnsCharPMinusTwoPosition() {
        DecryptCipher encoding= new DecryptCipher();
        encoding.setC('E');
        encoding.setKey(2);
        Character expected = 'C';
        assertEquals(expected, encoding.decrypt());
    }

    @Test
    public void decryptText(){
        String message = "VJG SWKEM DTQYP HQZ";
        String decryptedText = "";

        for(int i = 0; i < message.length(); i++){
            DecryptCipher encoding = new DecryptCipher();
            encoding.setC(message.charAt(i));
            encoding.setKey(2);
            decryptedText += encoding.decrypt();
        }
        assertEquals("THE QUICK BROWN FOX", decryptedText);
    }

    @Test
    public void decryptSpace(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC(' ');
        encoding.setKey(2);
        assertEquals(' ', encoding.decrypt());
    }

    @Test
    public void decryptNumber(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('1');
        encoding.setKey(2);
        assertEquals('1', encoding.decrypt());
    }

    @Test
    public void decryptLowercase(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('c');
        encoding.setKey(2);
        assertEquals('A', encoding.decrypt());
    }

    @Test
    public void decryptUppercase(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('C');
        encoding.setKey(2);
        assertEquals('A', encoding.decrypt());
    }

    @Test
    public void decryptSpecial(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('!');
        encoding.setKey(2);
        assertEquals('!', encoding.decrypt());
    }

    @Test
    public void decryptSpecial4(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('$');
        encoding.setKey(2);
        assertEquals('$', encoding.decrypt());
    }

}
