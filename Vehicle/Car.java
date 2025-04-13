package Vehicle;

public class Car implements Vehicle {  // Quando é uma implementação de interface, eu preciso implementar os metodos de Vehicle (Override)

    @Override
    public void acelerar() {
      System.out.println("Acelerando o carro");
    }

    @Override
    public void frear() {
        System.out.println("Freiando o carro");
    } 

}
