/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05.contabanco;

/**
 *
 * @author Felipe
 */
public class Ex05ContaBanco {

    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Isabela");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1236);
        p2.setDono("Diego Lira");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(200);
        p2.sacar(1000);
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
        
}
