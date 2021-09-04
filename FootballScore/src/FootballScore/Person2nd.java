package FootballScore;

public class Person2nd implements MyObs{
    public void update(Source obj) {
        System.out.println("Live Result : " + ((HeadQuater)obj).getSomeData());
    }
}
