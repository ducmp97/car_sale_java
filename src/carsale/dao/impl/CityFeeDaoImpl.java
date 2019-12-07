
package carsale.dao.impl;

import java.util.ArrayList;
import java.util.List;

import carsale.dao.CityFeeDao;
import carsale.mapper.CityFeeMapper;
import carsale.model.CityFee;

public class CityFeeDaoImpl extends AbstractDao<CityFee> implements CityFeeDao {

  /**
   * {@inheritDoc}
   * 
   * @see carsale.dao.CityFeeDao#getAllCityFee()
   */
  @Override
  public ArrayList<CityFee> getAllCityFee() {
    StringBuilder sql = new StringBuilder("SELECT * FROM city_fee ");
    List<CityFee> list = this.query(sql.toString(), new CityFeeMapper());
    if (list.size() == 0) {
      return null;
    } else {
      return (ArrayList<CityFee>) list;
    }
  }

  /**
   * {@inheritDoc}
   * 
   * @see carsale.dao.CityFeeDao#insertCityFee(carsale.model.CityFee)
   */
  @Override
  public Long insertCityFee(CityFee cityFee) {
    StringBuilder sql = new StringBuilder(
        "INSERT INTO city_fee(city_name, tax,registration, insurrance,license_plate)");
    sql.append(" VALUES(?,?,?,?,?)");
    Long result = insert(sql.toString(), cityFee.getCityName(), cityFee.getTax(),
        cityFee.getRegistration(), cityFee.getInsurrance(), cityFee.getLicensePlate());
    return result;
  }

  /**
   * {@inheritDoc}
   * 
   * @see carsale.dao.CityFeeDao#updateCityFee(carsale.model.CityFee)
   */
  @Override
  public void updateCityFee(CityFee cityFee) {
    StringBuilder sql = new StringBuilder("UPDATE city_fee AS c ");
    sql.append(
        " SET c.city_name=?, c.tax=?, c.registration=?, c.insurrance=?, c.license_plate=?");
    sql.append("WHERE c.city_fee_id=?");
    update(sql.toString(), cityFee.getCityName(), cityFee.getTax(), cityFee.getRegistration(),
        cityFee.getInsurrance(), cityFee.getLicensePlate(), cityFee.getCityFeeId());
  }

  /**
   * {@inheritDoc}
   * 
   * @see carsale.dao.CityFeeDao#deleteCityFee(int)
   */
  @Override
  public Long deleteCityFee(int cityFeeId) {
    StringBuilder sql = new StringBuilder("DELETE FROM city_fee  ");
    sql.append(" WHERE city_fee.city_fee_id= ?");
    Long result = delete(sql.toString(), cityFeeId);
    return result;
  }
}
