package mahmoudi_etudiant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


class connection {
    
     public ResultSet rs;
     
	public static void conect() throws Exception
	{
           
            
		
            try{
            
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/getudiant","getud","000000");
			System.out.println("Connection disponible!!!");
                        
		}
		catch(ClassNotFoundException | SQLException e){
			System.out.println("pas de connection!");
			
		}
	}
            
            
        }
