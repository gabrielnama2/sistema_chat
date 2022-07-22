package projetos.sistema_chat.chat;
import java.util.ArrayList;
import projetos.sistema_chat.participante.Participante;

public class SalaChatProxy implements MediatorChat{
    private String nomeSala;
    private SalaChat salaChat;
    public ArrayList<Participante> participantes = new ArrayList<Participante>();
    
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
        if(this.validaMensagem(mensagem)){
            salaChat.novaMensagem(participante, mensagem);
        }
    }
    
    //LISTA OS PARTICIPANTES DA SALA
    public void exibeParticipantes(){
        salaChat.exibeParticipantes();
    }
    
    //REGRAS DE NEGÓCIO
    public boolean validaMensagem(String mensagem){
        if(mensagem.length() > 280){
            System.out.println("Sua mensagem ultrapassou o limite de 280 caracteres.");
            return false;
        }
        else{
            return true;
        }    
    }
    public String validaMarcas(String mensagem){
        String texto = "Hoje o Sol está forte";
	String procurarPor = "sol";
	System.out.println(texto.toLowerCase().contains(procurarPor.toLowerCase()));
        return mensagem;
    }
    
}
