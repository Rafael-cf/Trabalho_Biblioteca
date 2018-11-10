import java.util.ArrayList;
import java.util.List;

// // As importações dos pacotes à seguir só tornam-se necessárias se o projeto estiver 
// // segregado nas seguintes estruturas de diretórios: divisao, biblioteca e acesso.
// import divisao.Setor;
// import biblioteca.Aluno;
// import biblioteca.Bibliotecaria;
// import biblioteca.Professor;
// import acesso.Usuario;

public class Principal
{
	public static void main(String[] args)
	{
		Aluno aluno = new Aluno("Roberto Santos", "rsantos", "123456", 00154);
		Bibliotecaria bibliotecaria = new Bibliotecaria("Joana Silva", "jsilva", "654321", "09945789632", new Setor("Biblioteca"));
		Professor professor = new Professor("José Maria Santos", "jmsantos", "132465", "08632176245", new Setor("Departamento de Informática"));
		
		aluno.adicionar(bibliotecaria);
		aluno.adicionar(professor);
		
		if (aluno.autenticar() && bibliotecaria.autenticar() && professor.autenticar())
		{
			List<String> titulosLivros = new ArrayList<String>();
			titulosLivros.add("Java: Como Programar");
			titulosLivros.add("Java Threads");

			aluno.cadastrarReserva(titulosLivros);
			
			aluno.sair();
			bibliotecaria.sair();
			professor.sair();
		}
		else
		{
			System.out.printf("Não foi possível autenticar os uauários no sistema.\n");
		}
	}
}