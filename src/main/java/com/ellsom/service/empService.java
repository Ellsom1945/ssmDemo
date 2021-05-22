package com.ellsom.service;

import com.ellsom.pojo.employee;

import java.util.List;

public interface empService {
    employee findMgr(int empNo);
    int addEmp(employee e);
    int deleteEmp(int empNo);
    int upDateEmp(employee e);
    employee findEmp(int empNo);
    List<employee> findAll();
    List<employee> SelectByName(String name);
}
