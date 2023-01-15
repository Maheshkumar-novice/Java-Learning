package binumber;

public class BiNumber {
    private int number1;
    private int number2;

    public BiNumber(int number1, int number2) {
        setNumber1(number1);
        setNumber2(number2);
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number) {
        this.number1 = number;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number) {
        this.number2 = number;
    }

    public int add() {
        return number1 + number2;
    }

    public int multiply() {
        return number1 * number2;
    }

    public void doubleTheValues() {
        setNumber1(number1 * 2);
        setNumber2(number2 * 2);
    }
}