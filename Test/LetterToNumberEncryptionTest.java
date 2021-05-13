import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterToNumberEncryptionTest {

    @Test
    void fromStringToNumber() {
        // Act

        String test1 = LetterToNumberEncryption.fromStringToNumber("Hej");
        String test2 = LetterToNumberEncryption.fromStringToNumber("Hello World");
        String test3 = LetterToNumberEncryption.fromStringToNumber("Det er Amanda");



        // Assert

        assertEquals("7-4-9",test1);
        assertEquals("7-4-11-11-14-22-14-17-11-3",test2);
        assertEquals("3-4-19-4-17-0-12-0-13-3-0",test3);
    }
}
