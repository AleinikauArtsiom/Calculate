<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>History</title>
</head>
<body>
<h1>Request History</h1>
<ul>
  <c:forEach var="entry" items="${history}">
    <li>${entry.key} = ${entry.value}</li>
  </c:forEach>
</ul>
</body>
</html>
