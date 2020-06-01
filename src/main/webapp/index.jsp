<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Моя библиотека</title>
</head>
<body>

<h2>Создана простая страница для добавления, удаления и редактирования книг.</h2>
<h2>Используется Hibernate SessionFactory.</h2>
<br/>
<a href="<c:url value="/books"/>" target="_parent">Список книг</a>
<br/>
</body>
</html>