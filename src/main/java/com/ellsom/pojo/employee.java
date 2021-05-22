package com.ellsom.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class employee {
    private String name;
    private String job;
    private int mgr;
    private String hireDate;
    private int salary;
    private int comm;
    private int deptNo;
    private int empNo;

}
