
package SDAproject;

public class OfflinePayment implements Payment{
    PaymentAdapter adapter;
    myconnection mc;

    @Override
    public void confirmPayment(String paymenttype, String address, int id, String creditcardno) {
        if(paymenttype.equalsIgnoreCase("cash")){
            mc = new myconnection();
            String sql = "update selection set address = '" + address + "' where userID = "+id;
            try{
                mc.st.executeUpdate(sql);
            }catch(Exception e){System.out.println(e);}
        }
        else if(paymenttype.equalsIgnoreCase("creditcard")){
            adapter = new PaymentAdapter(paymenttype);
            adapter.confirmPayment(paymenttype, address, id, creditcardno);
        }
    }
    
}
