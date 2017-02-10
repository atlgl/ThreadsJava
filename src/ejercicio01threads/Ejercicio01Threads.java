/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01threads;
import java.util.Scanner;
/**
 *
 * @author upam
 */
public class Ejercicio01Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Opciones\n1.Thread ");
        int opc=scan.nextInt();
        switch(opc){
            case 1:
                ThreadAnonimous an=new ThreadAnonimous();
                
                break;
            case 2:
                ThreadLegacy tl=new ThreadLegacy();
                tl.start();
                break;
        }
    }
    
}
