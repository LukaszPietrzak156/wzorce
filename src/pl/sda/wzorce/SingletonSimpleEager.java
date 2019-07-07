package pl.sda.wzorce;

public class SingletonSimpleEager {

    // chetny
    private static final SingletonSimpleEager instance = new SingleSimpleEager();

    private SingletonSimpleEager() {

    }

    public static SingletonSimpleEager getInstance() {
        return instance;
    }

    //wywołanie chetny
    SingletonSimpleEager singleton = SingletonSimpleeager.getInstance();


}
