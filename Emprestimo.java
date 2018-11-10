import java.util.List;
import java.util.ArrayList;

class Emprestimo
{
	private String dataEmprestimo; 
	private String dataDevolucao;
	private List<Exemplar> exemplares;

	public Emprestimo(Reserva reserva)
	{
		dataEmprestimo = reserva.getDataRetirada();
		dataDevolucao = "30-10-2018";

		exemplares = obterExemplares(reserva.getLivros());
		for (Exemplar exemplar : exemplares)
			exemplar.setSituacao(0);
			
	}

	public String getDataEmprestimo()
	{
		return(dataEmprestimo);
	}

	public String getDataDevolucao()
	{
		return(dataDevolucao);
	}

	public List<Exemplares> getExemplares()
	{
		return(exemplares);
	}

	public List<Exemplares> obterExemplares(List<Livro> livros)
	{
		List<Exemplar> exemplares = new ArrayList<Exemplares>();

		for (Livro livro : livros)
			exemplares.add(Livro.getExemplar(livro));

		return (exemplares);
	}
} 