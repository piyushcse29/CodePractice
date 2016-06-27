package decemberlongchallenge.uiview.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class SqlinjectionSDOImpl extends SDODataObject implements SqlinjectionSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 4;

   public SqlinjectionSDOImpl() {}

   public java.math.BigDecimal getPersonid() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setPersonid(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getLastname() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setLastname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getFirstname() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setFirstname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getAddress() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setAddress(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getCity() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setCity(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }


}

