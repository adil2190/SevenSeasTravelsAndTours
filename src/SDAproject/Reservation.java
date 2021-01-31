
package SDAproject;

import java.sql.*;
import javax.swing.JOptionPane;

public class Reservation {
    tickets ticket;
    myconnection mc;
    
    public void bookFlightTickets(int id, int no, int travelno, tickets ticket){
        String sql = "update TicketsInfo set FlightTicketNo = " + ticket.ticketNo(no) + ", FlightType = '" + ticket.type(no)
                + "', FlightTicketPrice = " + ticket.price(no) + " where userID = " + id;
        
        mc = new myconnection();
        
        try{
            
            mc.st.executeUpdate(sql);
            for (int i=0; i<travelno; i++){
                String result = JOptionPane.showInputDialog("Enter Seat Number : ");
                int seatno = Integer.parseInt(result);
                mc.st.executeUpdate("update ticketsinfo set flightseatno = " + seatno + "where userID = " + id + "and traveler = "+(i+1));
            }
            mc.st.executeUpdate("update ticketsinfo set flightticketno = flightseatno + flightticketno where userID = "+id);
        }catch(Exception e){System.out.println(e);}
        
    }
    
    public void bookBusTickets(int id, int no, int travelno, tickets ticket){
        String sql = "update TicketsInfo set BusTicketNo = " + ticket.ticketNo(no) + ", BusType = '" + ticket.type(no) + 
                "', BusTicketPrice = " + ticket.price(no) + " where userID = " + id;
        
        mc = new myconnection();
        try{
            mc.st.executeUpdate(sql);
            for(int i = 0; i<travelno; i++){
                String result = JOptionPane.showInputDialog("Enter Seat Number : ");
                int seatno = Integer.parseInt(result);
                mc.st.executeUpdate("update ticketsinfo set busseatno = " + seatno + "where userID = " + id + "and traveler = "+(i+1));

            }
            mc.st.executeUpdate("update ticketsinfo set busticketno = busseatno + busticketno where userID = "+id);
        }catch(Exception e){System.out.println(e);}
    }
}
