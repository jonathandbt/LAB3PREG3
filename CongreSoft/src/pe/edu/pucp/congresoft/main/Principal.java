
package pe.edu.pucp.congresoft.main;

import java.util.ArrayList;
import pe.edu.pucp.congresoft.dao.CongresoDAO;
import pe.edu.pucp.congresoft.model.Congreso;
import pe.edu.pucp.congresoft.mysql.CongresoMySQL;

public class Principal {
    public static void main(String []args){
        ArrayList<Congreso> congresos= new ArrayList<>();
        CongresoDAO daoCongreso= new CongresoMySQL();
        congresos= daoCongreso.listar();
        for(Congreso c: congresos){
            System.out.println(c.imprimir());
        }
        
    }
    
}
