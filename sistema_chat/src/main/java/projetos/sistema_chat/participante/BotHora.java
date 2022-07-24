package projetos.sistema_chat.participante;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BotHora {
    public void trazInformacao() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("(BOT) Data e hora: "+dtf.format(LocalDateTime.now()));
    }
}
