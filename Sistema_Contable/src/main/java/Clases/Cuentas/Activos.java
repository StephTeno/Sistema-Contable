package Clases.Cuentas;
public class Activos extends Cuenta{
    private String sub_sub_C;
    public Activos(String no_Cuenta, String nombre_Cuenta, String sub_clasificacion, String sub_sub_c) {
        super(no_Cuenta, nombre_Cuenta, "ACTIVOS", sub_clasificacion);
        this.sub_sub_C=sub_sub_c;
    }

    public String getSub_sub_C() {
        return sub_sub_C;
    }
    public void setSub_sub_C(String sub_sub_C) {
        this.sub_sub_C = sub_sub_C;
    }
}