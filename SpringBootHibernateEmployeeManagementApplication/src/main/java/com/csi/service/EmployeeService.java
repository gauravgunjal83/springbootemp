package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeService {

    public void signUp(Employee employee);

    public boolean signIn(String empEmailId,String empPassword);

    public Employee getDataById(int empId);

    public List<Employee> getAllData();

    public List<Employee>getDataByName(String empName);

    public List<Employee>filterDataBySalary(double empSalary);

    public void updateDataById(int empId,Employee employee);

    public void deleteDataById(int empId);

    public  void deleteAllData();
}
