package prova;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.JOptionPane;


/**
 *
 * @author Felipe
 */
public class Leitor {

     public static void main(String[] args) throws FileNotFoundException {
        /*// TODO code application logic here
        Path caminho = Paths.get("C:\Users\Felipe\Desktop\HinoDoMengao.txt");
        try{
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
        } catch(HeadlessException | IOException erro) {
        
        }
        
    } */
        
        //Lendo o arquivo txt.
        File file = new File("C:\\Users\\Felipe\\Desktop\\HinoDoMengao.txt");
        
        Scanner scan = new Scanner(file);
        
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
     }
        
        //Contando a quantidade de letras repetidas.
        public static Map<String, Integer> contar(String frase){
           
        Map<String, Integer> map = new TreeMap<>();                
        for(char item : frase.toCharArray())
        {
            Integer s = map.get(String.valueOf(item));
            if (s != null)
            {
                map.put(String.valueOf(item), ++s);
            }
            else
            {
                map.put(String.valueOf(item), 1);
            }
        }
        return map;
    }
        
    public static void Imprimir(Map<String, Integer> items)
    {       
        for(Map.Entry<String, Integer> a : items.entrySet())
        {
            System.out.println(a.getKey() + ": " +  a.getValue());
        }    
    }    
    
    
    
}
     
     

