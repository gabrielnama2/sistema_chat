package projetos.sistema_chat;

public class ParticipanteChat implements Participante{
    private String nome;
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void enviar(String mensagem) {
        
    }

    @Override
    public void receber(String mensagem, Participante participante) {
        
    }
    
}
