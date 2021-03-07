package homework8;

public class FestivalAttendeeThread implements Runnable {
    private TicketType ticketType;
    private FestivalGate gate;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate festivalGate){
        this.ticketType = ticketType;
        this.gate = festivalGate;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // validarea ticketului
        this.gate.getAttendeesQueue().add(ticketType);
        System.out.println("added " + ticketType.name());
    }

//        @Override
//    public void run() {
//        gate.put(ticketType);
//    }
}
