package java.dev.galasso.matheus.core.entities.Weapon.domain;

public class Pistola extends Weapon {
    double damage,price;
    public Pistola(int basePrice, int baseDamage, int maxAmmo, int blltsOnClip) {
        super(400, 25, 32, 10);
    }
}
