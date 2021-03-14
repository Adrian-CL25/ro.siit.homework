package homework9.dao;

import homework9.Department;

import java.util.List;

public interface DepartmentDAO {
    List<Department> findAll();
    Department insertDepartment(Department department);
    void deleteDepartment(int no);
    Department findDepartmentByCity(String cityName);
    void updateDepartment(int no,String newCity);
}
