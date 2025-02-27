package web;

import entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.UserRepository;
import service.UserService;

import java.io.IOException;
import java.util.List;

@WebServlet("/user/allUsers")
public class UserGetAllServlet extends HttpServlet {
    UserService userService = new UserService(new UserRepository());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<User> users = userService.users();
        request.setAttribute("users", users);
        request.getRequestDispatcher("/getAllUsers.jsp").forward(request, response);
    }
}
