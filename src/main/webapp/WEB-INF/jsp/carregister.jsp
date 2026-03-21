<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Registration</title>
</head>
<body>
    <h2>Car Registration Form</h2>
    <form action="/done" method="POST">
        <label for="registerationNumber">Registration Number:</label>
        <input type="text" id="registerationNumber" name="registerationNumber" required><br><br>

        <label for="carName">Car Name:</label>
        <input type="text" id="carName" name="carName" required><br><br>

        <label for="carDetails">Covered In Warranty (YES/NO):</label>
        <input type="text" id="carDetails" name="carDetails" required><br><br>

        <label for="carWork">Any Remarks:</label>
        <textarea id="carWork" name="carWork" required></textarea><br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
