package Projeto;

public class Influenciador extends CriadorConteudo implements Patrocinado{
    private String nicho;

    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }

    public void fazerParceria() {
        System.out.println("Parceria feita.");
    }

    public Influenciador(Long id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    @Override
    public String toString() {
        return "Influenciador{" +
                "nicho='" + nicho + '\'' +
                ", descricao='" + descricao + '\'' +
                ", seguidores=" + seguidores +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public void receberPatrocinio() {

    }

    @Override
    public void encerrarPatrocinio() {

    }
}
