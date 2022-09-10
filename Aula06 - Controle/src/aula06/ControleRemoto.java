package aula06;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;   
    //Métodos Especiais
    
    public ControleRemoto() { //Construtor
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()){
        System.out.println("---Menu---");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
            } 
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o Menu.");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume()+5);
        } else {
            System.out.println("TV desligada. Não é possível aumentar o volume.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume()-5);        
        } else {
            System.out.println("TV desligada. Não é possível diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()&& this.getVolume() > 0); {
            this.setVolume(0);
        }      
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.println("O mudo já está desligado.");
        }
    }
    
    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())) {
           this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && !(this.getTocando())) {
           this.setTocando(false);
        }
    }
    
}
