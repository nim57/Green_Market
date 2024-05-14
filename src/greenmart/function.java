/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package greenmart;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nimesh
 */
public class function {
    
    
     public Connection createConnection(){
       
        Connection connection= null;
        
       MysqlDataSource mds = new MysqlDataSource();
        
        mds.setServerName("localhost");
        mds.setPortNumber(3306);
        mds.setUser("root");
        mds.setPassword("");
          mds.setDatabaseName("greenmart_db");
        
        try {
            connection = mds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
   
    
       // register start
     
     
        public static boolean isValid(String password){
      int i1=0,i2=0,i3=0;
      
      if(password.length()<8){
          return false;
      }
      else{
          for(int p=0; p< password.length();p++){
              if(Character.isLetter(password.charAt(p))){
                  i1=1;
              }
          }
          for(int r=0;r<password.length();r++){
              if(Character.isDigit(password.charAt(r))){
                  i2=1;
              }
          }
          for(int s=0;s<password.length();s++){
              char c= password.charAt(s);
              if(c>=33&&c<=46||c==64){
              i3=1;
          }
              
          }
          if(i1==1 && i2==1&& i3==1)
              return true;
          return false;
      }
      
    }
      
     
     public static boolean valiedphone(String phone){
        
        if(phone.length()<10){
          return false;
      }
        else{
            return true;
        }
    }
     
     public boolean add_user(String uname,String uemail,String uaddress, String upostalcode,String uphone ,String upassword ){
          PreparedStatement st;
      String addquery = "INSERT INTO `users_reg`(`name`, `email`, `address`, `postalcode`, `phone`, `password`) VALUES (?,?,?,?,?,?)";
        
        try {
            st = createConnection().prepareStatement(addquery);
            
            st.setString(1,uname);
            st.setString(2,uemail);
            st.setString(3, uaddress);
            st.setString(4,upostalcode);
            st.setString(5,uphone);
            st.setString(6,upassword);
            
            return(st.executeUpdate()>0);
           
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    
      
     } 
     
         // register end 
     
     
      // Manage users start
    
     public boolean update_users(int id, String u_name, String u_email, String u_address,String u_pc,String u_phon,String u_password){
         PreparedStatement st;
         String updatequery = "UPDATE `users_reg` SET `name`=?,`email`=?,`address`=?,`postalcode`=?,`phone`=?,`password`=? WHERE `U-id`=?";
        
             try {
            st = createConnection().prepareStatement(updatequery);
            
            
            st.setString(1,u_name);
            st.setString(2, u_email);
            st.setString(3, u_address);
            st.setString(4 ,u_pc);
            st.setString(5, u_phon);
            st.setString(6, u_password);
            st.setInt(7,id);
            
             return(st.executeUpdate()>0);
          
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
        
      
    }
    
    public boolean delete_users(int id ){
        
         PreparedStatement st;
        String deletequery = "DELETE FROM `users_reg` WHERE `U-id`=?";
        
        try {
            st = createConnection().prepareStatement(deletequery);
            
            
            st.setInt(1,id);
            
             return(st.executeUpdate()>0);
          
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
        
    }
    
    public void users_Table(JTable table){
        
        PreparedStatement ps;
        ResultSet rs;
        String selectquery = "SELECT * FROM `users_reg`";
        
        try {
            ps = createConnection().prepareStatement(selectquery);
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                
                row = new Object[7];
                row[0]= rs.getInt(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]= rs.getString(4);
                row[4]= rs.getString(5);
                row[5]= rs.getString(6);
                row[6]= rs.getString(7);
               
                tableModel.addRow(row);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    
    
    // Manage users end 
    
    
     //  Manage products  Start
 
    public boolean add_product( String name, String category,String qua,String prices){
        
        System.out.println(category);
        PreparedStatement st;
        String addquery = "INSERT INTO `manage_product`(`pro_name`, `pro_category`, `pro_quantity`, `pro_price`) VALUES (?,?,?,?)";
        
        try {
            st = createConnection().prepareStatement(addquery);
            
            st.setString(1,name);
            st.setString(2,category);
            st.setString(3, qua);
            st.setString(4, prices);
            
            return(st.executeUpdate()>0);
           
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
   public boolean edit_product(int id, String name, String category,String qua,String prices){
         PreparedStatement st;
         String updatequery = "UPDATE `manage_product` SET `pro_name`=?,`pro_category`=?,`pro_quantity`=?,`pro_price`=? WHERE `id`=?";
        
        try {
            st = createConnection().prepareStatement(updatequery);
            
            
            st.setString(1,name);
            st.setString(2, category);
            st.setString(3, qua);
            st.setString(4,prices);
           st.setInt(5,id);
            
             return(st.executeUpdate()>0);
          
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
        
    }
    
    public boolean removproduct(int id  ){
        
         PreparedStatement st;
        String deletequery = "DELETE FROM `manage_product` WHERE `id`=?";
        
        try {
            st = createConnection().prepareStatement(deletequery);
            
            
            st.setInt(1,id);
            
             return(st.executeUpdate()>0);
          
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
        
    }
    
    public void productTable(JTable table){
        
        PreparedStatement ps;
        ResultSet rs;
        String selectquery = "SELECT * FROM `manage_product`";
        
        try {
            ps = createConnection().prepareStatement(selectquery);
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                
                row = new Object[5];
                row[0]= rs.getInt(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]= rs.getString(4);
                row[4]= rs.getString(5);
            
                tableModel.addRow(row);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    
    // Manage products  End
     
    //home start
    
     public boolean add_cart( int id,String name, String qua,String prices){
        
       
        PreparedStatement st;
        String addquery = "INSERT INTO `manage_cart`(`pro_id`, `cart_name`, `cart_quntity`, `cart_price`) VALUES (?,?,?,?)";
        
        try {
            st = createConnection().prepareStatement(addquery);
            
            st.setInt(1,id);
            st.setString(2,name);
            st.setString(3, qua);
            st.setString(4, prices);
            
            return(st.executeUpdate()>0);
           
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
     
     
     
    
    
    //home end 
     
     // cart view start
     
     public void cartTable(JTable table){
        
        PreparedStatement ps;
        ResultSet rs;
        String selectquery = "SELECT * FROM `manage_cart`";
        
        try {
            ps = createConnection().prepareStatement(selectquery);
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                
                row = new Object[5];
                row[0]= rs.getInt(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]= rs.getString(4);
                row[4]= rs.getString(5);
            
                tableModel.addRow(row);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
        
    }
        
    
        
        public boolean removcart(int id  ){
        
         PreparedStatement st;
        String deletequery = "DELETE FROM `manage_cart` WHERE `cart_id`=?";
        
        try {
            st = createConnection().prepareStatement(deletequery);
            
            
            st.setInt(1,id);
            
             return(st.executeUpdate()>0);
          
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
        
    }
        
     
     // cart view end
        
     // start
        
        
      
                
        public boolean add_itemm( String id,String name,String email,String phone,String total,String method){
        
       
        PreparedStatement st;
        String addquery = "INSERT INTO `manage_item`( `us_id`, `name`, `email`, `phone`, `total`, `method`) VALUES (?,?,?,?,?,?)";
        
        try {
            st = createConnection().prepareStatement(addquery);
            
            st.setString(1,id);
            st.setString(2,name);
            st.setString(3, email);
            st.setString(4, phone);
            st.setString(5, total);
            st.setString(6, method);
            
            return(st.executeUpdate()>0);
           
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
                }
    
        
        
         public void itemTable(JTable table){
        
        PreparedStatement ps;
        ResultSet rs;
        String selectquery = "SELECT * FROM `manage_item`";
        
        try {
            ps = createConnection().prepareStatement(selectquery);
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                
                row = new Object[7];
                row[0]= rs.getInt(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]= rs.getString(4);
                row[4]= rs.getString(5);
                row[5]= rs.getString(6);
                row[6]= rs.getString(7);
            
                tableModel.addRow(row);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
        
    }
        
        
     // end   
     
     
}
