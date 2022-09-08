package aula04;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;
    
    public Caneta(String m, String c, float p) { //Este é o método construtor.
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {       
        this.tampada = false;
    }
            
            
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
