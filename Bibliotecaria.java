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

    public void cadastrarEmprestimo(Reserva reserva)
    {
        emprestimos.add(new Emprestimo(reserva));
    }

    public void imprimirComprovanteUltimoEmprestimo()
    {
        Emprestimo ultimoEmprestimo = emprestimos.get(emprestimos.size() - 1);

        String mensagem = "Último emprestimo: \n\n";
        mensagem += "Data do empréstimo: " + ultimoEmprestimo.getDataEmprestimo() + "\n";
        mensagem += "Data da devolução: " + ultimoEmprestimo.getDataDevolucao() + "\n\n";
        
        for (Exemplar exemplar : ultimoEmprestimo.getExemplares())
        {
            mensagem += "Título: " + exemplar.getLivro().getTitulo() + "\n";
            mensagem += "Autor: " + exemplar.getLivro().getAutor() + "\n";
            mensagem += "Editora: " + exemplar.getLivro().getEditor() + "\n\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void ocorreuReserva(Reserva reserva)
    {
        cadastrarEmprestimo(reserva);
        imprimirComprovanteUltimoEmprestimo();
    }
}
