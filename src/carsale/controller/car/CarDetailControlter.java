package carsale.controller.car;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import carsale.model.Car;
import carsale.service.CarService;
import carsale.service.Impl.CarServiceImpl;

// TODO: Auto-generated Javadoc
/**
 * Servlet implementation class CarDetailControlter.
 */
@WebServlet("/api/car-detail")
public class CarDetailControlter extends HttpServlet {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The car service. */
  private CarService carService;

  /** The gson. */
  private Gson gson;

  /**
   * Instantiates a new car detail controlter.
   *
   * @see HttpServlet#HttpServlet()
   */
  public CarDetailControlter() {
    carService = new CarServiceImpl();
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
    String id = request.getParameter("id");
    int carId = Integer.parseInt(id);
    Car car = carService.getCarById(carId);
    String json = gson.toJson(car);
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(json);
  }

}
