package recursos.internet;

public class Google implements NavegadorInternet {

    @Override
    public void exibirPaginaUrl(String url) {
        System.out.println("Google - Exibindo pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Google!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no Google...");
    }
    
}
