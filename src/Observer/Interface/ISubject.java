package Observer.Interface;

public interface ISubject {
    void subscribe(IObserver o);

    void unsubscribe(IObserver o);

    void notifyUpdate();
}
