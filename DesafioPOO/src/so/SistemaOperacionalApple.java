package so;

import navegador.NavegadorIternet;
import reprodutormusical.ReprodutorMusical;
import telefone.ApareloTelefonico;

public class SistemaOperacionalApple implements ApareloTelefonico, ReprodutorMusical, NavegadorIternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página via Iphone!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada ao navegador do Iphone!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no navegador do Iphone!");
    }

    @Override
    public void tocar() {
        System.out.println("Musica tocando no Iphone!");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada no Iphone!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada no Iphone!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligação feita via Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida via Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado via Iphone");
    }

}
