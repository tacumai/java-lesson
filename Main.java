public class Main {
  public static void main(String[] args){
    // Test
    System.out.println("Game started...!");
    Hero yoshihiko = new Hero("よしひこ");
    Wizard anna = new Wizard("あんな");
    Monster matango = new Slime();
    Slime s = new Slime();
    yoshihiko.tackle(matango);
    anna.tackle(matango);
    anna.merazoma(matango);
  }
}
