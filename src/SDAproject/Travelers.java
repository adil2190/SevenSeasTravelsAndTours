
package SDAproject;


public class Travelers {
    myconnection mc;
    public void selectTravelers(int t, int id){
        String sql = "update selection set travelers = " + t + ", payment = payment * "+ t +" where userID = "+id;
        mc = new myconnection();
        try{
            mc.st.executeUpdate(sql);
        }catch(Exception e){System.out.println(e);}
    }
}
