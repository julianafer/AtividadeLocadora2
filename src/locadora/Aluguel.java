package locadora;

import java.util.List;

public class Aluguel {
    public Dvd dvd;
    public int diasAlugado;

    public Aluguel(Dvd dvd, int diasAlugado){
        this.dvd = dvd;
        this.diasAlugado = diasAlugado;
    }

    public String getValorTotal(List<Aluguel> dvdsAlugados){
        double valorTotal = 0.0;
        String resultado = "Registro de Alugueis:\n";
        for (Aluguel aluguel : dvdsAlugados) {
            valorTotal += dvd.calcularValor(diasAlugado);
            resultado += "Filme: " + aluguel.dvd.getTítulo() + " | Dias: " + aluguel.diasAlugado + " |Total: R$" + aluguel.dvd.calcularValor(diasAlugado) + "\n";
        }
        resultado += "Valor total: R$" + valorTotal;
        return resultado;
    }

    public int pontosDeAlugadorFrequente(){
        return dvd.getPontosDeAlugadorFrequente(diasAlugado);
    }

    public int getPontosTotaisDeAlugadorFrequente(List<Aluguel> dvdsAlugados){
        int pontosDeAlugadorFrequente = 0;
        for (Aluguel aluguel : dvdsAlugados) {
            pontosDeAlugadorFrequente += aluguel.pontosDeAlugadorFrequente();
        }
        return pontosDeAlugadorFrequente;
    }

    public String toString(){
        return "O filme " + dvd.getTítulo() + " foi alugado por " + diasAlugado + " dias.";
    }
}
