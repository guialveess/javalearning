package Vehicle;

public class Motorcycle implements Vehicle { // Override Novamente

    @Override
    public void acelerar() {
      System.out.println("Acelerando a moto");
    }

    @Override
    public void frear() {
        System.out.println("Freiando a moto");
    }

}