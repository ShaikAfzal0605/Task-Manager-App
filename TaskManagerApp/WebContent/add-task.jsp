<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Task</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">

    <div class="card p-4">

        <h2 class="text-center">Add New Task</h2>

        <form action="addTask" method="post">

            <div class="mb-3">
                <label>Task Title</label>
                <input type="text" name="title" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Description</label>
                <textarea name="description" class="form-control"></textarea>
            </div>

            <div class="mb-3">
                <label>Due Date</label>
                <input type="date" name="dueDate" class="form-control">
            </div>

            <div class="mb-3">
                <label>Status</label>
                <select name="status" class="form-control">
                    <option>Pending</option>
                    <option>In Progress</option>
                    <option>Completed</option>
                </select>
            </div>

            <button type="submit" class="btn btn-success w-100">Add Task</button>

        </form>

    </div>

</div>

</body>
