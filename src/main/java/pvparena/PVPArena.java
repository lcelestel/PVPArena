package pvparena;

import org.bukkit.plugin.java.JavaPlugin;
import pvparena.commandes.CreateTeamCommande;
import pvparena.commandes.JoinTeamCommande;
import pvparena.models.PVPGame;

public final class PVPArena extends JavaPlugin {

    private static PVPGame game = new PVPGame();

    public static PVPGame getGame() {
        return game;
    }

    @Override
    public void onEnable() {
        this.getCommand("joinTeam").setExecutor(new JoinTeamCommande());
        this.getCommand("createTeam").setExecutor(new CreateTeamCommande());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
