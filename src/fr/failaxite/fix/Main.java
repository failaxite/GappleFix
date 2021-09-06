package fr.failaxite.fix;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new GappleFix(), this);
		
	}
	public void onDisable() {
		
	}

}

