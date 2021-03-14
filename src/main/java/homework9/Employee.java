package homework9;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@Data
public class Employee {
    private String job;
    private String name;
    private int employeeNo;
    private int employeeManager;
    private int employeeSalary;
    private int employeeComm;
    private int employeeDepartmentNo;
    private LocalDate hireDate;

}
