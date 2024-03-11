<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/registration" method="post"
      enctype="application/x-www-form-urlencoded">

    <label for="name">Name:
        <input type="text" name="name" id="name">
    </label><br>

    <label for="email">Email:
        <input type="email" name="email" id="email">
    </label><br>

    <input type="radio" name="gender" value="Male"> Male <br>
    <input type="radio" name="gender" value="Female"> Female <br>

    <button type="submit">Send</button>
</form>


</body>
</html>
