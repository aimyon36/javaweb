package com.google.service;

import com.google.pojo.Employee;

import java.util.List;

public interface EmpService {
    List<Employee> getAllEmp();

    int addEmp(Employee employee);

    int deleteEmp(String name);

    int updateEmp(Employee employee);

    Employee getEmpByName(String name);
}
