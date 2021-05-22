package com.ellsom.service;

import com.ellsom.dao.employeeMapper;
import com.ellsom.pojo.employee;

import java.util.List;

public class empServiceImp implements empService {
    private employeeMapper empMapper;
    public void setMapper(employeeMapper e){
        empMapper=e;
    }
    public employee findMgr(int empNo) {
        return empMapper.findMgr(empNo);
    }

    public int addEmp(employee e) {
        return empMapper.addEmp(e);
    }

    public int deleteEmp(int empNo) {
        return empMapper.deleteEmp(empNo);
    }

    public int upDateEmp(employee e) {
        return empMapper.upDateEmp(e);
    }

    public employee findEmp(int empNo) {
        return empMapper.findEmp(empNo);
    }

    public List<employee> findAll() {
        return empMapper.findAll();
    }

    public List<employee> SelectByName(String name) { return empMapper.SelectByname(name); }
}
