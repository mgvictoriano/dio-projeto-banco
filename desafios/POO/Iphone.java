import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        // Implementação do método tocar
    }

    @Override
    public void pausar() {
        // Implementação do método pausar
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação do método selecionarMusica
    }

    @Override
    public void ligar(String numero) {
        // Implementação do método ligar
    }

    @Override
    public void atender() {
        // Implementação do método atender
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação do método iniciarCorreioVoz
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação do método exibirPagina
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Implementação do método adicionarNovaAba
    }

    @Override
    public void atualizarPagina() {
        // Implementação do método atualizarPagina
    }
    
}
