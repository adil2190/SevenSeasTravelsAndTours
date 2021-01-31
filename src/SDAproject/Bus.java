
package SDAproject;


class Bus {
    int price,  ticketNo;
    String type, country;
    
    public Bus(String country, String type, int price, int ticketNo){
        this.type = type;
        this.price = price;
        this.country = country;
        this.ticketNo = ticketNo;
    }
    
    public String getType(){
        return type;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String getCountry(){
        return country;   
    }
    
    public int getTicketNo(){
        return ticketNo;
    }
    
}
