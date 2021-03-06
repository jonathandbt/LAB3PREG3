
package pe.edu.pucp.congresoft.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.pucp.congresoft.config.DBManager;
import pe.edu.pucp.congresoft.dao.CongresoDAO;
import pe.edu.pucp.congresoft.model.Congreso;

public class CongresoMySQL implements CongresoDAO{

    DBManager server;
    @Override
    public int insertar(Congreso congreso) {
        try{
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
      return 1;  
    }

    @Override
    public ArrayList<Congreso> listar() {
        ArrayList<Congreso> congresos= new ArrayList<>();
        try{    
        Class.forName("com.mysql.cj.jdbc.Driver");
          
        Connection con = DriverManager.getConnection(server.url,server.username,server.password);
        
        String sentencia="SELECT * FROM CONGRESO";
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(sentencia);
        while(rs.next()){
            Congreso congreso= new Congreso();
            congreso.setId(rs.getInt("ID_CONGRESO"));
            congreso.setFecha_inicio(rs.getDate("FECHA_INICIO"));
            congreso.setFecha_fin(rs.getDate("FECHA_FIN"));
            congreso.setNombre(rs.getString("NOMBRE"));
            congreso.setActivo(rs.getInt("ACTIVO"));
            congresos.add(congreso);
         }
        con.close();
        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
         return congresos;
    }
    
}
