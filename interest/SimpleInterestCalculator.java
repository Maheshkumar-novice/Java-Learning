package interest;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    private BigDecimal principal_amount;
    private BigDecimal interest;

    public SimpleInterestCalculator(BigDecimal principal_amount, BigDecimal interest) {
        setPrincipalAmount(principal_amount);
        setInterest(interest);
    }

    public BigDecimal getPrincipalAmount() {
        return principal_amount;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setPrincipalAmount(BigDecimal principal_amount) {
        this.principal_amount = principal_amount;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal calculateValueForYears(int years) {
        return principal_amount.add(principal_amount.multiply(new BigDecimal(years)).multiply(interest));
    }
}