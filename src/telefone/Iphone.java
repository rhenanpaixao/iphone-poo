package telefone;

import inteface.AparelhoTelefonico;
import inteface.NavegadorInternet;
import inteface.ReprodutorMusical;

public abstract class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public static void main(String[] args) {
		
	}
    // Implementação dos métodos de ReprodutorMusical
    public void reproduzir() {
        // código para reproduzir música
    }

    @Override
    public void pausar() {
        // código para pausar música
    }

    public void parar() {
        // código para parar música
    }

    // Implementação dos métodos de AparelhoTelefonico
    public void fazerChamada() {
        // código para fazer chamada
    }

    public void atenderChamada() {
        // código para atender chamada
    }

    public void finalizarChamada() {
        // código para finalizar chamada
    }

    // Implementação dos métodos de NavegadorInternet
    public void abrirPagina() {
        // código para abrir página
    }

    @Override
    public void atualizarPagina() {
        // código para atualizar página
    }

    public void fecharPagina() {
        // código para fechar página
    }
}
