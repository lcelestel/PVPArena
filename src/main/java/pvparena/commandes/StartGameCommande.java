package pvparena.commandes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pvparena.PVPArena;

public class StartGameCommande implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        PVPArena.getGame().startGame();
        return true;
    }
}
