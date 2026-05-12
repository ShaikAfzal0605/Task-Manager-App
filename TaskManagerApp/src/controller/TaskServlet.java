package controller;

import java.io.IOException;

import dao.TaskDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Task;

@WebServlet("/addTask")
public class TaskServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String dueDate = request.getParameter("dueDate");
        String status = request.getParameter("status");

        Task task = new Task();

        task.setTitle(title);
        task.setDescription(description);
        task.setDueDate(dueDate);
        task.setStatus(status);

        TaskDAO dao = new TaskDAO();

        boolean result = dao.addTask(task);

        if (result) {
            response.sendRedirect("index.jsp");
        } else {
            response.getWriter().println("Task Not Added");
        }
    }
}