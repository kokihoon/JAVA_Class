public class W07P01 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        for(int i = 0; i < 100; i++) {
            smartphone.decreaseVolume();
        }
        smartphone.increaseVolume();
        System.out.println(smartphone);
    }
}
