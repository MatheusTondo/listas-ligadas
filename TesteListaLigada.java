public class TesteListaLigada {
 public static void main(String[] args) {
	 ListaLigada lista = new ListaLigada();
	 
	 lista.AdicionaNoComeco("mauricio");
	 lista.AdicionaNoComeco("paulo");
	 lista.AdicionaNoComeco("guilherme");
	 System.out.println(lista);
	 
	 lista.AdicionaNoComeco("Marcelo");
	 System.out.println(lista);
	 
	 lista.adiciona(2, "Gabriel");
	 System.out.println(lista);
	 
	 Object x = lista.pega(2);
	 System.out.println(x);
	 System.out.println(lista.tamanho());
	 
	 lista.removeDoFim();
	 System.out.println(lista);
	 
	 lista.AdicionaNoComeco("Jose");
	 lista.AdicionaNoComeco("Andre");
	 System.out.println(lista);
	 
	 lista.remove(2);
	 System.out.println(lista);
	 
	 System.out.println(lista.contem("Mauricio"));
	 System.out.println(lista.contem("Danilo"));
	 
	 
 }
 
}
