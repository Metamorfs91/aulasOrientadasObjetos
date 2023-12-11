package entities;

public class Empregado {
    private Integer id;
    private String nome;
    private Double Salario;

    public Empregado() {
    }

    public Empregado(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        Salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public void AumentoSalario(double porcentagem) {
        Salario = Salario + Salario * porcentagem / 100.00;
    }
}
