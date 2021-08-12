package patterns.java.abstractfactory;

public class HDFCBank implements Bank {
    final String BNAME = "HDFC";

    @Override
    public String getBankName() {
        return BNAME;
    }
}
