package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Task;
import util.DBConnection;

public class TaskDAO {

    Connection con = DBConnection.getConnection();

    // Add Task
    public boolean addTask(Task task) {

        boolean status = false;

        try {

            String sql = "INSERT INTO tasks(title,description,due_date,status) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, task.getTitle());
            ps.setString(2, task.getDescription());
            ps.setString(3, task.getDueDate());
            ps.setString(4, task.getStatus());

            int row = ps.executeUpdate();

            if (row > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // View All Tasks
    public ArrayList<Task> getAllTasks() {

        ArrayList<Task> list = new ArrayList<>();

        try {

            String sql = "SELECT * FROM tasks";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Task t = new Task();

                t.setId(rs.getInt("id"));
                t.setTitle(rs.getString("title"));
                t.setDescription(rs.getString("description"));
                t.setDueDate(rs.getString("due_date"));
                t.setStatus(rs.getString("status"));

                list.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}