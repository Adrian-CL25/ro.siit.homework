package quiz2;

public class Delivery implements Runnable{
    private String adress;
    private String dateToDeliv;
    private long distanceToTime;

    public Delivery(String adress, String dateToDeliv, long distanceToTime) {
        this.adress = adress;
        this.dateToDeliv = dateToDeliv;
        this.distanceToTime = distanceToTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(distanceToTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
