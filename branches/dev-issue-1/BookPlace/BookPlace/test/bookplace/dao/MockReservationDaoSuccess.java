/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookplace.dao;

import bookplace.exceptions.DaoException;
import bookplace.model.Reservation;
import java.util.Date;

/**
 * Παράδειγμα κλάσης mock. Κανονικά θα τη γράφαμε χρησιμοποιώντας ένα framework
 * σαν το JMock ή το Mockito
 * @author npetalid
 */
public class MockReservationDaoSuccess implements IReservationDao{

    /** Προσποιήσου ότι αποθηκεύεις μια κράτηση, και δημιούργησε τον κωδικό 123123
     * για αυτήν την κράτηση
     * @param clubName Το όνομα του club
     * @param customersName To όνομα του πελάτη
     * @param date Η ημερομηνία κράτησης
     * @return επιστρέφει το μοναδικό κωδικό της κράτησης
     * @throws DaoException σε περίπτωση που δεν γίνει δυνατή η αποθήκευση
     */
    @Override
    public Reservation createReservation(String clubName, String customersName, Date date) throws DaoException {
        Reservation r = new Reservation();
        
        r.setClubsName(clubName);
        r.setCustomerName(customersName);
        r.setDate(date);
        r.setReservationId("123123");
        return r;
    }
    
}
