package com.robin.mapper;

import com.robin.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> getEmplyeeList();

    int addEmployee(Employee employee);

}
