package apps;
/**
 * ServicoMensagemInstantanea
 */
public abstract class ServicoMensagemInstantanea {
   
    public abstract void enviarMensagem();
    
    public abstract void receberMensagem();

    protected abstract void salvarHistoricoMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}