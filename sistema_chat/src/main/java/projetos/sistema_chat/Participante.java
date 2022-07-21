package projetos.sistema_chat;

public class Participante {
    private String nome;
    
    public Participante(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    @Override
    public String toString(){
        return this.nome;
    }
}
