
package pe.edu.pucp.congresoft.model;   
import java.util.Date;

public class Congreso {
    private static int i=1;
    int id;
    String nombre;
    Date fecha_inicio;
    Date fecha_fin;
    int activo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public Congreso(){
    }
    public Congreso(String nombre, Date fecha_inicio, Date fecha_fin,int activo){
        this.id=i;
        i++;
        this.nombre=nombre;
        this.fecha_fin=fecha_fin;
        this.fecha_inicio=fecha_inicio;
        this.activo=activo;
    }
    
    public String imprimir(){
        return id+" - "+ nombre +" - "+ fecha_inicio +" - "+ fecha_fin +" - "+activo;
    }
}


