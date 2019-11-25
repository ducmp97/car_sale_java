
package carsale.service;

import java.util.ArrayList;

import carsale.model.CityFee;

/**
 * The Interface CityFeeService.
 */
public interface CityFeeService {

  /**
   * Gets the all city fee.
   *
   * @return the all city fee
   */
  public ArrayList<CityFee> getAllCityFee();

  /**
   * Gets the city fee by city name.
   *
   * @param cityName
   *          the city name
   * @return the city fee by city name
   */
  public CityFee getCityFeeByCityName(String cityName);

  /**
   * Update city fee.
   *
   * @param cityFee
   *          the city fee
   */
  public void updateCityFee(CityFee cityFee);

  /**
   * Delete city free.
   *
   * @param cityFeeId
   *          the city fee id
   * @return the int
   */
  public int deleteCityFree(int cityFeeId);

  /**
   * Insert city fee.
   *
   * @param cityFee
   *          the city fee
   * @return the int
   */
  public int insertCityFee(CityFee cityFee);
}
