public class path implements Runnable{
    int s;
    car c;
    public path(int s, car c){
        this.s = s*1000;
        this.c = c;
    }
    @Override
    public void run() {
        int time = 0;
        double av = 0;
        double obshayV = 0;
        double vMs;
        int timeOst;
        for(int i = s; i>0; i= (int) (i-vMs)){
            vMs = c.getV()*0.28;
            time++;
            obshayV = obshayV + vMs;
            av = (int) ((obshayV)/time);
            timeOst = (int) (i/av);
            System.out.println("Скорость: " + c.getV()+" км/ч");
            System.out.println("Средняя скорость: "+ String.format("%1$,.2f", av/0.28) + " км/ч");
            System.out.println("Осталось: " + i/1000 + " км.");
            System.out.println("Прибытие через: " + timeOst + " с.");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}