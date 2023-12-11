package Entidade;

public class Calculo {

    private double ValorInicial;
    private double TxJuros;
    private double Periodo;

     public void Claculo(double ValorInicial, double TxJuros, double Periodo) {
        this.ValorInicial = ValorInicial;
        this.TxJuros = TxJuros;
        this.Periodo = Periodo;
    }
    public double simples (){
        return (ValorInicial*TxJuros*Periodo)/100;
    }
}
