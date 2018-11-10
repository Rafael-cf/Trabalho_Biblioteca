import java.util.List;
import java.util.ArrayList;

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
        reservas.add(new Reserva("16-10-2018", titulos));
    }

    public void adicionar(ILivroReservado consumidor)
    {
        consumidores.add(consumidor);
    }

    public void notificar(Reserva reserva)
    {
        for (ILivroReservado consumidor : consumidores)
            consumidor.ocorreuReserva(reserva);
    }

}