package aula07.rinha.de.lutadores;

public class Aula07RinhaDeLutadores {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Scorpion", "Outworld", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Kabal", "Outworld", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Liu Kang", "Earthrealm", 35, 1.65f, 80.9f, 12, 2 , 1);
        l[3] = new Lutador("Kung Lao", "Earthrealm", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Goro", "Netherrealm", 98, 2.01f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Kintaro", "Netherrealm", 35, 1.98f, 111.4f, 7, 3, 1);
                
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        UEC01.lutar();
        l[2].status();
        l[3].status();
    }
    
}
