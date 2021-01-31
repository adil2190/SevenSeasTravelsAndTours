
package SDAproject;

import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Premium implements Package{

    myconnection mc;
    @Override
    public void select(int id, String username, int packageID, String destination, int payment) {
        try{
        mc = new myconnection();
        String sql1 = "select * from selection where userID = " +id;
        ResultSet rs = mc.st.executeQuery(sql1);
        if(rs.next()){
            JOptionPane.showMessageDialog(null, "You have already booked a package, Please delete previous package to book a new one.. \n Thank You");
        }
        else{
        String pkg_type = "Premium";
        String sql = "insert into selection (userID, username, packageID, PackageType, destination, payment) values(" + id + ", '" + username+ "', " + packageID + ", '" + pkg_type + "','" + destination + "', "+payment+")";
        
            mc.st.executeUpdate(sql);
        }
        }catch(Exception e){System.out.println(e);}
    }
    
}
