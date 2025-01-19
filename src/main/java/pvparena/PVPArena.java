package pvparena;

import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import pvparena.commandes.CreateTeamCommande;
import pvparena.commandes.JoinTeamCommande;
import pvparena.commandes.StartGameCommande;
import pvparena.listener.PlayerDead;
import pvparena.listener.PlayerJoin;
import pvparena.models.PVPGame;

public final class PVPArena extends JavaPlugin {

    private static PVPGame game = new PVPGame();

    public static PVPGame getGame() {
        return game;
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerDead(), this);
        this.getCommand("joinTeam").setExecutor(new JoinTeamCommande());
        this.getCommand("createTeam").setExecutor(new CreateTeamCommande());
        this.getCommand("startGame").setExecutor(new StartGameCommande());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
