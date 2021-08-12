package patterns.java.abstractfactory;

public abstract class AbstractFactory {

    public abstract Loan getLoan(String loanChoice);
    public abstract Bank getBank(String bankChoice);

}
