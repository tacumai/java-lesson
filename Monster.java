public class Monster {
  int hp;

  Monster() {
    this.hp = 100;
    System.out.println("モンスターが出現した");
  }

  public void attack(Hero h) {
    int damegeScore = 2;
    h.hp -= damegeScore;
    System.out.println(h.name + "は" + damegeScore + "のダメージを受けた。残り" + h.hp + "です.");
  }
}
