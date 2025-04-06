import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.sun.imageio.plugins.jpeg.JPEG.COM;

public class TRIETGIA implements Runnable {
    private int id;

    public TRIETGIA(int id) {
        this.id = id;
    }

    public void run() {
        while (true) {
            suyNghi();
            an();
        }
    }

    public void suyNghi() {
        System.out.println("Triet gia " + id + " dang suy nghi.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void an() {
        int DUATRAI = id;
        int DUAPHAI = (id + 1) % KHOITAODUA.NUM_TRIETGIA;

        boolean layDuaTrai = KHOITAODUA.DUA[DUATRAI].tryLock();
        boolean layDuaPhai = KHOITAODUA.DUA[DUAPHAI].tryLock();

        KHOITAODUA.LAYCOM[COM].lock();
        try {
            if (COM <= 0) {
                System.out.println("Triet gia " + id + " khong the an vi het com.");
                return;
            }
        } finally {
            KHOITAODUA.LAYCOM[COM].unlock();
        }

        if (layDuaPhai && layDuaTrai) {
            KHOITAODUA.LAYCOM[COM].lock();
            try {
                if (COM > 0) {
                    COM--;
                    System.out.println("Triet gia " + id + " dang an, com con lai " + COM + " phan");
                } else {
                    System.out.println("Triet gia " + id + " khong the an vi het com.");
                }
            } finally {
                KHOITAODUA.LAYCOM[COM].unlock();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                KHOITAODUA.DUA[DUAPHAI].unlock();
                KHOITAODUA.DUA[DUATRAI].unlock();
            }
        } else {
            if (layDuaPhai) {
                KHOITAODUA.DUA[DUAPHAI].unlock();
            }
            if (layDuaTrai) {
                KHOITAODUA.DUA[DUATRAI].unlock();
            }
        }
    }
}
