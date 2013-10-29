/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookplace.dao;

import bookplace.exceptions.DaoException;
import bookplace.model.Reservation;
import java.util.Date;

/**
 *
 * @author npetalid
 */
public interface IReservationDao {

    Reservation createReservation(String clubName, String customersName, Date date) throws DaoException ;
    
}
