import java.util.List;
import java.util.ArrayList;

class Reserva
{
	private String dataReserva;
	private String dataRetirada;
	private List<Livro> livros;

	public Reserva(String dataReserva, String dataRetirada, List<String> titulos)
	{
		this.dataReserva = dataReserva;
		this.dataRetirada = dataRetirada;
		this.livros = obterLivro(titulos);
	}

	public String getDataReserva()
	{
		return(dataReserva);
	}

	public String getDataRetirada()
	{
		return(dataRetirada);
	}

	public List<Livro> getLivros()
	{
		return(livros);
	}

	public List<Livro> obterLivro(List<String> titulos)
	{
		List<Livro> livros = new ArrayList<Livro>();
		for (String titulo : titulos)
			livros.add(Livro.obterLivro(titulo));

		return(livros);
	}
}