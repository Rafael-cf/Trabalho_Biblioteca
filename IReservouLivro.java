interface IReservouLivro
{
	public void adicionar(ILivroReservado consumidor);
	public void notificar(Reserva reserva);
	public void remover(ILivroReservado consumidor);
}