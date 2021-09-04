package FootballScore;

public class Person1st implements MyObs {
    public void update(Source obj) {
        System.out.println("Live Result : " + ((HeadQuater)obj).getSomeData());
    }
}
