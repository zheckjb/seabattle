<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Battlefield</title>
</head>
<body>
<form method="post">
    <table style="text-align: center">
        <tr>
            <c:forEach var="col" items=" ,A,B,C,D,E,F,G,H,I,J">
                <td>${col}</td>
            </c:forEach>
        </tr>
        <c:forEach var="row" begin="1" end="10">
            <tr>
                <td>${row}</td>
                <c:forEach var="col" items="A,B,C,D,E,F,G,H,I,J">
                    <td>
                        <input type="checkbox" name="addr" value="${col}${row}">
                    </td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Start!">
</form>
</body>
</html>
