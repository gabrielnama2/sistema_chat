package projetos.sistema_chat;

public interface Participante {
    public String getNome();
    public void enviar(String mensagem);
    public void receber(String mensagem, Participante participante);
}