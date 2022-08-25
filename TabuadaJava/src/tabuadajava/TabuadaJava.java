/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuadajava;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class TabuadaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int cc = 1;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quer saber a tabuada de qual número? ");
        while (cc <= 10) {
            N = leitor.nextInt();
            int R = (N * cc);
            System.out.println(N + " x " + cc + " = " + R);
            cc++;
        } 
    }
    
}
