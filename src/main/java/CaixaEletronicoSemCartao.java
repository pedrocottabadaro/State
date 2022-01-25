public class CaixaEletronicoSemCartao implements CaixaEletronicoEstado{
    public CaixaEletronicoSemCartao() {
    }

    private static CaixaEletronicoSemCartao instance = new CaixaEletronicoSemCartao();
    public static CaixaEletronicoSemCartao getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Sem Cartao";
    }
    @Override
    public String sacar(CaixaEletronico caixaEletronico) {
        return "Nao pode sacar";
    }

    @Override
    public String depositar(CaixaEletronico caixaEletronico) {
        return "Nao pode depositar";
    }

    @Override
    public String inserirPIN(CaixaEletronico caixaEletronico) {
        return "Nao pode inserir pin";
    }

    @Override
    public String inserirCartaoDebito(CaixaEletronico caixaEletronico) {
        return "Cartao inserido";
    }

    @Override
    public String inserirCartaoCredito(CaixaEletronico caixaEletronico) {
        return "Cartao inserido";
    }

    @Override
    public String pagarConta(CaixaEletronico caixaEletronico) {
        return "Conta paga";
    }

    @Override
    public String transferir(CaixaEletronico caixaEletronico) {
        return "Nao foi possivel transferir";
    }
}
