<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/main.css">
    <title>Seabatle - Ship register</title>
</head>

<body class="w3-display-container">
<div class="sideelement w3-display-leftmiddle w3-display-container">
    <div class="bbox w3-display-middle w3-round-large">
        <h2 class="w3-xxxlarge">Setup ships</h2>
    </div>
    <div class="w3-display-middle w3-center">
        <h1 class="green w3-xlarge w3-animate-top">${playerGameContext.player.name}"</h1>

        <form class="w3-container">
            <input class="w3-button w3-green " type="submit" value="Start!">
        </form>
    </div>
</div>
<div class="w3-display-middle w3-display-container">
    <form class="w3-container" method="post">

        <table class="w3-table w3-centered">
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
                            <input class="w3-check" type="checkbox" name="addr" value="${col}${row}">
                        </td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>

    </form>
</div>
</body>
<!--body>
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
</body-->
</html>
