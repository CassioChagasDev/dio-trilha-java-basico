package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo MSNMessenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo MSNMessenger");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando historico da mensagem");
    }
}