<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task Manager</title>
</head>

<body>

<h1>Task Manager App</h1>

<form action="AddTaskServlet" method="post">

    Task Title:
    <input type="text" name="title"><br><br>

    Description:
    <textarea name="description"></textarea><br><br>

    Due Date:
    <input type="date" name="dueDate"><br><br>

    Status:
    <select name="status">
        <option>Pending</option>
        <option>Completed</option>
    </select><br><br>

    <input type="submit" value="Add Task">

</form>

</body>
</html>