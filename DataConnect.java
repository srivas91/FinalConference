
package com.connect;
import java.sql.*;
public class DataConnect {
    
    public static Connection getConnect()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("","root","root");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return con;
    }
}
