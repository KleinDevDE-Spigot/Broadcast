package de.maxcron.xylit.broadcaster.Commands;

import de.maxcron.xylit.broadcaster.main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * ========================
 * Produced by Xylit
 * 2017
 * ========================
 */
public class Reload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission(main.cfg.getString("PermissionReload"))){
            main.plugin.reloadConfig();
            sender.sendMessage(main.cfg.getString("MessageReload").replaceAll("&", "§"));
        } else sender.sendMessage(main.cfg.getString("MessageNoPermission").replaceAll("&", "§"));
        return false;

    }
}
