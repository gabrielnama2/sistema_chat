package projetos.sistema_chat.chat;
import java.util.ArrayList;
import projetos.sistema_chat.participante.BotBitcoin;
import projetos.sistema_chat.participante.BotDolar;
import projetos.sistema_chat.participante.BotHora;
import projetos.sistema_chat.participante.BotTemperatura;
import projetos.sistema_chat.participante.Participante;

public class SalaChatProxy implements MediatorChat{
    private String nomeSala;
    private SalaChat salaChat;
    public ArrayList<Participante> participantes = new ArrayList<Participante>();
    BotHora botHora = new BotHora();
    BotTemperatura botTemperatura = new BotTemperatura();
    BotDolar botDolar = new BotDolar();
    BotBitcoin botBitcoin = new BotBitcoin();
    
    //CONSTRUTOR
    public SalaChatProxy(String nomeSala){
        salaChat = new SalaChat(nomeSala);
    }
    
    //ADD NOVO PARTICIPANTE A SALA
    @Override
    public void novoParticipante(Participante participante) {
       salaChat.novoParticipante(participante);
    }
    
    //ENVIA MENSAGEM
    @Override
    public void novaMensagem(Participante participante, String mensagem) {
        if(this.validaTamanho(mensagem) && this.validaTags(mensagem)){
            String novaMensagem = this.validaMarcas(mensagem);
            salaChat.novaMensagem(participante, novaMensagem);
        }
    }
    
    //LISTA OS PARTICIPANTES DA SALA
    public void exibeParticipantes(){
        salaChat.exibeParticipantes();
    }
    
    //REGRAS DE NEGÓCIO
    public boolean validaTamanho(String mensagem){
        if(mensagem.length() > 280){
            System.out.println("Sua mensagem ultrapassou o limite de 280 caracteres.");
            return false;
        }
        else
            return true; 
    }
    
    public boolean validaTags(String mensagem){
        if (mensagem.contains("<img") || mensagem.contains("<tabel") || mensagem.contains("<p") || mensagem.contains("<a href")){
            System.out.println("Mensagem removida por conter conteudo nao autorizado");
            return false;
        }
        else
            return true;
    }
    
    public String validaMarcas(String mensagem){
        String novaMensagem = mensagem.replace("Apple", "***").replace("IBM", "***").replace("Microsoft", "***").replace("Microsoft", "***");
        System.out.println(novaMensagem);
        return novaMensagem;
    }
    
    //BOTS
    public void botInformacao(String tipo){
        if(tipo == "hora" || tipo == "temperatura" || tipo == "dolar" || tipo == "bitcoin"){
            salaChat.botInformacao(tipo);
        }
        else{
            System.out.println("Esse participante (BOT) nao existe.");
        }
    }
    
}
