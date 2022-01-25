import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaixaEletronicoTest {


    CaixaEletronico caixa;
    @BeforeEach
    public void setUp() {
        caixa = new CaixaEletronico();
    }

    /////////Cartao Debito

    @Test
    public void naoDeveInserirCartaoDebito() {
        caixa.setEstado(CaixaEletronicoDebito
                .getInstance());
        assertEquals("Cartao ja inserido", caixa.inserirCartaoDebito());
    }
    @Test
    public void naoDeveInserirCartaoDedito() {
        caixa.setEstado(CaixaEletronicoDebito
                .getInstance());
        assertEquals("Cartao ja inserido", caixa.inserirCartaoCredito());
    }
    @Test
    public void deveSacarDebito() {
        caixa.setEstado(CaixaEletronicoDebito
                .getInstance());
        assertEquals("Saque feito", caixa.sacar());
    }
    @Test
    public void deveInserirPINDebito() {
        caixa.setEstado(CaixaEletronicoDebito
                .getInstance());
        assertEquals("Pin inserido", caixa.inserirPIN());
    }
    @Test
    public void devePagarContaDebito() {
        caixa.setEstado(CaixaEletronicoDebito
                .getInstance());
        assertEquals("Conta paga", caixa.pagarConta());
    }
    @Test
    public void deveTransferirDebito() {
        caixa.setEstado(CaixaEletronicoDebito
                .getInstance());
        assertEquals("Transferencia feita", caixa.transferir());
    }
    @Test
    public void deveDepositarDebito() {
        caixa.setEstado(CaixaEletronicoDebito
                .getInstance());
        assertEquals("Depositado", caixa.depositar());
    }


    ////Cartao Credito

    @Test
    public void naoDeveInserirCartaoCreditoCredito() {
        caixa.setEstado(CaixaEletronicoCredito
                .getInstance());
        assertEquals("Cartao ja inserido", caixa.inserirCartaoDebito());
    }
    @Test
    public void naoDeveInserirCartaoDebitoCredito() {
        caixa.setEstado(CaixaEletronicoCredito
                .getInstance());
        assertEquals("Cartao ja inserido", caixa.inserirCartaoCredito());
    }
    @Test
    public void naoDeveSacarCredito() {
        caixa.setEstado(CaixaEletronicoCredito
                .getInstance());
        assertEquals("Nao pode sacar", caixa.sacar());
    }
    @Test
    public void deveInserirPINCredito() {
        caixa.setEstado(CaixaEletronicoCredito
                .getInstance());
        assertEquals("Pin Inserido", caixa.inserirPIN());
    }
    @Test
    public void devePagarContaCredito() {
        caixa.setEstado(CaixaEletronicoCredito
                .getInstance());
        assertEquals("Conta paga", caixa.pagarConta());
    }
    @Test
    public void deveTransferirCredito() {
        caixa.setEstado(CaixaEletronicoCredito
                .getInstance());
        assertEquals("Transferencia feita", caixa.transferir());
    }
    @Test
    public void naoDeveDepositarCredito() {
        caixa.setEstado(CaixaEletronicoCredito
                .getInstance());
        assertEquals("Nao pode depositar", caixa.depositar());
    }

    ////Sem Cartao

    @Test
    public void deveInserirCartaoDebitoSemCartao() {
        caixa.setEstado(CaixaEletronicoSemCartao
                .getInstance());
        assertEquals("Cartao inserido", caixa.inserirCartaoDebito());
    }
    @Test
    public void deveInserirCartaoCreditoSemCartao() {
        caixa.setEstado(CaixaEletronicoSemCartao
                .getInstance());
        assertEquals("Cartao inserido", caixa.inserirCartaoCredito());
    }
    @Test
    public void naoDeveSacarSemCartao() {
        caixa.setEstado(CaixaEletronicoSemCartao
                .getInstance());
        assertEquals("Nao pode sacar", caixa.sacar());
    }
    @Test
    public void naoDeveInserirPINSemCartao() {
        caixa.setEstado(CaixaEletronicoSemCartao
                .getInstance());
        assertEquals("Nao pode inserir pin", caixa.inserirPIN());
    }
    @Test
    public void devePagarContaSemCartao() {
        caixa.setEstado(CaixaEletronicoSemCartao
                .getInstance());
        assertEquals("Conta paga", caixa.pagarConta());
    }
    @Test
    public void naoDeveTransferirSemCartao() {
        caixa.setEstado(CaixaEletronicoSemCartao
                .getInstance());
        assertEquals("Nao foi possivel transferir", caixa.transferir());
    }
    @Test
    public void naoDeveDepositarSemCartao() {
        caixa.setEstado(CaixaEletronicoSemCartao
                .getInstance());
        assertEquals("Nao pode depositar", caixa.depositar());
    }






}