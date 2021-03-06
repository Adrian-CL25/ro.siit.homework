package homework7.java8ReadWrite;

import lombok.*;

import java.time.LocalDate;

@Builder
@Data
@Getter
@Setter

public class Persoana {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirhday;


    public static Persoana mapLineToPersoana(String line) {

        String[] fields = line.split(",");

        return Persoana.builder()
                .firstName(fields[0])
                .lastName(fields[1])
                .dateOfBirhday(mapResultToLocalDate(fields[2]))
                .build();
    }

    public static LocalDate mapResultToLocalDate(String date) {
        String[] time = date.split("-");
        return LocalDate.of(Integer.parseInt(time[0]),Integer.parseInt(time[1]), Integer.parseInt(time[2]));
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +" "+ dateOfBirhday +"\n";
    }
}
