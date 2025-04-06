package BT1;

public class timSoLe extends Thread {
    private int[] SN;
    boolean dungsai = true;

    public timSoLe(int[] SN) {
        this.SN = SN;
    }
    public synchronized void run() {
            for (int i = 0; i < SN.length; i++) {
                if (SN[i] % 2 != 0){
                }
                while (!dungsai) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(SN[i] + " ");
                dungsai = false;
                notify();

        }
    }
}
