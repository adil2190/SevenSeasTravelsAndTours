
package SDAproject;


public abstract class FlightTickets implements tickets{
    
    @Override
    public Booking booking(){
        return new FlightBooking();
    }
    
   
    @Override
    public abstract int price(int no);
    
}
