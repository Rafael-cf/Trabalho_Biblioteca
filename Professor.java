class Professor extends Funcionario implements ILivroReservado
{
    public Professor(String nome, String login, String senha, String cpf, Setor lotacao)
    {
        super(nome, login, senha, lotacao, cpf);
    }

    public void InformarReservaAluno(Reserva reserva)
    {
        
    }

    public void OcorreuReserva(Reserva reserva)
    {
        
    }
}