package projetos.sistema_chat.bot;

public class BotProxy implements Bot{
    BotChat bot = new BotChat();
    
    @Override
    public void trazInformacao(String tipo) {
        bot.trazInformacao(tipo);
    }

    public boolean validaMensagem(String mensagem) {
        return bot.validaMensagem(mensagem);
    }
}