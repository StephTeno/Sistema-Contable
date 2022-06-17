package com.mycompany.sistema_contable;
import java.util.*;
public class Sistema_Contable {

    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        boolean salir=false;
        int op;


        do{
                String line = l.nextLine();
                try {
                    op = Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese numeros enteros para escoger su opción: ");
                    continue;
                }
                switch (op) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        System.out.print("\n**Ha escogido una opción invalida, ¡Intentelo nuevamente!**");
                        break;
                }
        }while(!salir && l.hasNextLine());
        l.close();
    }
}
