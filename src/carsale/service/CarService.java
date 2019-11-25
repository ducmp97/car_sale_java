
package carsale.service;

import java.util.ArrayList;

import carsale.model.Car;

/**
 * The Interface CarService.
 */
public interface CarService {

  /**
   * Gets the all car.
   *
   * @return the all car
   */
  public ArrayList<Car> getAllCar();

  /**
   * Gets the car by id.
   *
   * @param carId
   *          the car id
   * @return the car by id
   */
  public Car getCarById(int carId);

  /**
   * Gets the car by name.
   *
   * @param carName
   *          the car name
   * @return the car by name
   */
  public Car getCarByName(String carName);

  /**
   * Update car.
   *
   * @param car
   *          the car
   */
  public void updateCar(Car car);

  /**
   * Insert car.
   *
   * @param car
   *          the car
   * @return the int
   */
  public int insertCar(Car car);

  /**
   * Delete car.
   *
   * @param carId
   *          the car id
   * @return the int
   */
  public int deleteCar(int carId);

}
