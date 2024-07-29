package telefone;

import inteface.AparelhoTelefonico;
import inteface.NavegadorInternet;
import inteface.ReprodutorMusical;

public abstract class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public static void main(String[] args) {
		
	}
    // Implementa��o dos m�todos de ReprodutorMusical
    public void reproduzir() {
        // c�digo para reproduzir m�sica
    }

    @Override
    public void pausar() {
        // c�digo para pausar m�sica
    }

    public void parar() {
        // c�digo para parar m�sica
    }

    // Implementa��o dos m�todos de AparelhoTelefonico
    public void fazerChamada() {
        // c�digo para fazer chamada
    }

    public void atenderChamada() {
        // c�digo para atender chamada
    }

    public void finalizarChamada() {
        // c�digo para finalizar chamada
    }

    // Implementa��o dos m�todos de NavegadorInternet
    public void abrirPagina() {
        // c�digo para abrir p�gina
    }

    @Override
    public void atualizarPagina() {
        // c�digo para atualizar p�gina
    }

    public void fecharPagina() {
        // c�digo para fechar p�gina
    }
}
