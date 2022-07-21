package projetos.sistema_chat;

public interface MediatorChat {
    public void enviar(Participante participante, String mensagem);
    public void novoParticipante(Participante participante);
}
