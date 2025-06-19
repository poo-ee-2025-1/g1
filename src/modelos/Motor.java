package modelo;

public class Motor {
    private int potencia;

    public void girarParaFrente() {
        System.out.println("Motor girando para frente!");
    }

    public void parar() {
        System.out.println("Motor parado.");
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
