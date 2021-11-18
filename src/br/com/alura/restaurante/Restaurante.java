package br.com.alura.restaurante;

public class Restaurante {

    private String NomeDaComida;
    private  double valor;
    public Restaurante(String nomeDaComida, double valor){
        this.NomeDaComida = nomeDaComida;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNomeDaComida() {
        return NomeDaComida;
    }
    @Override
    public String toString() {return "Prato: " + this.NomeDaComida + " valor: " + this.valor ; }


//    @Override
//    public int compareTo(Restaurante outroPrato) {
//        return this.NomeDaComida.compareTo(outroPrato.NomeDaComida);
//    }
}
