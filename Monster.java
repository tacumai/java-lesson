public class Monster {
  int hp;
  int damegeScore = 0;

  Monster() {
    this.hp = 50;
  }

  public void attack(Hero h) {
    h.hp -= damegeScore;
    System.out.println(h.name + "は" + damegeScore + "のダメージを受けた。残り" + h.hp + "です.");
  }
}
