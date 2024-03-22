package locadora;

public interface Dvd {
 
    public String getTítulo();
    public Classificacao getTipo();
    public String toString();
    public double calcularValor(int diasAlugados);

    public int getPontosDeAlugadorFrequente(int dias);
}