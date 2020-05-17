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
    <div id="biao"><h1>记账管理</h1></div>
    <div id="table">
        <div id="sel">
            <form action="seach" method="post">
                <span>类型：</span>
                <select name="type">
                    <option value="0">请选择</option>
                    <s:forEach var="t" items="${billTypeList}">
                        <option value="${t.id}">${t.name}</option>
                    </s:forEach>
                </select>
                <span>时间：</span><input type="text" name="oneBillTimes" id="one" />
                <span>到</span><input type="text" name="toBillTimesl" id="two" />
                <input type="submit" name="sou" id="btnsou" value="搜索" />
                <button><a href="add">添加</a></button>
            </form>
        </div>

        <div id="rong">
            <table border="1px">
                <tr>
                    <th>标题</th>
                    <th>记账时间</th>
                    <th>类别</th>
                    <th>金额</th>
                    <th>说明</th>
                </tr>
                <c:forEach var="bill" items="${billList}">
                    <tr>
                        <td>${bill.title}</td>
                        <td><fm:formatDate value="${bill.billTimes}" pattern="yyyy-MM-dd"></fm:formatDate></td>

                        <td><c:if test="${bill.typeId==101}">支出</c:if>
                            <c:if test="${bill.typeId==102}">收入</c:if>
                            <c:if test="${bill.typeId==103}">转账</c:if>
                            <c:if test="${bill.typeId==104}">借出</c:if>
                            <c:if test="${bill.typeId==105}">借入</c:if>
                            <c:if test="${bill.typeId==106}">支出</c:if></td>
                        <td>${bill.price} 元</td>
                        <td>${bill.explain}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/index.js"></script>
</body>
</html>
