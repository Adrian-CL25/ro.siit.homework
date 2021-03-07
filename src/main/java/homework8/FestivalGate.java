package homework8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

import lombok.Data;

@Data
public class FestivalGate {

    private Queue<TicketType> attendeesQueue = new ConcurrentLinkedQueue<>();

    public synchronized void put(TicketType ticketType){
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // validarea ticketului
        attendeesQueue.add(ticketType);
        System.out.println("added " + ticketType.name());
    }

    public synchronized Queue<TicketType> get(){
        return attendeesQueue;
    }

}
