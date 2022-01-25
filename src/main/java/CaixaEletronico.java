public class CaixaEletronico {

    private String nome;
    private CaixaEletronicoEstado estado;

    String sacar(){
        return estado.sacar(this);
    };

    String depositar(){
        return estado.depositar(this);
    };

    String inserirPIN(){
        return estado.inserirPIN(this);
    };

    String inserirCartaoDebito(){
        return estado.inserirCartaoDebito(this);
    };

    String inserirCartaoCredito(){
        return estado.inserirCartaoCredito(this);
    };

    String pagarConta(){
        return estado.pagarConta(this);
    };

    String transferir(){
        return estado.transferir(this);
    };


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CaixaEletronicoEstado getEstado() {
        return estado;
    }

    public void setEstado(CaixaEletronicoEstado estado) {
        this.estado = estado;
    }

    public CaixaEletronico() {
        this.estado = CaixaEletronicoSemCartao.getInstance();
    }

}
