package patterns.java.abstractfactory;

public class EducationLoan extends Loan {
    protected double rate = 100.1;

    @Override
    double getInterestRate() {
        return rate;
    }
}
