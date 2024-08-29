package recursos.dispositivo;

import recursos.internet.Google;
import recursos.internet.NavegadorInternet;
import recursos.recursosTelefonicos.AparelhoTelefonico;
import recursos.recursosTelefonicos.Telefone;
import recursos.reprodutor.ReprodutorMusical;
import recursos.reprodutor.Spotify;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{

    Spotify spo = new Spotify();
    Telefone tel = new Telefone();
    Google google = new Google();

    @Override
    public void selecionarMusica(String musica) {
        spo.selecionarMusica(musica);
    }

    @Override
    public void tocar() {
        spo.tocar();
    }

    @Override
    public void pausar() {
        spo.pausar();
    }

    @Override
    public void ligar(String numero) {
        tel.ligar(numero);
    }

    @Override
    public void atender() {
        tel.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        tel.iniciarCorreioVoz();
    }

    @Override
    public void exibirPaginaUrl(String url) {
        google.exibirPaginaUrl(url);
    }

    @Override
    public void adicionarNovaAba() {
        google.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        google.atualizarPagina();
    }
    
    
    
}