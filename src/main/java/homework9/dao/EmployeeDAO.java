package homework9.dao;

import homework9.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee insertEmployee(Employee employee);
    Employee findEmployeeByNameContaining(String name);
    void delete(int no);
    void updateEmployee(int no,String job);

}
