
package SDAproject;


public abstract class BusTickets implements tickets{
    @Override
    public Booking booking(){
        return new BusBooking();
    }
    
    /**
     *
     * @param no
     * @return
     */
    @Override
    public abstract int price(int no);
    
}
