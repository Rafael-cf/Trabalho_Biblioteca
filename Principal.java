import java.util.ArrayList;
import java.util.List;

// As importações dos pacotes à seguir só tornam-se necessárias se o projeto estiver 
// segregado nas seguintes estruturas de diretórios: divisao, biblioteca e acesso.
import divisao.Setor;
import biblioteca.Aluno;
import biblioteca.Bibliotecaria;
import biblioteca.Professor;
import acesso.Usuario;

public class Principal
{
	public static void main(String[] args)
	{
		Aluno aluno = new Aluno("Roberto Santos", "rsantos", "123456", 00154);
		Bibliotecaria bibliotecaria = new Bibliotecaria("Joana Silva", "jsilva", "654321", "09945789632", new Setor("Biblioteca"));
		Professor professor = new Professor("José Maria Santos", "jmsantos", "132465", "08632176245", new Setor("Departamento de Informática"));
		
		aluno.Adicionar(bibliotecaria);
		aluno.Adicionar(professor);
		
		if (aluno.Autenticar() && bibliotecaria.Autenticar() && professor.Autenticar())
		{
			List<String> titulos = new ArrayList<String>();
			titulos.add("Java: Como Programar");
			titulos.add("Java Threads");

			aluno.CadastrarReserva(titulos);
			bibliotecaria.ImprimirComprovanteUltimoEmprestimo();
		}
		else
		{
			System.out.printf("Não foi possível autenticar os uauários no sistema.\n");
		}
	}
}