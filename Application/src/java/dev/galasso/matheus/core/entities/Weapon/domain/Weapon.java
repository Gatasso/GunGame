package java.dev.galasso.matheus.core.entities.Weapon.domain;

import java.dev.galasso.matheus.core.entities.Weapon.interfaces.WeaponActions;

public abstract class Weapon implements WeaponActions {
    protected double basePrice, baseDamage, ammo, blltsOnClip;
    private final int MAX_BLLT_ON_CLIP;

    public Weapon(int basePrice, int baseDamage, int maxAmmo, int blltsOnClip) {
        this.basePrice = basePrice;
        this.baseDamage = baseDamage;
        this.ammo = maxAmmo;
        this.blltsOnClip = this.MAX_BLLT_ON_CLIP = blltsOnClip;
    }

    @Override
    public void shoot() {
        while (/*player.clicks() &&*/ blltsOnClip > 0) {
            blltsOnClip--;
        }
        reload();
    }

    @Override
    public void reload() {
        if (this.ammo < this.MAX_BLLT_ON_CLIP) {
            blltsOnClip = this.ammo;
            this.ammo = 0;
        } else {
            blltsOnClip = this.MAX_BLLT_ON_CLIP;
            this.ammo = this.ammo - this.MAX_BLLT_ON_CLIP;
        }
    }
}
