package patterns.java.abstractfactory;

public class FactoryCreator{

    public static AbstractFactory getFactory(String choice){
        switch (choice){
            case("Bank"):
                return new BankFactory();
            case("LoanFactory"):
                return new LoanFactory();
            default:
                return null;
        }
    }
}
