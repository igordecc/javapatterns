package patterns.java.abstractfactory;

public class HomeLoan extends Loan {
    protected double rate = 5.5;

    @Override
    public double getInterestRate() {
        return rate;
    }
}
