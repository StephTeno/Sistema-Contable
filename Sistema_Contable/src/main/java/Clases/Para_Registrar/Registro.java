package Clases.Para_Registrar;

import Clases.Cuentas.Cuenta;

public class Registro {
    private String Fecha;
    private String Descripcion;
    private Cuenta Cuentas;
    public Registro(String fecha, String descripcion, Cuenta cuentas) {
        Fecha = fecha;
        Descripcion = descripcion;
        Cuentas = cuentas;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public Cuenta getCuentas() {
        return Cuentas;
    }
    public void setCuentas(Cuenta cuentas) {
        Cuentas = cuentas;
    }
    
    
}
