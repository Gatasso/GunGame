package java.dev.galasso.matheus.core.entities.Player;

public class Budget {
    private final int INITIAL_BUDGET = 800;
    private double budget;

    public Budget(double budget) {
        this.budget = INITIAL_BUDGET;
    }


    public double getBudget() {
        return budget;
    }
}
