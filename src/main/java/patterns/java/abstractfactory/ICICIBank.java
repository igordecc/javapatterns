package patterns.java.abstractfactory;

public class ICICIBank implements Bank {
    final String BNAME = "ICICI";

    @Override
    public String getBankName() {
        return BNAME;
    }
}
