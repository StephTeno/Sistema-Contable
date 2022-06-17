package com.mycompany.sistema_contable;
import java.util.*;

import javax.swing.JOptionPane;

import Clases.Cuentas.*;
public class Sistema_Contable {
    public static double Sumatoria_Activos(ArrayList <Activos> a){
        double sumaA=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClasificacion().equals("ACTIVOS")) {
                sumaA+=a.get(i).getCantidad();
            }
        }
        return sumaA;
    }
    public static double Sumatoria_Pasivos(ArrayList <Pasivos> a){
        double sumaA=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClasificacion().equals("PASIVOS")) {
                sumaA+=a.get(i).getCantidad();
            }
        }
        return sumaA;
    }
    public static double Sumatoria_Capital(ArrayList <Capital> a){
        double sumaA=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClasificacion().equals("CAPITAL")) {
                sumaA+=a.get(i).getCantidad();
            }
        }
        return sumaA;
    }




    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        boolean salir=false;
        int op;
        do{
            /*op = Integer.parseInt(JOptionPane.showInputDialog("Elije una opcion:\n "
            + "1)Circulo\n "
            + "2)Romboide\n "
            + "3)Cuadrado\n "
            + "4)Triangulo\n "
            + "5)Rectangulo"));*/
            
            while(!l.hasNextInt())                             
            {
                JOptionPane.showMessageDialog(null, "Elije una opcion:\n "
                + "1)Circulo\n "
                + "2)Romboide\n "
                + "3)Cuadrado\n "
                + "4)Triangulo\n "
                + "5)Rectangulo");
                l.next();
            }
            op = l.nextInt();
            switch (op) {
                case 1:
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
