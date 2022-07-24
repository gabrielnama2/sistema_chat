package projetos.sistema_chat;
import projetos.sistema_chat.participante.Participante;
import projetos.sistema_chat.chat.SalaChatProxy;

public class Sistema_chat {

    public static void main(String[] args) {
        
        //CRIANDO OS PARTICIPANTES
        Participante fulano = new Participante("Fulano");
        Participante sicrano = new Participante("Sicrano");
        Participante beltrano = new Participante("Beltrano");
        SalaChatProxy hardware = new SalaChatProxy("Clube do Hardware");
        
        //ADICIONANDO PARTICIPANTES A SALA DE BATE PAPO
        hardware.novoParticipante(fulano);
        hardware.novoParticipante(sicrano);
        hardware.novoParticipante(beltrano);
        hardware.exibeParticipantes();
        
        //ENVIANDO MENSAGENS NO CHAT DO BATE PAPO
        hardware.novaMensagem(fulano, "Salve salve familia");
        hardware.novaMensagem(fulano, "Preciso de um notebook para trabalhar");
        hardware.novaMensagem(fulano, "Alguma recomendacao?");
        hardware.novaMensagem(sicrano, "Boa noite, uso um DELL excelente!");
        hardware.novaMensagem(beltrano, "Prefiro meu MacBook");
        hardware.novaMensagem(sicrano, "Apple so tem preco");
        hardware.novaMensagem(sicrano, "Microsoft e bem melhor");
        hardware.novaMensagem(sicrano, "Windows 10 domina!!");
        hardware.novaMensagem(fulano, "Eu gosto mais do Linux kkk");
        hardware.novaMensagem(fulano, "<img");
        hardware.novaMensagem(fulano, "Em Java os operadores lógicos utilizados são E (representado por &&) e OU (representado por ||). "
                + "OBS. O símbolo do OU (I) corresponde a barra vertical ou pipe do teclado, caractere ASCII 124. Quando usamos os operadores "
                + "duplos (&& ou ||) o Java não continua as operações se o resultado já for conhecido.");
        //INFORMAÇÕES DOS BOTS
        hardware.botInformacao("hora");
        hardware.botInformacao("temperatura");
        hardware.botInformacao("dolar");
        hardware.botInformacao("bitcoin");
        
    }
}
