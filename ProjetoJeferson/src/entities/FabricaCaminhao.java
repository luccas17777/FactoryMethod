package entities;

public class FabricaCaminhao implements FabricaTransporte{ ///Implementa a Farica Transporte, para que possamos cria um transporte de Caminhao
    @Override
    public Transporte criarTransporte() {
        return new Caminhao(); //retorna uma instancia de Caminhao, para que possamos implementar a mensagem especifica da classe caminhao quando for chamada na classe logistica.
    }
}
