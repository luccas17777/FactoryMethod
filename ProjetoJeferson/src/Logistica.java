import entities.FabricaCaminhao;
import entities.FabricaNavinho;
import entities.FabricaTransporte;
import entities.Transporte;

public class Logistica {
    public static void main(String[] args) {
        FabricaTransporte fabricaCaminhao = new FabricaCaminhao(); //A variavel fabrica caminhao é do tipo interface para que possamos utilizar a classe que a implementa para criar um caminhao
        FabricaTransporte fabricaNavio = new FabricaNavinho(); //Neste caso criamos o navio

        Transporte caminhao = fabricaCaminhao.criarTransporte(); //Utilizamos essa variavel para que possamos printar a mensagem, e ela recebe justaemente a instancia de caminhao
        caminhao.entregar(); //printamos a mensagem

        Transporte navio = fabricaNavio.criarTransporte();
        navio.entregar();
    }
}
