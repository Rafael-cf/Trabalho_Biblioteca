import java.util.List;
import java.util.ArrayList;

class Bibliotecaria extends Funcionario implements IlivroReservado
{
    private List<Emprestimo> emprestimos;
    
    public Bibliotecaria(String nome, String login, String senha, String cpf, Setor lotacao)
    {
        super(nome, login, senha, lotacao, cpf);
        emprestimos = new ArrayList<Emprestimo>();
    }

    public void CadastrarEmprestimo(Reserva reserva)
    {

    }

    public void ImprimirComprovanteUltimoEmprestimo()
    {
        
    }
}
