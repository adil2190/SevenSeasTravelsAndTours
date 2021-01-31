
package SDAproject;


class Flights {
    int price, ticketNo;
    String destination, type;
    
    public Flights(String destination, String type, int price, int ticketNo){
        this.destination = destination;
        this.type = type;
        this.price = price;
        this.ticketNo = ticketNo;
    }
    
    public String getDestination(){
        return destination;
    }
    
    public String getType(){
        return type;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getTicketNo(){
        return ticketNo;
    }
    
}
