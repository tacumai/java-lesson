public class Wizard extends Combatant {
  int damegeScore = 3;

  Wizard(String name) {
    super(name);
    System.out.println("魔法使い " + name + "が誕生した.");
  }

  public void tackle(Monster m) {
    attack(damegeScore, m);
    System.out.println(this.name + "がタックルした。");
    System.out.println("敵は " + this.damegeScore + "のダメージを受けた。残り" + m.hp + "です。");
  }

  public void merazoma(Monster m) {
    int damege = 30;
    attack(damege, m);
    System.out.println(this.name + "はメラゾーマを放った.");
    System.out.println("敵は " + damege + "のダメージを受けた。残り" + m.hp + "です。");
  }
}
