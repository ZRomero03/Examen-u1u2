/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Examen1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce el nombre del instrumento");
        double bajo = 1250.45;
        System.out.println("El valor de venta es " + bajo);
        
        System.out.println("Introduce el precio de compra");
        String precioCompra = lectura.nextLine();
    }
    
}
