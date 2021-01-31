
package SDAproject;


class Users {
    int userid, packageid, requestno, travelers;
    String username, destinaton, packagetype;
    public Users(int userid, int packageid, int requestno, int travelers, String username, String destination, String packagetype){
        this.userid = userid;
        this.packageid = packageid;
        this.requestno = requestno;
        this.travelers = travelers;
        this.username = username;
        this.destinaton = destination;
        this.packagetype = packagetype;
    }
    
    public int getUserId(){
        return userid;
    }
    
    public int getPackageId(){
        return packageid;
    }
    
    public int getRequestNo(){
        return requestno;
    }
    
    public int getTravelers(){
        return travelers;
    }
    
    public String getUserName(){
        return username;
    }
    
    public String getDestination(){
        return destinaton;
    }
    
    public String getPackageType(){
        return packagetype;
    }
}
