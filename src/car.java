import java.util.Random;

public class car {
    private int v;
    public int getV() {
        Random rd = new Random();
        v=v+ rd.nextInt(6)+5;
        if(v>200) {
            v = v - 10;
        }
        return v;
    }
}