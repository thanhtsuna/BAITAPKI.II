public class main {
    public static void main(String[] args) {
        for(int i = 0;i< KHOITAODUA.NUM_TRIETGIA;i++){
            new Thread(new TRIETGIA(i)).start();
        }
    }
}
