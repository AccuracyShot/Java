/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.pkg3.leandro;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Exercicio3Leandro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int c; 
               
                       
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();       
                
        double delta;
        delta = Math.pow(b, 2) - 4 * a * c;
                       
        
        double x1;                 
        x1 = (-b + Math.sqrt(delta))/ (2 * a);
        
        double x2;                 
        x2 = (-b - Math.sqrt(delta))/ (2 * a);
        
        
        if (delta < 0) {
            System.out.println("Não existem raízes Reais");        
        } else {
            System.out.println("Existem raízes Reais");
        }
        
        if (delta == 0) {
            System.out.println("Raízes iguais");       
        }
        
        System.out.println("Delta é igual a: " + delta);
        System.out.println("O valor de x1 é: " + x1);
        
        
    }
}

   
