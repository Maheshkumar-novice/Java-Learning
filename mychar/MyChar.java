package mychar;

public class MyChar {
    private char stored_value;

    public MyChar(char stored_value) {
        setStoredValue(stored_value);
    }

    public char getStoredValue() {
        return stored_value;
    }

    public void setStoredValue(char stored_value) {
        this.stored_value = stored_value;
    }

    public boolean isDigit() {
        if (stored_value >= 48 & stored_value <= 57) {
            return true;
        }
        return false;
    }

    public boolean isAlphabet() {
        if ((stored_value >= 65 & stored_value <= 90) | (stored_value >= 97 & stored_value <= 122)) {
            return true;
        }
        return false;
    }

    public boolean isVowel() {
        if (stored_value == 65 | stored_value == 69 | stored_value == 73 | stored_value == 79 | stored_value == 85) {
            return true;
        }

        if (stored_value == 97 | stored_value == 101 | stored_value == 105 | stored_value == 111 | stored_value == 117) {
            return true;
        }
        return false;
    }

    public boolean isConsonant() {
        return isAlphabet() & !isVowel();
    }

    public void printLowerCaseAlphabets() {
        for (int i = 97; i <= 122; i++) {
            System.out.println((char) i);
        }
    }

    public void printUpperCaseAlphabet() {
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i);
        }
    }
}