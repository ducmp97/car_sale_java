
package carsale.service;

import java.util.ArrayList;

import carsale.model.Car;

public interface CarService {

  public ArrayList<Car> getAllCar();

  public Car getCarById(int carId);

  public Car getCarByName(String carName);

  public void updateCar(Car car);

  public Long insertCar(Car car);

  public Long deleteCar(int carId);

  public ArrayList<Car> getListPrice();
}
