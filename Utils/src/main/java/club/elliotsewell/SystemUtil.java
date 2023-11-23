package club.elliotsewell;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class SystemUtil {

    public static void log(String logMessage) {
        Bukkit.getConsoleSender().sendMessage(F.log(logMessage));

    }

    public static ArrayList<Player> getAllPlayers() {
        return (ArrayList<Player>) Bukkit.getOnlinePlayers();
    }

}
