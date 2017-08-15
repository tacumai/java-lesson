public class Hero extends Combatant {
  String name;
  int hp;

  Hero(String name) {
    super(name);
    System.out.println("勇者 " + name + "が誕生した.");
  }

  public void attack(Monster m) {
    int damegeScore = this.basicDamegeScore;
    m.hp -= damegeScore;
    System.out.println("敵は " + damegeScore + "のダメージを受けた。残り" + m.hp + "です。");
  }
}
