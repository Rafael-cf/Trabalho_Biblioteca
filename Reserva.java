import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Reserva
{
	private Date dataReserva;
	private Date dataRetirada;
	private List<Livro> livros;

	public Reserva(String dataReserva, String dataRetirada, List<String> titulos)
	{
		this.dataReserva = dataReserva;
		this.dataRetirada = dataRetirada;
		this.livros = new ArrayList<>();
	}

	public Date getDataReserva()
	{
		return(getDataReserva);
	}

	public List<Livro> getLivro()
	{
		return(livros);
	}

	public List<Livro> obterLivro(List<String> livros)
	{
		return(livros);
	}
}