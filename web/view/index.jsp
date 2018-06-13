<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--
  Created by IntelliJ IDEA.
  User: Kasia
  Date: 2018-06-07
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="/view/style.css">
    <meta charset="utf-8">
    <title>Strona główna</title>
</head>
<body>
<div class="intro">
    <h1>Wiadomości ze świata</h1>
    <img src="../static/img/wiadomości-ze-świata-wyemitowany-grafika-tytuł-43684534.jpg" height="300">
</div>

<div class="container">
    <div class="row">
        <c:forEach items="${articles}" var="art">
            <div class="col-md-4">
                <a href="/article/${art.id}">
                    <h3>${art.name}</h3>
                    <p>${art.date}</p>
                    <p>${art.category.name}</p>
                    <img src="${art.img}" height="100">
                </a>
            </div>
        </c:forEach>
    </div>
</div>

</body>
</html>
