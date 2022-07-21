package projetos.sistema_chat;
import java.util.ArrayList;

public class ParticipanteChat extends Participante{
    public ArrayList<Participante> participantes = new ArrayList<>();

    public ParticipanteChat(String nome) {
        super(nome);
    }
    
    public void add(Participante participante){
        participantes.add(participante);
    }
}
