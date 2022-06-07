
/***
 * @author Quincy
 * @version 1.0
 * 
 */

import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MortgageCalculator {
    private int principleAmount;
    // Remember to divide by
    private float annualInterestRate;

    private int periodInYears;

    public MortgageCalculator(int principleAmount, float annualInterestRate, int periodInYears) {
        this.principleAmount = principleAmount;
        this.annualInterestRate = annualInterestRate;
        this.periodInYears = periodInYears;
    }

    // Oooh boi lets see how this went
    BigDecimal calculateMonthlyPayment() {
        float monthlyInterestRate = (annualInterestRate / 100) / 12;

        float monthlyPayment = (float) (principleAmount * monthlyInterestRate
                / (1 - (1 / Math.pow(1 + monthlyInterestRate, periodInYears * 12))));
        return new BigDecimal(monthlyPayment).setScale(2, RoundingMode.HALF_UP);
    }
}
