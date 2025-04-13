package Vehicle;

public class TesteVehicle {
    public static void main(String[] args) {
        Vehicle carro = new Car();
        Vehicle moto = new Motorcycle();

        carro.acelerar();
        carro.frear();
        moto.acelerar();
        moto.frear();
    }
}
