package projetos.sistema_chat.bot;

public interface Bot {
    public boolean validaMensagem(String mensagem);
    public void trazInformacao(String tipo);
}
