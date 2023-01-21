package mahmoudi_etudiant;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author mohamed_mahmoudi
 */


public class Gestion_etudiant_mahmoudi {
    
    public static void main(String[]args) throws Exception {
        
   /* DB db=new DB();*/
   
   
   
       ResultSet rs=DB.getData("select code from code;");
       
       while (rs.next()) {
    System.out.println(rs.getString("code"));
    
       }


        
        one o=new one();
        o.setVisible(true);}
        
        
        
    
    
}
