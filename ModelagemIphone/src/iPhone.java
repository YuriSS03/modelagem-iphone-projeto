import Internet.NavegadorInternet;
import Media.Musica;
import Media.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class iPhone {
	public static void main(String[] args) {
		ReprodutorMusical reprodutor = new ReprodutorMusical();
        Musica musica = new Musica("A terra clama", "Kaleb e Josh", 231);
        reprodutor.reproduzir(musica);
        reprodutor.adicionarNaListaDeReproducao(musica);
        reprodutor.pausar();
        reprodutor.avancar();
        musica = new Musica("Ele me ama", "Jose", 401);
        reprodutor.reproduzir(musica);
        reprodutor.adicionarNaListaDeReproducao(musica);
        reprodutor.pausar();
        System.out.println();

		
		AparelhoTelefonico iphone = new AparelhoTelefonico();
        String numeroDeTelefone = "11973849007";
        iphone.discar(numeroDeTelefone);
        iphone.atender();
        numeroDeTelefone = "1192983998";
        iphone.discar(numeroDeTelefone);
        iphone.atender();
        System.out.println("Historico de chamadas:");
        iphone.getHistoricoDeChamadas();
        iphone.adicionarContato(null);
        iphone.iniciarCorreioDeVoz();
        iphone.pararCorreioDeVoz();
        System.out.println();	
		
		
		NavegadorInternet internet = new NavegadorInternet();
		internet.exibirPagina("https://www.dio.me/");
        System.out.println("Historico de Navegacao");
        internet.gethistoricoDeNavegacao();
        internet.exibirPagina("https://www.google.com.br/");
        System.out.println("Historico de Navegacao");
        internet.gethistoricoDeNavegacao();
	}
}
