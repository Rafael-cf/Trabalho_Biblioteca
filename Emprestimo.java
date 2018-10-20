import Java.util.Date;

class Emprestimo
{
	private Date dataEmprestimo; 
	private Date dataDevolucao;
	private List<Exemplar> exemplares;

	public Emprestimo(Reserva reserva)
	{
		this.reserva = reserva;
		exemplares = new ArrayList<Exemplares>();
	}

	public Date getDataEmprestimo()
	{
		return(dataEmprestimo);
	}

	public Date getDataDevolucao()
	{
		return(dataDevolucao);
	}

	public List<Exemplares> getExemplares()
	{
		return(exemplares);
	}

	public List<Exemplares> obterExemplares()
	{
		return(exemplares);
	}
} 