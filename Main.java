public class Main {
  public static void main(String[] args){
    System.out.println("Game started...!");
    Hero yoshihiko = new Hero("よしひこ");
    Wizard anna = new Wizard("あんな");
    Monster matango = new Monster();
    yoshihiko.attack(matango);
    anna.merazoma(matango);
  }
}
