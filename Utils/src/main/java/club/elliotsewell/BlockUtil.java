package club.elliotsewell;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class BlockUtil {

    public static boolean solid(Block block) {
        if (block == null) {
            return false;
        } else if (block.getType().isSolid()) {
            return true;
        } else {
            return false;
        }
    }

}
