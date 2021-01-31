
package SDAproject;

import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
public class Registration {
    private static Registration r = new Registration();
    
    private Registration(){}
    
    public static Registration getInstance(){
        return r;
    }
    Scanner in = new Scanner(System.in);
    myconnection mc,mc1;
    AdminPanell app = new AdminPanell();
    UserHomePage uhp;
    login l;


    int id=0;

    public boolean signIn(String uname, String pass){
        mc = new myconnection();
        String sql = "select id, username, password from users";
        try{
            ResultSet rs = mc.st.executeQuery(sql);
            while(rs.next()){
                if(uname.equalsIgnoreCase(rs.getString("username")) && pass.equalsIgnoreCase(rs.getString("password"))){
                    id = rs.getInt("id");
                    uhp = new UserHomePage(uname, id);
                    uhp.setVisible(true);
                    return true;
                }


            }
        }catch(Exception e){System.out.println(e);}
        return false;
    }
    
    public void signInAdmin(String uname, String pass){
        mc1 = new myconnection();
        String sql = "select * from admins";
        try{
            ResultSet rs = mc1.st.executeQuery(sql);
            while(rs.next()){
                if(uname.equalsIgnoreCase(rs.getString("username")) && pass.equalsIgnoreCase(rs.getString("password"))){
                    System.out.println("Successfull");
                    int id = rs.getInt("id");
                    app.setVisible(true);
                }
                else{
                    l = new login();
                    l.setVisible(true);
                }
            }
        }catch(Exception e){System.out.println(e);}
        
    }
    
    public void registration(String uname, String pass, String email, String contact, int age){
       mc = new myconnection();
       l = new login();
       String sql = "insert into users values('"+uname+"','"+pass+"','"+email+"', '"+contact+"',"+age+")";
       try{
       mc.st.executeUpdate(sql);
//       l.setPanel(false, true, false);
       }catch(Exception e){System.out.println(e);}
    }
    
    private String user;
    
    public void setUser(String username){
        this.user = username;
    }
    
    public String getUser(){
        return this.user;
    }
    
    
    
}
