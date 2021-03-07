package homework8;

import java.util.EnumMap;
import java.util.Queue;
import java.util.Set;

public class FestivalStatisticsThread extends Thread {
    private FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate festivalGate){
        this.gate = festivalGate;
    }

    @Override
    public void run() {
        boolean was500Already = false;
        while(true) {
            System.out.println("a intrat in while");
            var attendeesQueue = this.gate.getAttendeesQueue();

            if (attendeesQueue.isEmpty()){
                continue;
            }
            if (was500Already){
                break;
            }
            if (attendeesQueue.size() == 500){
                was500Already = true;
            }

            EnumMap<TicketType, Integer> report = new EnumMap<>(TicketType.class);
            for (TicketType ticketType : attendeesQueue) {
                if (report.containsKey(ticketType)) {
                    report.put(ticketType, report.get(ticketType) + 1);
                } else {
                    report.put(ticketType, 1);
                }
            }

            Set<TicketType> ticketTypes = report.keySet();
            System.out.println(report.values().stream().mapToInt(v -> v).sum() + " people have entered");
            for (TicketType type : ticketTypes) {
                System.out.println(report.get(type) + " people have " + type.name() + " ticket type");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//    @Override
//    public void run() {
//        boolean was500Already = false;
//        while(true) {
//            System.out.println("a intrat in while");
//            var attendeesQueue = this.gate.get();
//
//            if (attendeesQueue.isEmpty()){
//                continue;
//            }
//            if (was500Already){
//                break;
//            }
//            if (attendeesQueue.size() == 500){
//                was500Already = true;
//            }
//
//            EnumMap<TicketType, Integer> report = new EnumMap<>(TicketType.class);
//            for (TicketType ticketType : attendeesQueue) {
//                if (report.containsKey(ticketType)) {
//                    report.put(ticketType, report.get(ticketType) + 1);
//                } else {
//                    report.put(ticketType, 1);
//                }
//            }
//
//            Set<TicketType> ticketTypes = report.keySet();
//            System.out.println(report.values().stream().mapToInt(v -> v).sum() + " people have entered");
//            for (TicketType type : ticketTypes) {
//                System.out.println(report.get(type) + " people have " + type.name() + " ticket type");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
