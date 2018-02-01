<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/main.css">
   <style>
       .bodyback {
           width: 100%;
           height: 100%;
           background: url('${pageContext.request.contextPath}/resources/wallpaper.jpg') center;
           background-size: cover;
       }
   </style>

    <title>Seabatle - Register page</title>
</head>
<body class="bodyback w3-display-container">
    <div class="sideelement w3-display-leftmiddle w3-display-container">
        <div class="w3-display-middle w3-pale-green w3-padding">
            <form action="register" method="post">
                <p>Input player name:</p>
                <input type="text" name="player1-name"/>
                <input class="w3-button w3-green" type="submit" name="registerBtn" value="Start game!"/>
            </form>
        </div>

    </div>
</body>
</html>
