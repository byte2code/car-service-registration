<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Success</title>
</head>
<body>
    <h2>Registration done successfully!</h2>
    <p>Your car has been successfully registered.</p>
    <p>Registration ID: ${carId}</p>
    <a href="/support?id=${carId}">Contact support</a>
    <br><br>
    <a href="/register">Register another car</a>
</body>
</html>
