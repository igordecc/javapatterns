package patterns.java.factory;

public class CountryPlan extends  Plan{
    String stat = "3.5";

    @Override
    public String getStats(){
      return stat;
    }
}
