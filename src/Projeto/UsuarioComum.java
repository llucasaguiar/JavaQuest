package Projeto;

import java.time.LocalDate;

public class UsuarioComum extends Usuario {

    private LocalDate dataCadastro;

    public UsuarioComum(Long id, String nome, String email, String senha,
                        LocalDate dataCadastro) {

        super(id, nome, email, senha);
        this.dataCadastro = dataCadastro;
    }

    public void visualizarConteudo() {
        System.out.println(nome + " está visualizando conteúdo.");
    }
}

