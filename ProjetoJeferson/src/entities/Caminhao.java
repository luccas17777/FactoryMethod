package entities;

public class Caminhao implements Transporte{ // Implementa a interface Transporte

    @Override
    public void entregar() { //Esse é o método que vai ser chamado na classe logistica, para poder entregar a mensagem
        System.out.println("Entregando por caminhão..."); //Mensagem da classe caminhao
    }
}
