/*
 * DrmaaSuite.java
 * JUnit based test
 *
 * Created on November 14, 2004, 12:50 AM
 */

import junit.framework.TestSuite;
import junit.framework.TestCase;
import junit.framework.Test; 

/**
 *
 * @author dan.templeton@sun.com
 */
public class DrmaaSuite extends TestCase {
   
   public DrmaaSuite (java.lang.String testName) {
      super (testName);
   }
   
   /** suite method automatically generated by JUnit module */
   public static Test suite () {
      TestSuite suite = new TestSuite ("DrmaaSuite");
      suite.addTest (org.ggf.drmaa.DrmaaSuite.suite ());
      suite.addTest (com.sun.grid.drmaa.DrmaaSuite.suite ());
      return suite;
   }
}
