package java.dev.galasso.matheus.core.entities.Weapon.domain;

public class Knife extends Weapon{
    public Knife(int basePrice, int baseDamage, int maxAmmo, int blltsOnClip) {
        super(0, 25, 1, 1);
    }

    @Override
    public void shoot() {

    }

    @Override
    public void reload() {

    }
}
