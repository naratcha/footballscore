package FootballScore;

public interface Source {
    public void notifyObserver();
    public void register(MyObs observer);
}