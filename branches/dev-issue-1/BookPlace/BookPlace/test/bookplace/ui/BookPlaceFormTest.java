/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookplace.ui;

import bookplace.BookPlace;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.uispec4j.Trigger;
import org.uispec4j.UISpec4J;
import org.uispec4j.UISpecTestCase;
import org.uispec4j.Window;
import org.uispec4j.interception.MainClassAdapter;
import org.uispec4j.interception.WindowHandler;
import org.uispec4j.interception.WindowInterceptor;

/**
 * This an example test using UISpec4J
 * It will work only with JDK 6 (not JDK 7)
 * @author npetalidis
 */
public class BookPlaceFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
  }
    public BookPlaceFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         setAdapter(new MainClassAdapter(BookPlace.class, new String[0]));
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // 1. Retrieve the components
    Window window = getMainWindow();

 WindowInterceptor.init(window.getButton("ok").triggerClick())
  .process(new WindowHandler() {
    @Override
    public Trigger process(Window dialog) {
      assertTrue(dialog.titleEquals("Success")); 
       return dialog.getButton("OK").triggerClick();
    }
  })
  .run();
  
    }
}