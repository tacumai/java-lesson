public class Wizard extends Combatant {
  String name;
  int hp;

  Wizard(String name) {
    super(name);
    System.out.println("魔法使い " + name + "が誕生した.");
  }

  public void attack(Monster m) {
    int damegeScore = this.basicDamegeScore;
    m.hp -= damegeScore;
    System.out.println(this.name + "の攻撃");
    System.out.println("敵は " + damegeScore + "のダメージを受けた。残り" + m.hp + "です。");
  }

  public void merazoma(Monster m) {
    int damegeScore = 30;
    m.hp -= damegeScore;
    System.out.println(this.name + "はメラゾーマを放った.");
    System.out.println("敵は " + damegeScore + "のダメージを受けた。残り" + m.hp + "です。");
  }
}
