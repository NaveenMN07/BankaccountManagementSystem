
package bankmanagement.system;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
  public Conn(){
      try{
       
          c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "root");
          s=c.createStatement();
          
      }catch(Exception e){
          System.out.print(e);
      }
  }
    
}
