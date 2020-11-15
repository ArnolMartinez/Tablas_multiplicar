package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);

        char opc='s';
        int tabla;
        while(opc=='s'){
            System.out.println("Que tabla desea visializar");
            int c=r.nextInt();
            if(c>0 && c<=12) {
                for (int x = 0; x <= 10; x++) {
                    tabla = c * x;
                    System.out.printf("%d X %d =%d \n", c, x, tabla);
                }
            }
            else {
                System.out.println("Lo sentimos,solo puede visualizar las tablas  del 1 al 12");
            }
            System.out.println("Para salir presione n, para continuar  s");
            opc=r.next().charAt(0);
    }
}
}