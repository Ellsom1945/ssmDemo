package com.ellsom.dao;

import com.ellsom.pojo.employee;

import java.util.List;

public interface employeeMapper {
        employee findMgr(int empNo);
        int addEmp(employee e);
        int deleteEmp(int empNo);
        int upDateEmp(employee e);
        employee findEmp(int empNo);
        List<employee> findAll();
        List<employee> SelectByname(String name);
}
/*
 private String name;
    private String job;
    private int mgr;
    private Date hireDate;
    private int salary;
    private int comm;
    private int deptNo;
    private int empNo;
 */