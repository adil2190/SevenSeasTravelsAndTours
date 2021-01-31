
package SDAproject;

import java.sql.ResultSet;


public class AdminLogin {
    
    public boolean signIn(String uname, String pass){
        myconnection mc = new myconnection();
        String sql = "select id, username, password from users";
        try{
            ResultSet rs = mc.st.executeQuery(sql);
            while(rs.next()){
                if(uname.equalsIgnoreCase(rs.getString("username")) && pass.equalsIgnoreCase(rs.getString("password"))){
                    AdminPanell ap = new AdminPanell();
                    ap.setVisible(true);
                    return true;
                }


            }
        }catch(Exception e){System.out.println(e);}
        return false;
    }
}
