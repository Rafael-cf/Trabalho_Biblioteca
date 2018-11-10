import java.util.List;
import java.util.ArrayList;

class Emprestimo
{
	private String dataRetirada; 
	private String dataDevolucao;
	private List<Exemplar> exemplares;

	public Emprestimo(Reserva reserva)
	{
		dataRetirada = "18-10-2018";
		dataDevolucao = "30-10-2018";

		exemplares = carregarExemplares(reserva.getLivros());
		for (Exemplar exemplar : exemplares)
			exemplar.setSituacao(0);
			
	}

	public String getDataRetirada()
	{
		return(dataRetirada);
	}

	public String getDataDevolucao()
	{
		return(dataDevolucao);
	}

	public List<Exemplar> getExemplares()
	{
		return(exemplares);
	}

	public List<Exemplar> carregarExemplares(List<Livro> livros)
	{
		List<Exemplar> exemplares = new ArrayList<Exemplar>();

		for (Livro livro : livros)
			exemplares.add(Livro.obterExemplar(livro));

		return (exemplares);
	}
} 