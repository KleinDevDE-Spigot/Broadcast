package de.maxcron.xylit.broadcaster.Commands;

import de.maxcron.xylit.broadcaster.main;
import de.maxcron.xylit.broadcaster.Tools.Downloader;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * ========================
 * Produced by Xylit
 * 2017
 * ========================
 */
public class Update implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission(main.cfg.getString("PermissionUpdate"))){
            Downloader.updateDownload("http://files.maxcron.de/SpigotPlugin/Broadcaster/Broadcaster-LATEST.jar", sender);
        } else sender.sendMessage(main.cfg.getString("MessageNoPermission").replaceAll("&", "§"));
        return false;
    }
}
