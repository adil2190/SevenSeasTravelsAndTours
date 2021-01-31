
package SDAproject;

import java.sql.*;
public class FlightTicketsBooking extends FlightTickets {
    myconnection mc;
    
    
    public int price(int no){
    int p = 0;
    String sql = "select * from flights where ticketNo = " + no;
        System.out.println(sql);
    mc = new myconnection();
    try{
        ResultSet rs = mc.st.executeQuery(sql);
        while(rs.next()){
            p = rs.getInt("price");
        }
    }catch(Exception e){System.out.println(e);}
    return p;
    }
    
    public int ticketNo(int no){
    String sql = "select * from flights where ticketNo = " + no;
    int t = 0;
    mc = new myconnection();
    try{
        ResultSet rs = mc.st.executeQuery(sql);
        while(rs.next()){
            t = rs.getInt("ticketNo");
        }
    }catch(Exception e){System.out.println(e);}
    return t;
    }
    
    public String type(int no){
    String ty = "";
    String sql = "select * from flights where ticketNo = " + no;
    mc = new myconnection();
    try{
        ResultSet rs = mc.st.executeQuery(sql);
        while(rs.next()){
            ty = rs.getString("flightType");
        }
    }catch(Exception e){System.out.println(e);}
    return ty;
    }



   
    
    
    
    
}
