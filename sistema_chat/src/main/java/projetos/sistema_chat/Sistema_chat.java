package projetos.sistema_chat;
import projetos.sistema_chat.participante.Participante;
import projetos.sistema_chat.chat.SalaChat;

public class Sistema_chat {

    public static void main(String[] args) {
        //CRIANDO OS PARTICIPANTES
        Participante fulano = new Participante("Fulano");
        Participante sicrano = new Participante("Sicrano");
        Participante beltrano = new Participante("Beltrano");
        SalaChat hardware = new SalaChat("Clube do Hardware");
        
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
        
        
    }
}
