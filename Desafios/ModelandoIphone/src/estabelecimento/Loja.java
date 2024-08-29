package estabelecimento;

import recursos.dispositivo.*;
import recursos.internet.*;
import recursos.recursosTelefonicos.*;
import recursos.reprodutor.*;

public class Loja {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        NavegadorInternet nav = iphone;
        AparelhoTelefonico tel= iphone;
        ReprodutorMusical musica= iphone;

        
        nav.adicionarNovaAba();
        nav.atualizarPagina();
        nav.exibirPaginaUrl("https://youtube.com");

        System.err.println("\n");

        tel.ligar("19 98913-8534");
        tel.atender();
        tel.iniciarCorreioVoz();

        System.err.println("\n");

        musica.selecionarMusica("Humble - Kendrick Lamar");
        musica.tocar();
        musica.pausar();
        
    }
}
