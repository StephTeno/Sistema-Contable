package Clases.Para_Registrar;
import Clases.Cuentas.Activos;

public class R_Activos extends Registro{
    private Activos Activos;
    private double Precio;
    public R_Activos(String fecha, String descripcion, double cantidad, Activos Activos, double precio) {
        super(fecha, descripcion, cantidad);
        this.Activos = Activos;
        this.Precio=precio;
    }

    public Activos getActivos() {
        return Activos;
    }
    public void setActivos(Activos Activos) {
        this.Activos = Activos;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

}

