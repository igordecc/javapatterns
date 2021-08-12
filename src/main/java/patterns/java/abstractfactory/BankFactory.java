package patterns.java.abstractfactory;

public class BankFactory extends AbstractFactory{

    @Override
    public Bank getBank(String bankChoice){
        switch (bankChoice) {
            case "HDFC":
                return new HDFCBank();
            case "ICICI":
                return new ICICIBank();
            case "SBI":
                return new SBIBank();
            default:
                return null;
        }
    }

    @Override
    public Loan getLoan(String loanChoice) {
        return null;
    }
}
