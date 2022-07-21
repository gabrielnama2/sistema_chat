package projetos.sistema_chat;
import java.util.ArrayList;

public class SalaChat implements MediatorChat{
    private String nomeSala;
    //LISTA DE PARTICIPANTES DA SALA
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
    public void enviar(Participante participante, String mensagem) {
        System.out.println(participante.getNome() + ": " + mensagem);
    }
    
    //LISTA OS PARTICIPANTES DA SALA
    public void exibeParticipantes(){
        System.out.println("\nParticipantes de "+ this.nomeSala +": " + participantes.toString() + "\n");
    }
}
