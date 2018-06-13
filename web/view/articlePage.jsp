<%--
  Created by IntelliJ IDEA.
  User: Kasia
  Date: 2018-06-08
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Article1</title>
</head>
<body>
    <h1>${article.name}</h1>
    <p>${article.date}</p>
    <div>
        <img src="${article.img}" height="200" alt="obrazek sie nie wczytal">
        <p>
            ${article.articleText}
        </p>
    </div>
</body>
</html>
