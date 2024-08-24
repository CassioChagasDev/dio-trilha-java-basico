package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Facebook Messenger");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando historico da mensagem");
    }
}
