package patterns.java.abstractfactory;

public class BusinessLoan extends Loan {
    protected double rate = 0.1;

    @Override
    double getInterestRate() {
        return rate;
    }
}
