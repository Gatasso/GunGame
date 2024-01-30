package java.dev.galasso.matheus.core.entities.Player;

import java.dev.galasso.matheus.core.entities.Weapon.domain.Knife;
import java.dev.galasso.matheus.core.entities.Weapon.domain.Pistol;
import java.dev.galasso.matheus.core.entities.Weapon.domain.Weapon;

public class Kit {
    private Weapon meelee;
    private Weapon secondary;
    private Weapon mainGun;

    public Kit(Weapon melee, Weapon secondary, Weapon mainGun) {
        this.meelee = melee;
        this.secondary = secondary;
        this.mainGun = mainGun;
    }

    public Weapon getMeelee() {
        return meelee;
    }

    public Weapon getSecondary() {
        return secondary;
    }

    public Weapon getMainGun() {
        return mainGun;
    }
}
