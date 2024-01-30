package java.dev.galasso.matheus.core.entities.Player;

import java.dev.galasso.matheus.core.entities.Weapon.domain.Weapon;

public class Player {
    private int idOnServer;
    private final int HEALTH_INITIAL = 100;
    private Budget budget;
    private Kit kit;

    public Player(int idOnServer, Budget budget, Kit kit) {
        this.idOnServer = idOnServer;
        this.budget = budget;
        this.kit = kit;
    }

    public int getIdOnServer() {
        return idOnServer;
    }

    public int getHEALTH_INITIAL() {
        return HEALTH_INITIAL;
    }

    public Budget getBudget() {
        return budget;
    }

    public Kit getKit() {
        return kit;
    }
}
