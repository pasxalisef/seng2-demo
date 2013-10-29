/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookplace.dao;

import bookplace.exceptions.DaoException;
import bookplace.model.Reservation;
import java.util.Date;

/**
 * Κλάση που κάποια στιγμή θα χρησιμοποιηθεί για την επικοινωνία με το σύστημα μόνιμης αποθήκευσης.
 * Προς το παρόν δεν κάνει κάτι χρήσιμο
 * @author npetalid
 */
public class ReservationDao implements IReservationDao {
    
    @Override
    public Reservation createReservation(String clubName, String customersName, Date date) throws DaoException
    {
        return new Reservation();
    }
}
