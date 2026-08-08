package Projeto;

import java.util.Date;

public class EmpresaVerificada extends Empresa {
    private Date dataVerificacao;

    public EmpresaVerificada(String cnpj, String razaoSocial, Date dataVerificacao) {
        super(cnpj, razaoSocial);
        this.dataVerificacao = dataVerificacao;
    }

    public void selarVerificacao() {
        System.out.println("Empresa voerificada.");
    }

    @Override
    public String toString() {
        return "EmpresaVerificada{" +
                "dataVerificacao=" + dataVerificacao +
                ", cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
