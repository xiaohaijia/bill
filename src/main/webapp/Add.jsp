<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/19
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="header">
    <form action="addBill" method="post">
        <p><span>类型：</span>
            <s:forEach var="t" items="${billTypeList}">
                <input type="radio" name="bill.typeId" value="${t.id}">${t.name}
            </s:forEach>
        </p>
        <p><saan>标题：</saan><input type="text" name="bill.title"></p>
        <p><saan>金额：</saan><input type="text" name="bill.price"></p>
        <p><saan>日期：</saan><input type="text" name="bill.billTimes"></p>
        <p><saan>说明：</saan><input type="text" name="bill.explain"></p>
        <input type="submit" name="sum" value="添加">
    </form>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/index.js"></script>
</body>
</html>
