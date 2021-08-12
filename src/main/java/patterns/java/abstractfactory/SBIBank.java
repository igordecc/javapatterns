package patterns.java.abstractfactory;

public class SBIBank implements Bank {
    final String BNAME = "SBI";

    @Override
    public String getBankName() {
        return BNAME;
    }
}