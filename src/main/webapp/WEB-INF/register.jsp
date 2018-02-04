<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/main.css">
    <title>Seabatle - Register page</title>
</head>
<body class="w3-display-container">
<div class="sideelement w3-display-leftmiddle w3-display-container">
    <div class="bbox w3-display-middle w3-round-large">

    </div>
    <div class="w3-display-middle w3-center">
        <h1 class="w3-xxxlarge w3-animate-top">Input name</h1>
        <form class="w3-container" action="register" method="post">
            <input class="w3-input w3-border w3-light-grey " type="text" name="player1-name">
            <br>
            <input class="w3-button w3-green " type="submit" name="registerBtn" value="Join"/>
        </form>
    </div>
</div>
</body>
</html>
