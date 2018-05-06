package de.maxcron.xylit.broadcaster.Commands;

import de.maxcron.xylit.broadcaster.Tools.Time;
import de.maxcron.xylit.broadcaster.main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * ========================
 * Produced by Xylit
 * 2017
 * ========================
 */
public class Broadcast implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("bc")){
            if (sender.hasPermission(main.cfg.getString("PermissionBase"))){
                if (args.length == 0){
                    sender.sendMessage(main.cfg.getString("MessageBase").replaceAll("&", "§"));
                    sender.sendMessage("§7Version: " + main.plugin.getDescription().getVersion());
                    //Update Checker
                } else {
                    String satz = "";
                    for (int i = 0; i < args.length; i++) {
                        satz = satz + args[i] + " ";
                    }
                    if (!main.cfg.getString("Message").contains("%message%")){
                        sender.sendMessage("§7[§3Broadcaster§8] §cERROR! - The Variable \"%message%\" doesnt exist");
                        sender.sendMessage("§7Please Check the Config in the Section \"Message\"");
                    } else {
                        for (Player p : Bukkit.getOnlinePlayers()) {
                            if (!p.hasPermission(main.cfg.getString("PermissionBypass")) || p.isOp()) {
                                p.sendMessage(main.cfg.getString("Message").replaceAll("&", "§").replaceAll("%player%", sender.getName()).replaceAll("%message%", satz).replaceAll("%time%", Time.UhrzeitohneSekunde));
                            }
                        }
                    }
                }
            } else sender.sendMessage(main.cfg.getString("MessageNoPermission").replaceAll("&", "§"));
        }
    return false;}
}
