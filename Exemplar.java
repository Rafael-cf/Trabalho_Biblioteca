import java.util.Date;

class Exeḿplar
{
	private int codigo;
	private Date dataAquisicao;
	private int situacao;
	private Livro livro;

	public Exemplar(Livro livro)
	{
		if (livro == null)
			throw new NullPointerException("Livro não pode ser null");

		this.livro = livro; 
	}

	public Livro getLivro()
	{
		return (livro);
	}

	public void setSituacao(int situacao)
	{
		this.situacao = situacao;
	} 
}