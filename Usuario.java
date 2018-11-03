import javax.swing.JOptionPane;

abstract class Usuario implements IAutenticacao
{
    private String login;
    private String senha;
    protected String nome;

    public Usuario(String nome, String login, String senha)
    {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public boolean autenticar()
    {
        return true;
    }

    public void sair()
    {
        JOptionPane.showMessageDialog(null, "Você saiu com sucesso.", "Sair", JOptionPane.INFORMATION_MESSAGE);
    }
}