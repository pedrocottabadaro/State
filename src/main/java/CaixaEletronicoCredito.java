public class CaixaEletronicoCredito implements CaixaEletronicoEstado{

    public CaixaEletronicoCredito() {};
    private static CaixaEletronicoCredito instance = new CaixaEletronicoCredito();
    public static CaixaEletronicoCredito getInstance() {
        return instance;
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
        return "Pin Inserido";
    }

    @Override
    public String inserirCartaoDebito(CaixaEletronico caixaEletronico) {
        return "Cartao ja inserido";
    }

    @Override
    public String inserirCartaoCredito(CaixaEletronico caixaEletronico) {
        return "Cartao ja inserido";
    }

    @Override
    public String pagarConta(CaixaEletronico caixaEletronico) {
        return "Conta paga";
    }

    @Override
    public String transferir(CaixaEletronico caixaEletronico) {
        return "Transferencia feita";
    }

    @Override
    public String getEstado() {
        return "Credito";
    }
}
