
package SDAproject;

public class CreditCard implements OnlinePayment{
    myconnection mc;

    @Override
    public void creditcard(String creditcardno, int id) {
        String sql = "update selection set creditcard = " + creditcardno + " where userID = "+id;
        mc = new myconnection();
        try{
            mc.st.executeUpdate(sql);
        }catch(Exception e){System.out.println(e);}
    }

    
    
}
