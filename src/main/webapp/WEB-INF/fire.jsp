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
    <c:set var="myField" value="${playerGameContext.player.myField}"/>
    <c:set var="enemyField" value="${playerGameContext.player.enemyField}"/>
    <form  method="post">
        <div class="fieldstyle w3-display-container">
            <div class="w3-display-middle">
                <table class="w3-table w3-centered">
                    <tr>
                        <c:forEach var="col" items=" ,A,B,C,D,E,F,G,H,I,J">
                            <td class="orange">${col}</td>
                        </c:forEach>
                    </tr>
                    <c:forEach var="row" begin="1" end="10">
                        <tr>
                            <td class="orange">${row}</td>
                            <c:forEach var="col" items="A,B,C,D,E,F,G,H,I,J">
                                <c:set var="addr" value="${col}${row}"/>
                                <td class="${myField.getCell(addr)}"></td>
                            </c:forEach>
                        </tr>
                    </c:forEach>
                </table>
                <table class="w3-table w3-centered">
                    <tr>
                        <c:forEach var="col" items=" ,A,B,C,D,E,F,G,H,I,J">
                            <td  class="orange">${col}</td>
                        </c:forEach>
                    </tr>
                    <c:forEach var="row" begin="1" end="10">
                        <tr>
                            <td  class="orange">${row}</td>
                            <c:forEach var="col" items="A,B,C,D,E,F,G,H,I,J">
                                <c:set var="addr" value="${col}${row}"/>
                                <td class="${enemyField.getCell(addr)}">
                                    <input class="w3-check" type="radio" name="addr" value="${addr}">
                                </td>
                            </c:forEach>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <div class="sideelement w3-display-container w3-display-right">
            <div class="bbox w3-display-middle w3-round-large"></div>
            <div class="sidetop w3-display-top w3-display-container">
                <h1 class="green w3-xlarge w3-display-bottommiddle">${playerGameContext.player.name}</h1>
            </div>
            <div class="sidemiddle w3-container w3-centered" >
                <h2 class="w3-xxlarge w3-display-middle">Make your shoot</h2><br>
            </div>
            <div class="forBtn w3-display-bottommiddle w3-container w3-center">
                <input class="w3-button w3-green " type="submit" value="Fire!">
            </div>

        </div>
    </form>
</body>
</html>

