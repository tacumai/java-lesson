public abstract class Combatant {
  String name;
  int hp;
  int basicDamegeScore;

  Combatant(String name) {
    this.name = name;
    this.hp = 100;
    this.basicDamegeScore = 10;
  }

  public abstract void tackle(Monster m);

  protected final void attack(int score, Monster m) {
    m.hp -= score;
  }
}
