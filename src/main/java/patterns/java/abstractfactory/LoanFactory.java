package patterns.java.abstractfactory;

public class LoanFactory extends AbstractFactory{

    @Override
    public Loan getLoan(String loanChoice){
        switch (loanChoice) {
            case "HomeLoan":
                return new HomeLoan();
            case "BusinessLoan":
                return new BusinessLoan();
            case "EducationLoan":
                return new EducationLoan();
            default:
                return null;
        }
    }

    @Override
    public Bank getBank(String bankChoice) {
        return null;
    }
}
