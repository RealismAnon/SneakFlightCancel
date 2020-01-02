package me.realism.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	//Variables to be recalled in messages.
	String version = "1.0";
	
	//Enable Function (On Plug-in Start)
	public void onEnable() {
		System.out.println("\n################################################\nSneak Fly Cancel by Realism v" + version + " has been enabled.\n################################################\n");
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
	}
	
	//Disable Function (On Plug-in Quit)
	public void onDisable() {
		System.out.println("\n################################################\nSneak Fly Cancel by Realism v" + version + " has been disabled.\n################################################\n");
	}
}
