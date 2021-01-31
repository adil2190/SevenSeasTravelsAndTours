
package SDAproject;


public class ReservationBuilder {
    int ID, busticketno, flightticketno;
    public void BusReservation(int id, int no, int travelno){
        Reservation reserve = new Reservation();
        reserve.bookBusTickets(id, no, travelno, new BusTicketsBooking());
        
       
    }
    
    public void FlightReservation(int id, int no, int travelno){
        Reservation reserve = new Reservation();
        reserve.bookFlightTickets(id, no, travelno, new FlightTicketsBooking());
        
      
    }
}
