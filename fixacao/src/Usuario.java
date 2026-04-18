public class Usuario {

    private String nome;
    private double valor;
    private final int codigo;
    private double saldo;

    public Usuario(String nome, int codigo, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.saldo = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Conta "
                + codigo
                + ", Proprietário: "
                + nome
                + ", Saldo: $ "
                + saldo;
    }

    public void deposito() {
        saldo = saldo + valor;
    }

    public void saque() {
        double taxa = 5.0;
        saldo = saldo - valor - taxa;
    }
}
