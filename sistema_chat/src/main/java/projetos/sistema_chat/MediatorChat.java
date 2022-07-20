package projetos.sistema_chat;

public interface MediatorChat {
    public void enviar(Participante participante, String mensagem);
    public void criarParticipante(MediatorChat mediador, String nome);
}
