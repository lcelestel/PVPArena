package pvparena.models;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import java.util.*;

public class PVPGame {
    Scoreboard PVPscoreboard = Objects.requireNonNull(Bukkit.getScoreboardManager()).getNewScoreboard();

    Map<String, Team> teams = new HashMap<>();

    public Scoreboard getPVPscoreboard() {
        return PVPscoreboard;
    }

    public void addTeam(String teamName) {
        Team team = PVPscoreboard.registerNewTeam(teamName);
        teams.put(teamName, team);
        team.setPrefix("[" + teamName + "] ");
    }

    public void addPlayer(Player player, String teamName) {
        teams.get(teamName).addEntry(player.getName());
    }



    public void startGame() {
        for (Team team : teams.values()) {
            for(String playerName : team.getEntries()){
                Player player = Bukkit.getPlayer(playerName);
                player.setGameMode(GameMode.SURVIVAL);
            }
        }
    }

    public void deadPlayer (Player player){
        int numberOfTeamAlive = 0;
        Team winnerTeam = null;
        for(Team team : teams.values()){
            for (String playerName : team.getEntries()){
                if(player.getName().equals(playerName)){
                    team.removeEntry(playerName);
                    break;
                }
            }
            if(!team.getEntries().isEmpty()){
                numberOfTeamAlive++;
                winnerTeam = team;
            }
        }
        if(numberOfTeamAlive == 1){
            for(Player p : Bukkit.getOnlinePlayers()){
                p.sendMessage("Victoire de l'equipe" + winnerTeam.getName());
            }
        }
    }










}
