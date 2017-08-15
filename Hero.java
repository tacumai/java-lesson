public class Hero extends Combatant {
  int damegeScore;

  Hero(String name) {
    super(name);
    this.damegeScore = 15;
    System.out.println("勇者 " + this.name + "が誕生した.");
  }

  public void tackle(Monster m) {
    attack(this.damegeScore, m);
    System.out.println(this.name + "は攻撃した!");
    System.out.println("敵は " + damegeScore + "のダメージを受けた。残り" + m.hp + "です。");
  }
}
