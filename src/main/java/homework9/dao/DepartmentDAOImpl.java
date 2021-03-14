package homework9.dao;

import homework9.Department;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class DepartmentDAOImpl implements DepartmentDAO {
    @Override
    public List<Department> findAll() {
        List<Department> departmentList = new ArrayList<>();
        Connection connection = getConnexion2();

        try {
            String url = "SELECT * FROM dept";
            PreparedStatement preparedStatement = connection.prepareStatement(url);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Department d = Department.builder()
                        .departmentName(resultSet.getString("DNAME"))
                        .deparmentNo(resultSet.getInt("DEPTNO"))
                        .city(resultSet.getString("CITY"))
                        .build();
                departmentList.add(d);
            }



        } catch (SQLException exception) {
            log.error(exception);
        }

        return departmentList;
    }


    @Override
    public Department insertDepartment(Department department) {

        Connection connection = getConnexion2();
        int affectedRows = 0;
        String url = "INSERT INTO dept(DEPTNO,DNAME,CITY)" + " VALUES \n (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(url);
            preparedStatement.setInt(1, department.getDeparmentNo());
            preparedStatement.setString(2, department.getDepartmentName());
            preparedStatement.setString(3, department.getCity());
            affectedRows = preparedStatement.executeUpdate();
            System.out.println(affectedRows);


        } catch (SQLException exception) {
            log.error(exception);
        }
        return null;
    }


    @Override
    public void deleteDepartment(int no) {
        Connection connection = getConnexion2();
        int affectedRows = 0;
        String url = "DELETE FROM dept WHERE DEPTNO = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(url);
            preparedStatement.setInt(1, no);
            affectedRows = preparedStatement.executeUpdate();
            System.out.println(affectedRows);

        } catch (SQLException exception) {
            log.error(exception);
        }

    }


    @Override
    public Department findDepartmentByCity(String department) {

        try {
            Connection connection = getConnexion2();
            String query = "SELECT DEPTNO,DNAME,CITY FROM dept WHERE CITY = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, department);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(Department.builder()
                        .departmentName(resultSet.getString("DNAME"))
                        .city(resultSet.getString("CITY"))
                        .deparmentNo(resultSet.getInt("DEPTNO"))
                        .build());
            }

        } catch (SQLException exception) {
            log.error(exception);
        }

        return null;
    }

    @Override
    public void updateDepartment(int no, String newCity) {
        Connection connection = getConnexion2();
        int affectedRows = 0;
        String url = "UPDATE dept SET CITY = ? WHERE DEPTNO = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(url);
            preparedStatement.setString(1, newCity);
            preparedStatement.setInt(2, no);

            preparedStatement.executeUpdate();
            System.out.println(preparedStatement.toString());
            System.out.println(affectedRows);

        } catch (SQLException exception) {
            log.error(exception);
        }
    }

    private Connection getConnexion2() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hr",
                    "root",
                    "admin"
            );
        } catch (SQLException exception) {
            log.error(exception);
        }
        return null;
    }
}
