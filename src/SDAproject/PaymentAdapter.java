
package SDAproject;

public class PaymentAdapter implements Payment{
    
    myconnection mc;
    
    OnlinePayment onlinepayment;

   
    public PaymentAdapter(String paymentType){
         if(paymentType.equalsIgnoreCase("creditcard")){
             onlinepayment = new CreditCard();
         }
     }

    @Override
    public void confirmPayment(String paymenttype, String address, int id, String creditcardno) {
        if (paymenttype.equalsIgnoreCase("creditcard")){
            onlinepayment.creditcard(creditcardno, id);
        }
    }

   
     
     
}
