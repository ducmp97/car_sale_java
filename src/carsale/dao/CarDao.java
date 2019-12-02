
package carsale.dao;

import java.util.List;

import carsale.model.Car;


public interface CarDao extends GennericDao<Car> {
  public List<Car> getAllCar();

  public Car getCarById(int carId);

  public Long insertCar(Car car);

  public Long updatecar(Car car);

  public Long deleteCar(Car car);
  
  public List<Car> getListCarPrice();
}
