package me.realism.testplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class EventsClass implements Listener {
	
	@EventHandler
	public void onMove(PlayerMoveEvent event) {
			Player player = event.getPlayer();
			if (!player.isSneaking() && !player.getAllowFlight()) {
				player.setAllowFlight(true);
			} else if (player.isSneaking() && player.getAllowFlight()) {
				player.setAllowFlight(false);
			}
		}
	}
	