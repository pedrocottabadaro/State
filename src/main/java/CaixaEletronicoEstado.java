public interface CaixaEletronicoEstado {

    String sacar(CaixaEletronico caixaEletronico);

    String depositar(CaixaEletronico caixaEletronico);

    String inserirPIN(CaixaEletronico caixaEletronico);

    String inserirCartaoDebito(CaixaEletronico caixaEletronico);

    String inserirCartaoCredito(CaixaEletronico caixaEletronico);

    String pagarConta(CaixaEletronico caixaEletronico);

    String transferir(CaixaEletronico caixaEletronico);

    String getEstado();
}
