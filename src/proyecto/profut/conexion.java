
package proyecto.profut;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
 Connection conectar=null;
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/bdprofut","root","");
        }catch (ClassNotFoundException |SQLException e){
            System.out.print(e.getMessage());
        }
        return conectar;
    }      
}
