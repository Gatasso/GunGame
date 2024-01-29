package java.dev.galasso.matheus.core.entities.Weapon.domain;

import java.dev.galasso.matheus.core.entities.Weapon.interfaces.WeaponActions;

public abstract class Weapon implements WeaponActions {
    private String name;
    protected double basePrice, baseDamage, maxAmmo, blltsOnClip;

    public Weapon(int basePrice, int baseDamage, int maxAmmo, int blltsOnClip) {
        this.basePrice = basePrice;
        this.baseDamage = baseDamage;
        this.maxAmmo = maxAmmo;
        this.blltsOnClip = blltsOnClip;
    }

    @Override
    public void shoot() {

    }

    @Override
    public void reload() {

    }

    @Override
    public boolean aim() {
        return false;
    }
}
