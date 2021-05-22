<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增员工</title>
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
                    <small>员工</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/emp/add" method="post">
        员工编号        <input type="text" name="empNo" required><br><br><br>
        员工名字       <input type="text" name="name" required><br><br><br>
        上级编号       <input type="text" name="mgr" required><br><br><br>
        入职时间        <input type="text" name="hireDate" required><br><br><br>
        工资          <input type="text" name="salary" required><br><br><br>
        奖金          <input type="text" name="comm" required><br><br><br>
        base编号       <input type="text" name="deptNo" required><br><br><br>
        <input type="submit" value="添加">
    </form>

</div>