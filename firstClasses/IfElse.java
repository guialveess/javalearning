package firstClasses;
public class IfElse {
    public static void main(String[] args) {
      int dadoDoTipoint = 10;
      if(dadoDoTipoint == 10) {
        System.out.println("O valor é igual a 10");
      } else if(dadoDoTipoint > 10) {
        System.out.println("O valor é maior que 10");
      } else {
        System.out.println("O valor é menor que 10");
      }
      while (dadoDoTipoint < 20) {
        System.out.println("O valor é menor que 20");
        dadoDoTipoint++;
      }
    }
}

