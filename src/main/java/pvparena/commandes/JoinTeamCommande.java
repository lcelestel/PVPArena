package pvparena.commandes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pvparena.PVPArena;
import pvparena.models.PVPGame;

public class JoinTeamCommande implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player ){
            Player p = (Player) commandSender;
             PVPArena.getGame().addPlayer(p,strings[0]);
             return true;
        }
        return false;
    }
}
