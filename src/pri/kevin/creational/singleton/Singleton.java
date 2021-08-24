package pri.kevin.creational.singleton;

import java.util.concurrent.TimeUnit;

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try {
            TimeUnit.SECONDS.sleep(10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

}
