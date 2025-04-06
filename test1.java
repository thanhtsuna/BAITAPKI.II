package BT1;

public class test1 {
    public static void main(String[] args) {
        int[] SN = {1,2,3,4,5,6,7,8,9,10};
            Thread t1 = new timSoLe(SN);

        t1.start();
        //t2.start();
    }
}
