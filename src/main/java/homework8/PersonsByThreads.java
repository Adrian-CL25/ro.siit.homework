package homework8;

public class PersonsByThreads extends Thread {
    @Override
    public void run() {

        for(int i = 1 ; i<=100; i++){
            System.out.println("Person number: "+ i +" " + TicketType.tickets.generateRandomTickets());
        }

    }
}
