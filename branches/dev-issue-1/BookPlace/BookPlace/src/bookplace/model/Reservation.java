/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookplace.model;

import java.util.Date;

/**
 * Μια απλή κλάση που αναπαριστά μια κράτηση
 * @author npetalid
 */
public class Reservation {
    private Date date;
    private String reservationId;
    private String customerName;
    private String clubsName;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getClubsName() {
        return clubsName;
    }

    public void setClubsName(String clubsName) {
        this.clubsName = clubsName;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }
    
}
