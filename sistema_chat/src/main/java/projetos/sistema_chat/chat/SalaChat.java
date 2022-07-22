package projetos.sistema_chat.chat;
import java.util.ArrayList;
import projetos.sistema_chat.participante.Participante;

public class SalaChat implements MediatorChat{
    private String nomeSala;
    public ArrayList<Participante> participantes = new ArrayList<Participante>();

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
    public String validaMarcas(String mensagem){
        String frase = "Hoje o Sol está forte Sol."; 
        if (frase.contains("Sol")){
            System.out.println("Contém"); 
        }
        else{ 
            System.out.println("Não contém"); 
        }
        return mensagem;
    }

}
