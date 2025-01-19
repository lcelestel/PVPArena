package pvparena.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import pvparena.PVPArena;
import pvparena.models.PVPGame;

public class PlayerDead implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        PVPArena.getGame().deadPlayer(e.getEntity());
    }
}
