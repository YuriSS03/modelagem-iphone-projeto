package Internet;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
	private String url;
	private List<String> historico = new ArrayList<>();
	
	public void exibirPagina (String url) {
		System.out.println("url " + url + " acessada");
		adicionarHistorico(url);		
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		adicionarHistorico(url);
	}	
	
	public void fecharAba() {
		System.out.println("Aba fechada");
		adicionarHistorico(url);
	}

	public void atualizarPagina() {
		System.out.println("Pagina atualizada!");
		adicionarHistorico(url);
	}

    public void adicionarHistorico(String url) {
        historico.add(url);
    }

    public void gethistoricoDeNavegacao(){
        for (String url : historico){
            System.out.println(url);
        }
    }
}
