package aula12;

public class Peixe extends Animal {
    private String corEscama;
    
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo planctons");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMembros() {
        return membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }
    
    
}
