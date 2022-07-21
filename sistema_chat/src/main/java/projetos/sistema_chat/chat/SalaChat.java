package projetos.sistema_chat.chat;
import java.util.ArrayList;
import projetos.sistema_chat.bot.BotProxy;
import projetos.sistema_chat.participante.Participante;

public class SalaChat implements MediatorChat{
    private String nomeSala;
    //LISTA DE PARTICIPANTES DA SALA
    public ArrayList<Participante> participantes = new ArrayList<Participante>();
    //BOTS
    private BotProxy bot = new BotProxy();
    
    //CONSTRUTOR
    public SalaChat(String nomeSala){
        this.nomeSala = nomeSala;
        System.out.println("\nNOVO GRUPO: " + this.nomeSala + "\n");
    }
    
    //ADD NOVO PARTICIPANTE A SALA
    @Override
    public void novoParticipante(Participante participante) {
       participantes.add(participante);
       System.out.println(participante.getNome() + " entrou em " + this.nomeSala);
    }
    
    //ENVIA MENSAGEM
    @Override
    public void novaMensagem(Participante participante, String mensagem) {
        if(this.bot.validaMensagem(mensagem)){
            participante.enviarMensagem(mensagem);
        }
    }
    
    //LISTA OS PARTICIPANTES DA SALA
    public void exibeParticipantes(){
        System.out.println("\nParticipantes de "+ this.nomeSala +": " + participantes.toString() + "\n");
    }
    
    //REGRAS DE NEGÓCIO
    
    
    
    //INFORMAÇÕES
    public void trazerInformacao(String tipo){
        this.bot.trazInformacao("data");
        this.bot.trazInformacao("temperatura");
        this.bot.trazInformacao("dolar");
        this.bot.trazInformacao("bitcoin");
    }
    
}
