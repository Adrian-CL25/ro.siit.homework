package homework9.dao;

import homework9.Employee;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class EmployeeDaoImpl implements EmployeeDAO {
    @Override
    public List<Employee> findAll() {

        List<Employee> employeeList = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM emp";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Employee em = Employee.builder()
                        .name(resultSet.getString("ENAME"))
                        .employeeNo(resultSet.getInt("EMPNO"))
                        .employeeSalary(resultSet.getInt("SAL"))
                        .job(resultSet.getString("JOB"))
                        .build();
                employeeList.add(em);
            }
        } catch (SQLException e) {
            log.error(e);
        }
        return employeeList;
    }


    @Override
    public Employee insertEmployee(Employee employee) {

        try (Connection connection = getConnection()) {
            String sql = "INSERT INTO emp(EMPNO,ENAME,JOB,MGR,SAL) VALUES \n " +
                    "(?, ?, ?, ?, ? )";
            int affectedRows;
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, employee.getEmployeeNo());
                preparedStatement.setString(2, employee.getName());
                preparedStatement.setString(3, employee.getJob());
                preparedStatement.setInt(4, employee.getEmployeeManager());
                preparedStatement.setInt(5, employee.getEmployeeSalary());

                affectedRows = preparedStatement.executeUpdate();
            }
            System.out.println(affectedRows);

        } catch (SQLException e) {
            log.error(e);
        }
        return null;

    }


    @Override
    public Employee findEmployeeByNameContaining(String expresie) {

        try (Connection connection = getConnection()) {
            String sql = " SELECT EMPNO,SAL,ENAME,JOB  FROM emp WHERE  ENAME LIKE ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, expresie);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(Employee.builder()
                        .name(resultSet.getString("ENAME"))
                        .employeeNo(resultSet.getInt("EMPNO"))
                        .employeeSalary(resultSet.getInt("SAL"))
                        .job(resultSet.getString("JOB"))
                        .build());
            }

        } catch (SQLException e) {
            log.error(e);
        }
        return null;
    }


    @Override
    public void delete(int no) {

        try (Connection connection = getConnection()) {
            String sql = "DELETE FROM emp WHERE EMPNO = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, no);

            int affectedRows;

            affectedRows = preparedStatement.executeUpdate();

            System.out.println(affectedRows);

        } catch (SQLException exception) {
            log.error(exception);
        }
    }

    public void updateEmployee(int no, String job) {
        Connection connection = getConnection();
        int affectedRows = 0;
        String url = "UPDATE emp SET JOB = ? WHERE EMPNO = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(url);
            preparedStatement.setString(1,job);
            preparedStatement.setInt(2, no);

            preparedStatement.executeUpdate();
            System.out.println(preparedStatement.toString());
            System.out.println(affectedRows);

        } catch (SQLException exception) {
            log.error(exception);
        }
    }


    private Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hr",
                    "root",
                    "admin");

        } catch (SQLException ex) {
            log.error(ex);
        }
        return null;
    }
}
