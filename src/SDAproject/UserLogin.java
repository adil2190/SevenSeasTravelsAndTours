
package SDAproject;

import java.sql.ResultSet;
import java.util.Scanner;


public class UserLogin {
     private static UserLogin ul = new UserLogin();
    
    private UserLogin(){}
    
    public static UserLogin getInstance(){
        return ul;
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
    
   
    
    public void registration(String uname, String pass, String email, String contact, int age){
       mc = new myconnection();
       l = new login();
       String sql = "insert into users values('"+uname+"','"+pass+"','"+email+"', '"+contact+"',"+age+")";
       try{
       mc.st.executeUpdate(sql);
//       l.setPanel(false, true, false);
       }catch(Exception e){System.out.println(e);}
    }
}
