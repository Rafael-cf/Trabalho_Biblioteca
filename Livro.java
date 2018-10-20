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
		return();
	}

	public static Exemplar obterLivro(Livro livro)
	{
		return();
	}

	private static Map<Livro, List<Exemplar>> criarBiblioteca()
	{
		return();
	}

	private static void criarBiblioteca(Map<Livro, List<Exemplar>> biblioteca)
	{
		
	}
}