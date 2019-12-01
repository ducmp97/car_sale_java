package carsale.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carsale.model.Role;
import carsale.model.User;
import carsale.service.RoleService;
import carsale.serviceImpl.RoleServiceImpl;
import carsale.serviceImpl.UserServiceImpl;
import carsale.untils.FormUtil;

/**
 * Servlet implementation class SignInController
 */
@WebServlet("/signup")
public class SignUpController extends HttpServlet {
  private static final long serialVersionUID = 1L;

  private UserServiceImpl userService = new UserServiceImpl();
  private RoleService roleService = new RoleServiceImpl();

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    User user = FormUtil.toModel(User.class, request);
    Role role = roleService.getRoleById(2);
    user.setRole(role);
    System.out.println("Insert User " + user.toString());
    Long result = userService.insertUser(user);
    if (result != null) {
      request.setAttribute("message", "Đăng ký tài khoản thành công");
      RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
      rd.forward(request, response);
    } else {
      request.setAttribute("message", "Đăng ký tài khoản không thành công");
      RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
      rd.forward(request, response);
    }

  }

}
