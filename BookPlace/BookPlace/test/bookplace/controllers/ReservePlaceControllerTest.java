/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookplace.controllers;

import bookplace.dao.MockReservationDaoSuccess;
import bookplace.model.Reservation;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author npetalid
 */
public class ReservePlaceControllerTest {

    public ReservePlaceControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of reservePlace method, of class ReservePlaceController.
     */
    @Test
    public void testReservePlace() throws Exception {

        System.out.println("reservePlace");
        String clubsName = "AClub";
        String customersName = "ACustomer";

        //Tkke the current day
        Calendar cal =
                Calendar.getInstance();

        //Add one day
        cal.add(Calendar.DAY_OF_MONTH, 1);

        //Set the time to 00:00:00
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        //Convert to Date object
        Date date = cal.getTime();

        //Convert date to a String of the form dd/MM/yyyy
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String dateString = df.format(date);
        
        
        ReservePlaceController instance = new ReservePlaceController(new MockReservationDaoSuccess());

        Reservation result = instance.reservePlace(clubsName, customersName, dateString);
        
        //Verify that the result returned
        //has the same club name as the one we requested
        Assert.assertEquals(clubsName, result.getClubsName());

        //has the same customer name as the one we requested
        Assert.assertEquals(customersName, result.getCustomerName());

        //has the same date
        Assert.assertEquals(date, result.getDate());

        //has the reserveration id that we know that the mock object returns
        Assert.assertEquals("123123", result.getReservationId());
    }
}