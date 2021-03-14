package homework9;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Builder
@AllArgsConstructor
@Data
@Log4j2
public class Department  {

    private int deparmentNo;
    private String departmentName;
    private String city;


}
