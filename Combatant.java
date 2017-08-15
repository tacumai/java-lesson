public abstract class Combatant {
  String name;
  int hp;

  Combatant(String name) {
    this.name = name;
    this.hp = 100;
  }

  public abstract void tackle(Monster m);

  protected final void attack(int score, Monster m) {
    m.hp -= score;
  }
}
