public class CaixaEletronicoDebito implements CaixaEletronicoEstado{
    public CaixaEletronicoDebito() {
    }

    private static CaixaEletronicoDebito instance = new CaixaEletronicoDebito();
    public static CaixaEletronicoDebito getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Debito";
    }
    @Override
    public String sacar(CaixaEletronico caixaEletronico) {
        return "Saque feito";
    }

    @Override
    public String depositar(CaixaEletronico caixaEletronico) {
        return "Depositado";
    }

    @Override
    public String inserirPIN(CaixaEletronico caixaEletronico) {
        return "Pin inserido";
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
}
