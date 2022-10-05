package aula12;

public class Mamifero extends Animal {
    private String corPelo;
    
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }
    
    //ToString
    
    
    
    //Getters and Setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
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
