
package carsale.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * The Class ConnectDb.
 */
public class ConnectDb {

  /** The con. */
  public static Connection con;

  /**
   * Gets the connect.
   *
   * @return the connect
   */
  public static Connection getConnect() {
    if (con == null) {
      String dbUrl = "jdbc:mysql://localhost:3307/carsale";
      String dbClass = "org.mariadb.jdbc.Driver";
      try {
        Class.forName(dbClass);
        con = DriverManager.getConnection(dbUrl, "root", " ");
        System.out.println("Connect succes.");
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      System.out.println("Connect fail.");
    }
    return con;
  }
}
