package projetos.sistema_chat.chat;
import projetos.sistema_chat.participante.Participante;

public interface MediatorChat {
    public void novaMensagem(Participante participante, String mensagem);
    public void novoParticipante(Participante participante);
}
