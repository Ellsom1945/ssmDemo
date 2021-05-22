<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>员工列表 —— 显示所有员工</small>
                </h1>
                <div class="row">
                    <div class="col-md-4 column">
                        <form action="${pageContext.request.contextPath}/emp/select" method="post" >
                            <input type="text" name="name" class="form-control">
                            <input type="submit" value="查询" class="btn-primary">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">

                <thead>
                <tr>
                    <th>员工编号</th>
                    <th>员工名字</th>
                    <th>上级编号</th>
                    <th>入职时间</th>
                    <th>工资</th>
                    <th>奖金</th>
                    <th>base编号</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="emp" items="${list}">
                    <tr>
                        <td>${emp.empNo}</td>
                        <td>${emp.name}</td>
                        <td>${emp.mgr}</td>
                        <td>${emp.hireDate}</td>
                        <td>${emp.salary}</td>
                        <td>${emp.comm}</td>
                        <td>${emp.deptNo}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/emp/toUpdateemp?id=${emp.empNo}">更改</a> |
                            <a href="${pageContext.request.contextPath}/emp/delete/ ${emp.empNo}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/emp/toaddemp">新增</a>
        </div>
    </div>

</div>