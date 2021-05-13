/*
Exercise 2
Letter to number cipher
Today we are doing a foundational encryption algorithm which many latter encryption algorithms are built upon
a so called substitute cipher. It is your task to write a class ”LetterToNumberEncryption” with the following method:
• fromStringToNumber(String)
The method takes a String and returns an encrypted message. The encryption replaces each letter with
its corresponding place in the alphabet, such that the input abc will yield the result 0-1-2 & lobster will
yield the result 12-14-1-18-19-4-17.
Write the corresponding unit tests, to identify if your cipher encrypts messages correctly.

 */

public class LetterToNumberEncryption {

    public static String fromStringToNumber(String s){
        s = s.toLowerCase();
        s = s.replace(" ","");
        String finalMessage = null;
        char[] chars = s.toCharArray();

        for (char letter:chars){
            int temp = letter - 'a';
            finalMessage += temp + "-";
        }
        finalMessage = finalMessage.replace("null","");
        finalMessage = finalMessage.substring(0, finalMessage.length() - 1);
        return finalMessage;
    }
}

