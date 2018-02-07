public class Smartphone implements HandlingSound{
    private int volume = 0;
    @Override
    public void increaseVolume() {
        if(volume < 10) {
            volume++;
        }
    }

    @Override
    public void decreaseVolume() {
            if(volume > 0)
                volume--;
    }
    @Override
    public String toString(){
        return "Smartphone: Volume="+volume;
    }
}
