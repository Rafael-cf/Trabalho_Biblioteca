class Professor extends Funcionario implements ILivroReservado
{
    public Professor(String nome, String login, String senha, String cpf, Setor lotacao)
    {
        super(nome, login, senha, lotacao, cpf);
    }

    public void informarReservaAluno(Reserva reserva)
    {
        System.out.println("--- Evento ocorrido em Professor ---");
        System.out.println("Data da reserva: " + reserva.getDataReserva());
        for (Livro livro : reserva.getLivros())
        {
            System.out.println("Livro: " + livro.getTitulo());
        }
        System.out.println();
    }

    public void ocorreuReserva(Reserva reserva)
    {
        informarReservaAluno(reserva);
    }
}