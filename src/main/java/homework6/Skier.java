package homework6;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Builder
@Data
@Getter
@Setter

public class Skier {
    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private LocalTime result;
    private String shootingRange;



    public static Skier mapLineToSkier(String line) {

        String[] fields = line.split(",");
        return Skier.builder()
                .athleteNumber(Integer.parseInt(fields[0]))
                .athleteName(fields[1])
                .countryCode(fields[2])
                .result(mapResultToLocalTime(fields[3]))
                .shootingRange(fields[4] + fields[5] + fields[6])
                .build();
    }


    public static LocalTime mapResultToLocalTime(String timeInCSV) {
        String[] time = timeInCSV.split(":");
        return LocalTime.of(0, Integer.parseInt(time[0]), Integer.parseInt(time[1]));
    }

    public void applyPenalties(Skier skier) {

        LocalTime localTime = LocalTime.of(0, 0, 0);
        char[] results = skier.shootingRange.toCharArray();
        for (char t : results) {
            if (t == 'o') {
                skier.setResult(skier.getResult().plusSeconds(10));
                skier.setShootingRange(skier.getShootingRange()+10);
            }
        }
    }

}

