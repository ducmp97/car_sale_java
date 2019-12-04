
package carsale.security;

import javax.servlet.http.HttpServletRequest;

// TODO: Auto-generated Javadoc
/**
 * The Interface Authentication.
 */
public interface Authentication {

  /**
   * Url rediect.
   *
   * @param req
   *          the req
   * @return the string
   */
  public String urlRediect(HttpServletRequest req);

  /**
   * Of.
   *
   * @param userName
   *          the user name
   * @param password
   *          the password
   * @return the authentication
   */
  public static Authentication of(String userName, String password) {
    return new AuthenticationImpl(userName, password);
  }

}
