package java.dev.galasso.matheus.core.entities.Weapon;

public class Weapon implements WeaponActions {
    private TypeWeapon weapon;
    private String name;
    private int blttOnClip, totalAmmo;

    @Override
    public void shoot() {
        while (/*player.clicks() &&*/ blttOnClip > 0) {
            blttOnClip--;
            if (blttOnClip == 0/*||player.chooseReload*/) {
                reload();
            }
        }
    }

    @Override
    public void reload() {
        if (totalAmmo < weapon.getMAX_BLLT_ON_CLIP()) {
            blttOnClip = totalAmmo;
            totalAmmo = 0;
        } else {
            blttOnClip = weapon.getMAX_BLLT_ON_CLIP();
            totalAmmo = totalAmmo - weapon.getMAX_BLLT_ON_CLIP();
        }
    }

    @Override
    public boolean aim() {
        return false;
    }
}
