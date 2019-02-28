
package br.com.senacrs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {
    public static Connection getConnection(){
        
    try{
        Class.forName("com.mysql.jdbc.Driver2");
    return DriverManager.getConnection("jdbc:mysql://localhost/BDPessoa", "root", "1234");    
    }catch(SQLException ex){
        Logger.getLogger(ConnectionFactory.class.getName()) .log(Level.SEVERE, null, ex);
    }   catch (ClassNotFoundException ex) {
        }
        return null;
    
}}
