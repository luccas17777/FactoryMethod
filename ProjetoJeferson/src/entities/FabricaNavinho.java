package entities;

public class FabricaNavinho implements FabricaTransporte{ //Implementa a Farica Transporte, para que possamos cria um transporte de Navio
    @Override
    public Transporte criarTransporte() {
        return new Navio(); ////retorna uma instancia de Caminhao, para que possamos implementar a mensagem especifica da classe caminhao quando for chamada na classe logistica.
    }
}
