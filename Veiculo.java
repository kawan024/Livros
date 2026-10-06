// Veiculo.java
public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void buzinar() {
        System.out.println("Bi bi!");
    }
}

// Carro.java
public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Portas: " + quantidadePortas);
    }
}