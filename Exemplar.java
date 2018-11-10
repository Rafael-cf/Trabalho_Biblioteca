import java.util.Date;
import java.util.Random;

class Exemplar
{
	private int codigo;
	private String dataAquisicao;
	private int situacao;
	private Livro livro;

	public Exemplar(Livro livro)
	{
		if (livro == null)
			throw new NullPointerException("Livro não pode ser null");

		Random aleatorio = new Random();

		this.codigo = aleatorio.nextInt(10000);
		this.dataAquisicao = "15-2-2017";
		this.situacao = 1;
		this.livro = livro; 
	}

	public Livro getLivro()
	{
		return (livro);
	}

	public int getCodigo()
	{
		return (codigo);
	}

	public String getDataAquisicao()
	{
		return (dataAquisicao);
	}

	public int getSituacao()
	{
		return (situacao);
	}

	public void setSituacao(int situacao)
	{
		this.situacao = situacao;
	} 
}