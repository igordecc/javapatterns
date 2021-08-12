package patterns.java.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank hdfcBank = bankFactory.getBank("HDFC");
        System.out.println(hdfcBank.getBankName());
    }
}
