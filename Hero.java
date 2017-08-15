public class Hero {
  String name;
  int hp;

  Hero(String name) {
    this.name = name;
    this.hp = 100;
    System.out.println("勇者 " + name + "が誕生した.");
  }

  public void attack(Monster m) {
    int damegeScore = 10;
    m.hp -= damegeScore;
    System.out.println("敵は " + damegeScore + "のダメージを受けた。残り" + m.hp + "です。");
  }
}
