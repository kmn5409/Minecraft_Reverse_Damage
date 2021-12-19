package me.keanunichols.reverseattack;

import java.util.Random;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class attackListener implements Listener {
	
	
	public boolean getRandomBoolean() {
	    Random random = new Random();
	    return random.nextBoolean();
	}
	
	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent event){
		Entity entity = event.getDamager();
		if(entity instanceof Player) {
			if(getRandomBoolean()) {
				Double damage = event.getDamage();
				((Player) entity).damage(damage/3);
				//entity.sendMessage("Got you");
			}
		}
		
		
	}

}
