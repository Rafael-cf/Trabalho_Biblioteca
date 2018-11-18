import java.util.List;
import java.util.ArrayList;

class Bibliotecario extends Funcionario implements ILivroReservado
{
    private List<Emprestimo> emprestimos;
    
    public Bibliotecario(String nome, String login, String senha, String cpf, Setor lotacao)
    {
        super(nome, login, senha, lotacao, cpf);
        emprestimos = new ArrayList<Emprestimo>();
    }

    public void cadastrarEmprestimo(Reserva reserva)
    {
        try
        {
            emprestimos.add(new Emprestimo(reserva));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    private void imprimirComprovanteUltimoEmprestimo()
    {
        Emprestimo ultimoEmprestimo = emprestimos.get(emprestimos.size() - 1);

        System.out.println("--- Evento ocorrido em Bibliotecario ---");
        System.out.println("Data Retirada: " + ultimoEmprestimo.getDataRetirada());
        System.out.println("Data Devolução: " + ultimoEmprestimo.getDataDevolucao());
        
        for (Exemplar exemplar : ultimoEmprestimo.getExemplares())
        {
            System.out.println("Livro: " + exemplar.getLivro().getTitulo());
            System.out.println("Autor: " + exemplar.getLivro().getAutor());
            System.out.println("Editora: " + exemplar.getLivro().getEditora());
            System.out.println("Cod Exemplar: " + exemplar.getCodigo());
            System.out.println("Situação: " + exemplar.getSituacao());
        }

        System.out.println();
    }

    public void ocorreuReserva(Reserva reserva)
    {
        cadastrarEmprestimo(reserva);
        imprimirComprovanteUltimoEmprestimo();
    }
}
