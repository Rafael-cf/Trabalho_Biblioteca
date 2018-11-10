import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arraylist;

class Livro
{
	private String titulo;
	private String autor;
	private String editora;
	private static Map<Livro, List<Exemplar>> biblioteca;

	static
	{
		biblioteca = criarBiblioteca();
	}

	public Livro(String titulo)
	{
		this.titulo = titulo;
	}

	public Livro(String titulo, String autor, String editora)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;

	}

	public String getAutor()
	{
		return(autor); 
	}

	public String getEditora()
	{
		return(editora);
	}

	public String getTitulo()
	{
		return(titulo);
	}

	public static Livro obterLivro(String titulo)
	{
		for (Livro livro : biblioteca.keySet())
			if (livro.getTitulo().equals(titulo))
				return (livro);

		return (null);
	}

	public static Exemplar obterExemplar(Livro livro)
	{
		for (Exemplar exemplar : biblioteca.get(livro))
			if (exemplar.getSituacao() == 1)
				return (exemplar);

		return (null);
	}

	private static Map<Livro, List<Exemplar>> criarBiblioteca()
	{
		Map<Livro, List<Exemplar>> biblioteca = new HashMap<Livro, List<Exemplar>>();

		biblioteca.put(new Livro("Java: Como Programar", "Deitel", ""), null);
		biblioteca.put(new Livro("Java Threads", "", ""), null);

		return (biblioteca);
	}

	private static void criarListaExemplares(Map<Livro, List<Exemplar>> biblioteca)
	{
		for ()
	}
}