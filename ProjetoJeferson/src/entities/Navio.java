package entities;

public class Navio implements Transporte{

    @Override
    public void entregar() { //Esse é o método que vai ser chamado na classe logistica, para poder entregar a mensagem
        System.out.println("Entregando por navio...");
    }
}
