package pvparena.commandes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pvparena.PVPArena;

public class CreateTeamCommande implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        PVPArena.getGame().addTeam(strings[0]);
        return true;
    }
}
