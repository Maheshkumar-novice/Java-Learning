package interest;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args) {
        BigDecimal principal_amount = new BigDecimal(args[0]);
        BigDecimal interest = new BigDecimal(args[1]).divide(new BigDecimal(100));
        SimpleInterestCalculator calculator = new SimpleInterestCalculator(principal_amount, interest);


        BigDecimal valueAfterGivenYears = calculator.calculateValueForYears(Integer.parseInt(args[2]));

        System.out.println(valueAfterGivenYears);
    }
}