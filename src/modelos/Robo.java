package modelo;

public class Robo {
    private Sensor sensor;
    private Motor motor;
    private Controlador controlador;

    public Robo() {
        this.sensor = new SensorDeLuz();
        this.motor = new Motor();
        this.controlador = new ControladorDeMovimento(sensor, motor);
    }

    public void iniciar() {
        System.out.println("Robô iniciado!");
        controlador.controlar();
    }
}
