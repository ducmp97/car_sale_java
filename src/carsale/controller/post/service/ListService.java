package carsale.controller.post.service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import carsale.model.Post;
import carsale.service.PostService;
import carsale.service.Impl.PostServiceImpl;

// TODO: Auto-generated Javadoc
/**
 * Servlet implementation class ListService.
 */
@WebServlet("/api/list-service")
public class ListService extends HttpServlet {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The post service. */
  private PostService postService;

  /** The gson. */
  private Gson gson;

  /**
   * Instantiates a new list service.
   *
   * @see HttpServlet#HttpServlet()
   */
  public ListService() {
    postService = new PostServiceImpl();
    gson = new Gson();
  }

  /**
   * Do get.
   *
   * @param request
   *          the request
   * @param response
   *          the response
   * @throws ServletException
   *           the servlet exception
   * @throws IOException
   *           Signals that an I/O exception has occurred.
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    ArrayList<Post> list = postService.getAllService();
    String json = gson.toJson(list);
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(json);
  }

}
