interface IReservouLivro
{
	public void Adicionar(ILivroReservado consumidor);
	public void Notificar(Reserva reserva);
}