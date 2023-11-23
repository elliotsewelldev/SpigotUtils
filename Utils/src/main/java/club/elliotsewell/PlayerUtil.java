package club.elliotsewell;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class PlayerUtil {

    public static void message(Player player, String message) {
        player.sendMessage(message);
    }

    public static String playerUuidString(Player player) {
        return player.getUniqueId().toString();
    }

    public static String playerAddressString(Player player) {
        return player.getAddress().toString().replace("/", "");
    }

    public static Player getPlayer(String string) {
        return Bukkit.getPlayer(string);
    }

    public static Player getPlayer(UUID uuid) {
        return Bukkit.getPlayer(uuid);
    }

    public static void giveItem(Player player, ItemStack item, String name, int slot) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        player.getInventory().setItem(slot, item);
    }

    public static void giveArmour(Player player, ItemStack helmet, ItemStack chestplate, ItemStack leggings, ItemStack boots) {
        player.getInventory().setHelmet(helmet);
        player.getInventory().setChestplate(chestplate);
        player.getInventory().setLeggings(leggings);
        player.getInventory().setBoots(boots);
    }

    public static void clearInv(Player player) {
        player.getInventory().setHelmet(null);
        player.getInventory().setChestplate(null);
        player.getInventory().setLeggings(null);
        player.getInventory().setBoots(null);
        player.getInventory().clear();
    }

}
