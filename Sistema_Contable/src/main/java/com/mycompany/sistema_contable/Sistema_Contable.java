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
        //ArrayList <Cuenta> cuenta=new ArrayList<>();
        boolean salir=false;
        String Botones[]={"Compra", "Pago", "Ventas"}, menu[] ={"Ingrese los movimientos de transacciones","Balanza de Comprobación","Estado Financieros"}, compras[]={"Inventario","Bienes inmuebles"}, pagos[]={"Servicios Básicos"}, venta[]={"Productos"};
        do{;
            String op = (String) JOptionPane.showInputDialog(null, "Elija el proceso a mostrar", "MENÚ", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch (op) {
                case "Ingrese los movimientos de transacciones":
                    //hd=true;
                    JOptionPane.showMessageDialog(null,"\n\tREGISTRO DE OPERACIONES");
                    int oP = JOptionPane.showOptionDialog (null, "\nPresione el botón de la transacción realizada", "REGISTRO DE OPERACIONES", 0 , JOptionPane.WARNING_MESSAGE, null/*icono*/, Botones, Botones[0]);
                    oP=oP+1;
                    switch (oP) {
                        case 1:
                            String com = (String) JOptionPane.showInputDialog(null, "¿Qué compró?", "COMPRA", JOptionPane.QUESTION_MESSAGE, null, compras, compras[0]);
                            switch (com) {
                                case "Inventario":
                                    
                                    break;
                            
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            String pago = (String) JOptionPane.showInputDialog(null, "¿Qué pagó?", "PAGO", JOptionPane.QUESTION_MESSAGE, null, pagos, pagos[0]);
                            switch (pago) {
                                case "Inventario":
                                    
                                    break;
                            
                                default:
                                    break;
                            }
                            break;

                        case 3:
                            String ven = (String) JOptionPane.showInputDialog(null, "¿Cuanto vendió por producto?", "VENTA", JOptionPane.QUESTION_MESSAGE, null, venta, venta[0]);
                            switch (ven) {
                                case "Inventario":
                                    
                                    break;
                            
                                default:
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                    
                    
                    
                    
                    
                    /*int No_Cuenta;
                    String Nombre_Cuenta, Clasificacion, Sub_clasificacion;
                    for (int i = 0; i <1; i++) {
                        No_Cuenta=Integer.parseInt(JOptionPane.showInputDialog("\nNumero de Referencia de la Cuenta: "));
                        Nombre_Cuenta=JOptionPane.showInputDialog("\nNombre de la Cuenta: ");
                        Clasificacion=JOptionPane.showInputDialog("\nClasificación de la Cuenta (Activo, Pasivo, Capital, Gasto, Ingreso): ");
                        Sub_clasificacion=JOptionPane.showInputDialog("\nSub Clasificación de la Cuenta: ");
                        cuenta.add(new Cuenta(No_Cuenta, Nombre_Cuenta, Clasificacion, Sub_clasificacion));
                    }
                    JOptionPane.showMessageDialog(null,"\nPRODUCTO REGISTRADOS EXITOSAMENTE \n");
                    break;*/
                case "Balanza de Comprobación":
                    break;
                case "Estado Financieros":
                    break;
                default:
                    System.out.println("**Ha escogido una opción invalida, ¡Intentelo nuevamente!**");
                    break;
            }

        } while(!salir);
        l.close();
    }
}