package Clases.Cuentas;
public class Cuenta {
    private String No_Cuenta;
    private String Nombre_Cuenta;
    private String Clasificacion;
    private String sub_clasificacion;

    public Cuenta(String no_Cuenta, String nombre_Cuenta, String clasificacion, String sub_clasificacion) {
        this.No_Cuenta = no_Cuenta;
        this.Nombre_Cuenta = nombre_Cuenta;
        this.Clasificacion=clasificacion;
        this.sub_clasificacion=sub_clasificacion;
    }

    public String getNo_Cuenta() {
        return this.No_Cuenta;
    }

    public void setNo_Cuenta(String no_Cuenta) {
        this.No_Cuenta = no_Cuenta;
    }

    public String getNombre_Cuenta() {
        return this.Nombre_Cuenta;
    }

    public void setNombre_Cuenta(String nombre_Cuenta) {
        this.Nombre_Cuenta = nombre_Cuenta;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        Clasificacion = clasificacion;
    }

    public String getSub_clasificacion() {
        return sub_clasificacion;
    }

    public void setSub_clasificacion(String sub_clasificacion) {
        this.sub_clasificacion = sub_clasificacion;
    }

    /*public void Depositar (double x){
        double ns=this.Cantidad+x;
        this.Cantidad=ns;
    }
    public void Retirar(double y){
        double ns=this.Cantidad-y;
        this.Cantidad=ns;
    }*/
}
