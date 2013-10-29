/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookplace.controllers;

import bookplace.dao.IReservationDao;
import bookplace.exceptions.DaoException;
import bookplace.model.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author npetalid
 */
public class ReservePlaceController {

    private IReservationDao reservationDao;

    public ReservePlaceController(IReservationDao reservationDao) {
        this.reservationDao = reservationDao;
    }

    /* 
     * Ένας απλός controller. 
     * Ελέγχει αν η ημερομηνία που δόθηκε είναι μεταγενέστερη της σημερινής και 
     * αν το μήκος του ονόματος που δόθηκε είναι πάνω από 3 χαρακτήρες. Αν αυτά ισχύουν 
     * δημιουργεί μια νέα κράτηση
     * @param clubsName Το όνομα του club
     * @param customersName To όνομα του πελάτη
     * @param dateString Η ημερομηνία κράτησης στη μορφή dd/MM/yyyy
     * @return επιστρέφει μια νέα κράτηση
     * @throws IllegalArgumentException αν κάποια από τις παραμέτρους δεν ήταν σωστή
     *         DaoException αν απέτυχε η επικοινωνία με τη βάση
     */
    public Reservation reservePlace(String clubsName, String customersName, String dateString) 
            throws IllegalArgumentException, DaoException {
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dtStr = dateString.trim();  // 01/01/2011
        Date date;
        try {
             date = df.parse(dtStr);  // dt = Sun Jan 01 00:00:00 IST 2011
        } catch (ParseException e) {
            throw new IllegalArgumentException("Incorrect date format");
        }

        //Check if date is correct

        if (Calendar.getInstance().getTime().after(date)) {
            throw new IllegalArgumentException("Date has already passed");
        }

        //Check if customer name is at least three character's long
        if (customersName.length() < 3) {
            throw new IllegalArgumentException("Customer name should be at least three characters long");
        }
        try {
            return reservationDao.createReservation(clubsName, customersName, date);
        } catch (DaoException e) {
            throw e;
        }
    }
}
