package homework7.java8ReadWrite;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
@Getter
@Setter

public class Persoana {
    private String firstName;
    private String lastName;
    private String dateOfBirhday;


    public static Persoana mapLineToPersoana(String line) {

        String[] fields = line.split(",");

        return Persoana.builder()
                .firstName(fields[0])
                .lastName(fields[1])
                .dateOfBirhday(fields[2])
                .build();
    }

//    public static LocalDate mapResultToLocalDate(String date) {
//        String[] time = date.split("-");
//        return LocalDate.of(Integer.parseInt(time[0]),Integer.parseInt(time[1]), Integer.parseInt(time[2]));
//    }
}
