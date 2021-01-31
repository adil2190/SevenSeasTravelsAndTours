/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SDAproject;

import java.sql.*;
import java.util.*;
public class AdminPanel {
    myconnection mc,mc1;
    void showRequest(int id){
        Scanner in = new Scanner(System.in);
        mc = new myconnection();
        mc1 = new myconnection();
        String sql = "select * from selection";
    
        try{
            ResultSet rs = mc.st.executeQuery(sql);
            while(rs.next()){
                if(rs.getString("confirmation") == null){
                    System.out.println("\nRequest Number : " + rs.getInt("requestNo"));
                    System.out.println("User ID : " + rs.getInt("userID"));
                    System.out.println("User name : " + rs.getString("username"));
                    System.out.println("Package ID : " + rs.getInt("packageID"));
                    System.out.println("Confirmation Status : Not Confirmed Yet. . ");
                }else{
                    System.out.println("\nRequest Number : " + rs.getInt("requestNo"));
                    System.out.println("User ID : " + rs.getInt("userID"));
                    System.out.println("User name : " + rs.getString("username"));
                    System.out.println("Package ID : " + rs.getInt("packageID"));
                    System.out.println("Confirmation Status : Confirmed ! !");
                    
                }
            }
            int select;
            String Confirmed = "'Confirmed'";
            System.out.print("Select Request : ");
            select = in.nextInt();
            ResultSet rs1 = mc1.st.executeQuery(sql);
            while(rs1.next()){
                if(select == rs1.getInt("requestNo")){
                    int z = mc.st.executeUpdate("update selection set confirmation = " + Confirmed);
                    if(z>0){
                        System.out.println("Successfull");
                    }else{
                        System.out.println("Unsuccessfull");
                    }
                }
            }
        }catch(Exception e){System.out.println(e);}
    }}