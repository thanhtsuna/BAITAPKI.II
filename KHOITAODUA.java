import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.*;

public class KHOITAODUA {

    public static final int NUM_TRIETGIA = 5;
    public static final int COM = 10;


    public static Lock[] DUA = new ReentrantLock[NUM_TRIETGIA];
    public static Lock[] LAYCOM = new ReentrantLock[COM];

    static {
    for(int i = 0; i<NUM_TRIETGIA;i++){
        DUA[i] = new ReentrantLock();
    }
  }
}
