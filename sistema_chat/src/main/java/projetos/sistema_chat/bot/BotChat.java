package projetos.sistema_chat.bot;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BotChat implements Bot{
    @Override
    public boolean validaMensagem(String mensagem){
        if(mensagem.length() > 280){
            System.out.println("Sua mensagem ultrapassou o limite de 280 caracteres.");
            return false;
        }
        else{
            return true;
        }    
    }
    /*
    @Override
    public String validaMarcas(String mensagem){
        if(){
            //laço para procurar os textos das marcas
        }
        else{
            return mensagem;
        }    
    }
    */
    
    @Override
    public void trazInformacao(String tipo) {
        if(tipo == "data"){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.println("(BOT) Data e hora: "+dtf.format(LocalDateTime.now()));
        }
        if(tipo == "temperatura"){
            System.out.println("(BOT) Temperatura: 27ºC");
        }
        if(tipo == "dolar"){
            System.out.println("(BOT) Dolar: 5,50 R$");
        }
        if(tipo == "bitcoin"){
            System.out.println("(BOT) Bitcoin: 126.867,32 R$");
        }
    }
    
}
