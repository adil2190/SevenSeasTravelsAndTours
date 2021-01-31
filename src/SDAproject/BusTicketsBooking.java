
package SDAproject;

import java.sql.ResultSet;
import java.sql.*;


public class BusTicketsBooking extends BusTickets{
    myconnection mc;
    
   public int price(int no){
    int p = 0;
    String sql = "select * from buses where ticketNo = " + no;
    mc = new myconnection();
    try{
        ResultSet rs = mc.st.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getInt("price"));
            p = rs.getInt("price");
        }
    }catch(Exception e){System.out.println(e);}
    return p;
    }
    
    public int ticketNo(int no){
    String sql = "select * from buses where ticketNo = " + no;
    int t = 0;
    mc = new myconnection();
    try{
        ResultSet rs = mc.st.executeQuery(sql);
        while(rs.next()){
            t = rs.getInt("TicketNo");
        }
    }catch(Exception e){System.out.println(e);}
    return t;
    }
    
    public String type(int no){
    String ty = "";
    String sql = "select * from buses where ticketNo = " + no;
    mc = new myconnection();
    try{
        ResultSet rs = mc.st.executeQuery(sql);
        while(rs.next()){
            ty = rs.getString("BusType");
        }
    }catch(Exception e){System.out.println(e);}
    return ty;
    }


}
