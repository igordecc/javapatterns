package patterns.java.factory;

public class PlanFactory {

    public Plan getPlanInstance(String planType) {

        switch (planType) {
            case "CityPlan":
                return new CityPlan();
            case "CountryPlan":
                return new CountryPlan();
            default:
                return null;
        }
    };
}
