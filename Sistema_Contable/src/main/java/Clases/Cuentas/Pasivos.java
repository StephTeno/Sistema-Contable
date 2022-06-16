package Clases.Cuentas;
public class Pasivos extends Cuenta{

    public Pasivos(String no_Cuenta, String nombre_Cuenta, String sub_clasificacion,
            double cantidad) {
        super(no_Cuenta, nombre_Cuenta, "PASIVOS", sub_clasificacion, cantidad);
    }
    
}
