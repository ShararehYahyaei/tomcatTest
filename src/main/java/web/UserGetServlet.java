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



@WebServlet("/user")
public class UserGetServlet extends HttpServlet {

    UserService userService = new UserService(new UserRepository());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String username = req.getParameter("username");
//        if (username == null) {
//            username = "list";
//        }
//        switch (username) {
//            case "list":
//                req.getRequestDispatcher("user.jsp").forward(req, resp);
//                break;
//                case "username":
//                    req.getRequestDispatcher("list.jsp").forward(req, resp);
//        }

//        List<String> nameList = List.of("Ali", "Bahram", "karim");
//
//        req.setAttribute("names", nameList);
//        req.setAttribute("name", "fdfbdg");
        User user = new User(null, "ali", "5699");
//        req.setAttribute("username", user.getUsername());
//        req.setAttribute("password", user.getPassword());
//        req.setAttribute("user", user);

        userService.saveUser(user);
        User foundedUser = userService.findByUserName(req.getParameter("username"));
        req.setAttribute("foundedUser", foundedUser);
        req.getRequestDispatcher("/jsp/user.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
