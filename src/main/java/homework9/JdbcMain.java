package homework9;

import homework9.dao.DepartmentDAO;
import homework9.dao.DepartmentDAOImpl;
import homework9.dao.EmployeeDAO;
import homework9.dao.EmployeeDaoImpl;

public class JdbcMain {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDaoImpl();
        employeeDAO.findAll().forEach(System.out::println);
        System.out.println("---------------------------------");
        employeeDAO.findEmployeeByNameContaining("%K%");

        Employee insertEmployee = Employee.builder()
                .employeeNo(6666)
                .name("ADINA")
                .job("DOC")
                .employeeManager(10)
                .employeeSalary(8000)
                .build();
        employeeDAO.delete(6666);
        employeeDAO.insertEmployee(insertEmployee);
        System.out.println("Update employee id 7499  with new job from salesman to manager");
        employeeDAO.updateEmployee(7499,"MANAGER");


        DepartmentDAO departmentDAO = new DepartmentDAOImpl();
        System.out.println("Read from database:");
        departmentDAO.findAll().forEach(System.out::println);
        System.out.println("---------------------------------");
        System.out.println("Insert new object");
        Department insertDepartment = Department.builder()
                .deparmentNo(60)
                .departmentName("DEVELOPMENT")
                .city("BUCHAREST")
                .build();

        departmentDAO.deleteDepartment(60);
        System.out.println("Delete  object");
        departmentDAO.insertDepartment(insertDepartment);
        System.out.println("---------------------------------");
        System.out.println("Select department by city");
        departmentDAO.findDepartmentByCity("BUCHAREST");
        System.out.println("---------------------------------");
        System.out.println("Update department by  with new city");
        departmentDAO.updateDepartment(10,"Pitesti");


    }




}
