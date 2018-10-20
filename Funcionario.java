abstract class Funcionario extends Usuario
{
    protected String cpf;
    protected int pis;
    private Setor lotacao;
    
    public Funcionario(String nome, String login, String senha, Setor lotacao)
    {
        super(nome, login, senha);
        this.lotacao = lotacao;
    }

    public Funcionario(String nome, String login, String senha, Setor lotacao, String cpf)
    {
        this(nome, login, senha, lotacao);
        this.cpf = cpf;
    }

    public Funcionario(String nome, String login, String senha, Setor lotacao, String cpf, int pis)
    {
        this(nome, login, senha, lotacao, cpf);
        this.pis = pis;
    }

    public Setor getLotacao()
    {
        return lotacao;
    }

    public void setLotacao(Setor lotacao)
    {
        this.lotacao = lotacao;
    }
}