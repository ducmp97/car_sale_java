
package carsale.dao.impl;

import java.util.List;

import carsale.dao.CarDao;
import carsale.mapper.CarMapper;
import carsale.mapper.ListPriceCarMapper;
import carsale.model.Car;

public class CarDaoImpl extends AbstractDao<Car> implements CarDao {

  /**
   * {@inheritDoc}
   * 
   * @see carsale.dao.CarDao#getAllCar()
   */
  @Override
  public List<Car> getAllCar() {
    StringBuilder sql = new StringBuilder("SELECT * FROM car AS c ");
    sql.append("INNER JOIN spec AS s ");
    sql.append("ON c.car_id= s.car_id ");
    sql.append("INNER JOIN image AS i ");
    sql.append("ON c.car_id = i.image_id ");
    sql.append("INNER JOIN description AS d ");
    sql.append("ON c.car_id=d.car_id ");
    List<Car> list = this.query(sql.toString(), new CarMapper());
    if (list.size() == 0) {
      return null;
    } else {
      return list;
    }
  }

  /**
   * {@inheritDoc}
   * 
   * @see carsale.dao.CarDao#getCarById(int)
   */
  @Override
  public Car getCarById(int carId) {
    StringBuilder sql = new StringBuilder("SELECT * FROM car AS c ");
    sql.append("INNER JOIN spec AS s ");
    sql.append("ON c.car_id= s.car_id ");
    sql.append("INNER JOIN image AS i ");
    sql.append("ON c.car_id = i.image_id ");
    sql.append("INNER JOIN description AS d ");
    sql.append("ON c.car_id=d.car_id ");
    sql.append("WHERE c.car_id=?");
    List<Car> list = this.query(sql.toString(), new CarMapper(), carId);
    if (list.size() == 0) {
      return null;
    } else {
      return list.get(0);
    }
  }

  /**
   * {@inheritDoc}
   * 
   * @see carsale.dao.CarDao#insertCar(carsale.model.Car)
   */
  @Override
  public Long insertCar(Car car) {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * {@inheritDoc}
   * 
   * @see carsale.dao.CarDao#updatecar(carsale.model.Car)
   */
  @Override
  public Long updatecar(Car car) {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * {@inheritDoc}
   * 
   * @see carsale.dao.CarDao#deleteCar(carsale.model.Car)
   */
  @Override
  public Long deleteCar(Car car) {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * {@inheritDoc}
   * 
   * @see carsale.dao.CarDao#getListCarPrice()
   */
  @Override
  public List<Car> getListCarPrice() {
    StringBuilder sql = new StringBuilder("SELECT * FROM car");
    List<Car> list = query(sql.toString(), new ListPriceCarMapper());
    if (list.size() == 0) {
      return null;
    } else {
      return list;
    }
  }

}
