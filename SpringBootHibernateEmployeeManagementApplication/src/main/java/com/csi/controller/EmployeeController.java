package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceimpl;

    @PostMapping("/signup")
    public ResponseEntity<String>signUp(@RequestBody Employee employee){
        employeeServiceimpl.signUp(employee);
        return ResponseEntity.ok("SignUp Successfully");
    }
    @GetMapping("/signin/{empEmailId}/{empPassword}")
    public ResponseEntity<Boolean>signIn(@PathVariable  String empEmailId,@PathVariable String empPassword){

        return ResponseEntity.ok(employeeServiceimpl.signIn(empEmailId,empPassword));
    }
    @GetMapping("/getdatabyid/{empId}")
    public ResponseEntity<Employee>getDataById(@PathVariable int empId){
        return  ResponseEntity.ok(employeeServiceimpl.getDataById(empId));
    }
    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>>getAllData(){
        return ResponseEntity.ok(employeeServiceimpl.getAllData());
    }
    @GetMapping("/getdatabyname/{empName}")
    public ResponseEntity<List<Employee>>getDataByName(@PathVariable String empName){
        return  ResponseEntity.ok(employeeServiceimpl.getDataByName(empName));

    }
    @GetMapping("/filterdatabysalary/{empSalary}")
    public ResponseEntity<List<Employee>>filterDataBySalary(@PathVariable double empSalary){
        return  ResponseEntity.ok(employeeServiceimpl.filterDataBySalary(empSalary));
    }
    @PutMapping("/updatedatabyid/{empId}")
    public ResponseEntity<String>updateDataById(@PathVariable int empId, @RequestBody Employee employee){
        employeeServiceimpl.updateDataById(empId,employee);
        return ResponseEntity.ok("Data Updated Succesfully");
    }
    @DeleteMapping("/deletedatabyid/{empId}")
    public ResponseEntity<String>deleteDataById(@PathVariable int empId){
        employeeServiceimpl.deleteDataById(empId);
        return ResponseEntity.ok("Data Deleted Successfully");
    }
    @DeleteMapping("/deletealldata")
    public ResponseEntity<String>deleteAllData(){
        employeeServiceimpl.deleteAllData();
        return ResponseEntity.ok("Data Deleted Successfully");
    }

}
