package FootballScore;
import java.util.*;

public class HeadQuater implements Source {
    private final ArrayList<MyObs> list;
    private String somedata;

    public HeadQuater() {
        this.list = new ArrayList<MyObs>();
    }

    public void setSomeData(String adata) {
        somedata = adata;
        notifyObserver();
    }

    public String getSomeData() {
        return somedata;
    }

    public void register(MyObs observer) {
        list.add(observer);
    }

    public void notifyObserver() {
        for(int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
        }
    } 

}