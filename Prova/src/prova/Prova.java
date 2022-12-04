package prova;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 *
 * @author Felipe
 */
public class Prova {

     public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Path caminho = Paths.get("C:\\Users\\Felipe\\Desktop\\HinoDoMengao.txt");
        try{
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
        } catch(HeadlessException | IOException erro) {
        
        }
        
    } 
        
        /*File file = new File("C:\\Users\\Felipe\\Desktop\\HinoDoMengao.txt");
        
        Scanner scan = new Scanner(file);
        
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    
    
    
    }*/
     
     
}