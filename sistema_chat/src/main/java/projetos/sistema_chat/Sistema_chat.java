package projetos.sistema_chat;

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
        hardware.enviar(fulano, "Salve salve familia");
        hardware.enviar(fulano, "Preciso de um notebook para trabalhar");
        hardware.enviar(fulano, "Alguma recomendacao?");
        hardware.enviar(sicrano, "Boa noite, uso um DELL excelente!");
        hardware.enviar(beltrano, "Prefiro meu MacBook");
        hardware.enviar(sicrano, "Apple so tem preco");
        hardware.enviar(sicrano, "Microsoft e bem melhor");
        hardware.enviar(sicrano, "Windows 10 domina!!");
        hardware.enviar(fulano, "Eu gosto mais do Linux kkk");
    }
}
