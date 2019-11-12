import static org.junit.Assert.*;
import org.junit.*;

public class CaesarCipherTest {

    @Test
    public void test_instanceOfClassCaesarCipher_true(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
    }

    @Test
    public void encode_encodeASingleLetterWithRightShiftWithinBounds_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals("b", testCaesarCipher.getCipherText());
    }

    @Test
    public void encode_encodeASingleLetterWithRightShiftOutOfBounds_a(){
        CaesarCipher testCaesarCipher = new CaesarCipher("b",1);
        assertEquals("c", testCaesarCipher.getCipherText());
    }

    @Test
    public void encode_multiCharacterString_String(){
        CaesarCipher testCaesarCipher = new CaesarCipher("Kevin",1);
        assertEquals("Lfwjo", testCaesarCipher.getCipherText());
    }

    @Test
    public void decode_reverseEncode_String(){
        CaesarCipher testCaesarCipher = new CaesarCipher("Lfwjo", 1);
        assertEquals("Kevin", testCaesarCipher.getPlainText());
    }





}