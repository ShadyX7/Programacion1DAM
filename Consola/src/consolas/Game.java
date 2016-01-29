package consolas;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Victor
 */
public class Game {
    
    private String nombre;
    private double precio;
    private Date Fechita;

    public Game(String titulo, double precio, Date fecha) {
        this.nombre=titulo;
        this.precio=precio;
        this.Fechita=fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio=precio;
    }

    public Date getFechita() {
        return Fechita;
    }

    public void setFechita(Date Fechita) {
        this.Fechita=Fechita;
    }

    
    public int hashCode() {
        int hash=7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.Fechita);
        return hash;
    }

    
    public boolean equals(Object obj) {
    if (obj==null) {
    return false;
    }
        
    if (getClass() != obj.getClass()) {
    return false;
    }
   
    final  Game other=(Game) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.Fechita, other.Fechita)) {
            return false;
        }
        return true;
    }

    
    public String toString() {
    return "Juego ---->" + "Titulo: " + nombre + " || Precio=" + precio  + "€" + " || Fecha de compra: " + Fechita + "||";
    
  }
    
}
