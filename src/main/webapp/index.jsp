<%--
  Created by IntelliJ IDEA.
  User: zrui
  Date: 2016/6/30
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <a href="/user/1">清静无为，道法自然。。</a>

    <form action="/user/add" method="post">
        <input type="hidden" name="userName" value='{
        "id":"987654321",
        "username":"zhourui",
        "sex":"1",
        "password":"123456",
        "phone":"13101008846",
        "email":"384301135@qq.com",
        "pic":"/img/iocn.png",
        "birthday":"asd",
        "address":"重庆开县",
        "createDate":"2016-01-01",
        "status":"0"
        }'>
    <input type="submit" value="提交" />
    </form>

</body>
</html>
