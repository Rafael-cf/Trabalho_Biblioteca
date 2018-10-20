class Aluno extends Usuario implements IReservouLivro 
{
    private int matricula;
    private List<Reserva> reservas;
    private List<ILivroReservado> consumidores;
    
    public Aluno(String nome, String login, String senha, int matricula)
    {
        super(nome, login, senha);
        this.matricula = matricula;
        reservas = new ArrayList<Reserva>();
        consumidores = new ArrayList<ILivroReservado>();
    }
    
    public void cadastrarReserva(List<String> titulos)
    {
        
    }

}