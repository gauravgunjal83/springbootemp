package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

   @Id
    @GeneratedValue
    @Column(name = "emp_id")
    private int empId;

    @Column(name="emp_name")
    private String empName;

    @Column(name="emp_address")
    private String empAddress;

    @Column(name="emp_contactnumber")
    private long EmpContactNumber;

    @Column(name="emp_salary")
    private double empsalary;

    @Column(name="emp_dob")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

    @Column(name="emp_email")
    private String empEmailId;

    @Column(name="emp_pswrd")
    private String empPassword;


}
