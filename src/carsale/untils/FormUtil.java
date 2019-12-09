
package carsale.untils;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class FormUtil {
  public static <T> T toModel(Class<T> t, HttpServletRequest req) {
    T object = null;
    try {
      object = t.newInstance();
      BeanUtils.populate(object, req.getParameterMap());
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return object;
  }
}
