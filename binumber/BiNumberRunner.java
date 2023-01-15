package binumber;

public class BiNumberRunner {
    public static void main(String[] args) {
        BiNumber binumber = new BiNumber(100, 200);
        System.out.println(binumber.getNumber1());
        System.out.println(binumber.getNumber2());
        System.out.println(binumber.add());
        System.out.println(binumber.multiply());
        binumber.doubleTheValues();
        System.out.println(binumber.getNumber1());
        System.out.println(binumber.getNumber2());
    }
}