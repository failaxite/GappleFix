package fr.failaxite.fix;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GappleFix implements Listener {
	@EventHandler
	public void onGapple(PlayerItemConsumeEvent e) {
	 if(e.getPlayer() instanceof Player) {
		 if(e.getItem().getType().equals(Material.GOLDEN_APPLE)) {
			 e.setCancelled(true);
			 e.getPlayer().getInventory().removeItem(new ItemStack(e.getItem().getType(), 1));
			 e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 120*20 , 0), true);
			 e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 4*20 , 0), true);
		 }
		 
	 }
	}

}
