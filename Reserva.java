import java.util.List;
import java.util.ArrayList;

class Reserva
{
	private String dataReserva;
	private List<Livro> livros;

	public Reserva(String dataReserva, List<String> titulos)
	{
		this.dataReserva = dataReserva;
		this.livros = carregarLivro(titulos);
	}

	public String getDataReserva()
	{
		return(dataReserva);
	}

	public List<Livro> getLivros()
	{
		return(livros);
	}

	private List<Livro> carregarLivro(List<String> titulos)
	{
		List<Livro> livros = new ArrayList<Livro>();

		for (String titulo : titulos)
			livros.add(Livro.obterLivro(titulo));

		return(livros);
	}
}