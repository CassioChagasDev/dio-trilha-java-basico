package recursos.reprodutor;

public class Spotify implements ReprodutorMusical{

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A musica " + musica + " foi selecionada!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }
    
}
