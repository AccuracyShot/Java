package aula12;

public class Aula12 {

    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave v = new Ave();
        
        m.setPeso(85.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.emitirSom();
        m.locomover();
        
    }
    
}
