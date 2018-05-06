package de.maxcron.xylit.broadcaster;

import de.maxcron.xylit.broadcaster.Commands.Broadcast;
import de.maxcron.xylit.broadcaster.Commands.Reload;
import de.maxcron.xylit.broadcaster.Commands.Update;
import de.maxcron.xylit.broadcaster.Listener.PlayerJoin;
import de.maxcron.xylit.broadcaster.Tools.Config;
import de.maxcron.xylit.broadcaster.Tools.UpdateChecker;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * ========================
 *     Produced by Xylit
 *          2017
 * ========================
 */
public class main extends JavaPlugin {
    public static FileConfiguration cfg;
    public static Plugin plugin;

    public void onEnable(){
        saveDefaultConfig();
        cfg = getConfig();
        plugin = this;
        UpdateChecker.checkUpdateonStart();
        preSetup();
        Config.copy("README.txt");
    }

    public void onDisable(){

    }

    private void preSetup(){
        this.getCommand("bc").setExecutor(new Broadcast());
        this.getCommand("broadcast").setExecutor(new Broadcast());
        this.getCommand("bcreload").setExecutor(new Reload());
        this.getCommand("bcupdate").setExecutor(new Update());
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
    }
}
