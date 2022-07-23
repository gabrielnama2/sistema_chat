package projetos.sistema_chat.chat;
import java.util.ArrayList;
import projetos.sistema_chat.participante.BotBitcoin;
import projetos.sistema_chat.participante.BotDolar;
import projetos.sistema_chat.participante.BotHora;
import projetos.sistema_chat.participante.BotTemperatura;
import projetos.sistema_chat.participante.Participante;

public class SalaChat implements MediatorChat{
    private String nomeSala;
    public ArrayList<Participante> participantes = new ArrayList<Participante>();
    BotHora botHora = new BotHora();
    BotTemperatura botTemperatura = new BotTemperatura();
    BotDolar botDolar = new BotDolar();
    BotBitcoin botBitcoin = new BotBitcoin();

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
        participante.enviarMensagem(mensagem);
    }
    
    //LISTA OS PARTICIPANTES DA SALA
    public void exibeParticipantes(){
        System.out.println("\nParticipantes de "+ this.nomeSala +": " + participantes.toString() + "\n");
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
        if(tipo == "hora"){
            botHora.trazInformacao();
        }
        if(tipo == "temperatura"){
            botTemperatura.trazInformacao();
        }
        if(tipo == "dolar"){
            botDolar.trazInformacao();
        }
        if(tipo == "bitcoin"){
            botBitcoin.trazInformacao();
        }
    }

}
