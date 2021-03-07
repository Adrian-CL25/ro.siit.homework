package homework8;

import lombok.SneakyThrows;

public class DriveApp {
    @SneakyThrows
    public static void main(String[] args) {

        FestivalGate festivalGate = new FestivalGate();
        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(festivalGate);
//        festivalStatisticsThread.setPriority(Thread.MAX_PRIORITY);
        festivalStatisticsThread.start();

        for (int i = 0 ; i < 500 ; i++){
            TicketType random = TicketType.generateRandomTickets();
            FestivalAttendeeThread festivalAttendeeThread = new FestivalAttendeeThread(random, festivalGate);
            Thread att = new Thread(festivalAttendeeThread);
            att.start();
            Thread.sleep(50);
        }




    }
}
