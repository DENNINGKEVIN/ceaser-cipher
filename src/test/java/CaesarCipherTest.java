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
        CaesarCipher testCaesarCipher = new CaesarCipher("z",1);
        assertEquals("a", testCaesarCipher.getCipherText());
    }

    @Test
    public void encode_encodeASingleLetterWithALeftShiftWithinBounds_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("d",-2);
        assertEquals("b", testCaesarCipher.getCipherText());
    }

    @Test
    public void encode_encodeASingleLetterWithALeftShiftOutOfBounds_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",-27);
        assertEquals("z", testCaesarCipher.getCipherText());
    }

    @Test
    public void encode_encodesUpperCaseToUpperCaseAndLowerCaseToLowerCase_B(){
        CaesarCipher testCaesarCipher = new CaesarCipher("A",-25);
        assertEquals("B", testCaesarCipher.getCipherText());
    }

    @Test
    public void encode_doesNotEncodeSymbolsAndPeriods_Space(){
        CaesarCipher testCaesarCipher = new CaesarCipher(" ",-25);
        assertEquals(" ", testCaesarCipher.getCipherText());
    }

    @Test
    public void encode_multiCharacterString_String(){
        CaesarCipher testCaesarCipher = new CaesarCipher("Frank a",1);
        assertEquals("Gsbol b", testCaesarCipher.getCipherText());
    }

    @Test
    public void decode_reverseEncode_String(){
        CaesarCipher testCaesarCipher = new CaesarCipher("Gsbol b", 1);
        assertEquals("Frank a", testCaesarCipher.getPlainText());
    }





}