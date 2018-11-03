import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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
        emprestimos.add(new Emprestimo(reserva));
    }

    public void ImprimirComprovanteUltimoEmprestimo()
    {
        String mensagem = "Ultimo emprestimo: ";
        JOptionPane.showMessageDialog(null, "");
    }
}
