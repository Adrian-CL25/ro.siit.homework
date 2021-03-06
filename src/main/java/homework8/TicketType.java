package homework8;

import java.util.Random;

public class TicketType {
    enum tickets {
        FULL, FULLVIP, FREEPASS, ONEDAY, ONEDAYVIP;

        public static tickets generateRandomTickets() {
            tickets[] values = tickets.values();
            int length = values.length;
            int randIndex = new Random().nextInt(length);
            return values[randIndex];
        }
    }

}
