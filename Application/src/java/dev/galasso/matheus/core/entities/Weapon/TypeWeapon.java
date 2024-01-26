package java.dev.galasso.matheus.core.entities.Weapon;

public enum TypeWeapon {
    KNIFE(50,0,0,0),
    PISTOL(25,10,30,600),
    SUB(35,35,105,1500),
    HEAVY(60,6,24,2300),
    RIFLE(45,30,90,2700);

    private final int BASE_DMG, MAX_BLLT_ON_CLIP, MAX_AMMO, BASE_PRICE;

    TypeWeapon(int BASE_DMG, int MAX_BLLT_ON_CLIP, int MAX_AMMO, int BASE_PRICE) {
        this.BASE_DMG = BASE_DMG;
        this.MAX_BLLT_ON_CLIP = MAX_BLLT_ON_CLIP;
        this.MAX_AMMO = MAX_AMMO;
        this.BASE_PRICE = BASE_PRICE;
    }

    public int getBASE_DMG() {
        return BASE_DMG;
    }

    public int getMAX_BLLT_ON_CLIP() {
        return MAX_BLLT_ON_CLIP;
    }

    public int getMAX_AMMO() {
        return MAX_AMMO;
    }

    public int getBASE_PRICE() {
        return BASE_PRICE;
    }
}
