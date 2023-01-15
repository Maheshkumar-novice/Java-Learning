package mychar;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar mychar = new MyChar((char) args[0].charAt(0));
        System.out.println(mychar.getStoredValue());
        System.out.println(mychar.isDigit());
        System.out.println(mychar.isAlphabet());
        System.out.println(mychar.isVowel());
        System.out.println(mychar.isConsonant());
        mychar.printLowerCaseAlphabets();
        mychar.printUpperCaseAlphabet();
    }
}