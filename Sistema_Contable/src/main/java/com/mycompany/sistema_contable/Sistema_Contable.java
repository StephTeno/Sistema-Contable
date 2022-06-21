package com.mycompany.sistema_contable;
import java.util.*;
import javax.swing.JOptionPane;
import Clases.Cuentas.*;
import Clases.Para_Registrar.R_Activos;
public class Sistema_Contable {
    public static double Sumatoria_Activos(ArrayList <R_Activos> a){
        double sumaA=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getActivos().getClasificacion().equals("ACTIVOS")) {
                sumaA+=a.get(i).getRActivos().getCantidad();
            }
        }
        return sumaA;
    }
    public static double Sumatoria_Pasivos(ArrayList <Pasivos> a){
        double sumaA=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClasificacion().equals("PASIVOS")) {
                //sumaA+=a.get(i).getCantidad();
            }
        }
        return sumaA;
    }
    public static double Sumatoria_Capital(ArrayList <Capital> a){
        double sumaA=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClasificacion().equals("CAPITAL")) {
                //sumaA+=a.get(i).getCantidad();
            }
        }
        return sumaA;
    }




    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        ArrayList <Cuenta> cuenta=new ArrayList<>();
        boolean salir=false;
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Elije una opcion:\n "
            + "1)Circulo\n "
            + "2)Romboide\n "
            + "3)Cuadrado\n "
            + "4)Triangulo\n "
            + "5)Rectangulo")
            );


            switch (op) {
                case 1:
                    //hd=true;
                    JOptionPane.showMessageDialog(null,"\n\tREGISTRO DE CUENTAS");
                    JOptionPane.showMessageDialog(null,"\nIngrese los siguientes datos");
                    int No_Cuenta;
                    String Nombre_Cuenta, Clasificacion, Sub_clasificacion;
                    for (int i = 0; i <1; i++) {
                        No_Cuenta=Integer.parseInt(JOptionPane.showInputDialog("\nNumero de Referencia de la Cuenta: "));
                        Nombre_Cuenta=JOptionPane.showInputDialog("\nNombre de la Cuenta: ");
                        Clasificacion=JOptionPane.showInputDialog("\nClasificación de la Cuenta (Activo, Pasivo, Capital, Gasto, Ingreso): ");
                        Sub_clasificacion=JOptionPane.showInputDialog("\nSub Clasificación de la Cuenta: ");
                        cuenta.add(new Cuenta(No_Cuenta, Nombre_Cuenta, Clasificacion, Sub_clasificacion));
                    }
                    System.out.print("\nPRODUCTO REGISTRADOS EXITOSAMENTE \n");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("**Ha escogido una opción invalida, ¡Intentelo nuevamente!**");
                    break;
            }

        }while(!salir);
        l.close();
    }
}